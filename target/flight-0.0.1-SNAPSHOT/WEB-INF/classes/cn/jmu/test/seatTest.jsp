<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选座测试</title>
 <%  pageContext.setAttribute("APP_PATH",request.getContextPath());%>
 <!-- 引入jquery样式 -->
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/js/jquery.seat-charts.js"></script>
	<link type="text/css" href="${APP_PATH}/static/css/jquery.seat-charts.css" rel="stylesheet">
	<link type="text/css" href="${APP_PATH}/static/css/style.css" rel="stylesheet">
</head>
<body>
<div class="wrapper">
	<div class="container">
		<div id="seat-map">
			<div class="front-indicator">机首</div>
		</div>
		<div class="booking-details">
			<h2>在线值机选座</h2>
			<div id="legend"></div>
			<h3> 我的选座（<span id="counter">0</span>）:</h3>
			<ul id="curSelected"></ul>
			<ul id="selected-seats"></ul>
			<button class="checkout-button">确认</button>
		</div>
	</div>
</div>
<script>
	var firstSeatLabel = 1;
	$(document).ready(function() {
		var $cart = $('#selected-seats'),
			$counter = $('#counter'),
			$total = $('#total'),
			sc = $('#seat-map').seatCharts({
			map: [
				'f_f_f_f',
				'f_f_f_f',
				'f_f_f_f',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
				'eee_eee',
			],
			seats: {
				f: {
					classes : 'first-class', //your custom CSS class
					category: '头等舱'
				},
				e: {
					classes : 'economy-class', //your custom CSS class
					category: '经济舱'
				}					
			},
			naming : {
				top : false,
				getLabel : function (character, row, column) {
					return firstSeatLabel++;
				},
			},
			legend : {
				node : $('#legend'),
			    items : [
					[ 'f', 'available',   '头等舱' ],
					[ 'e', 'available',   '经济舱'],
					[ 'n', 'unavailable', '已选定']
			    ]					
			},
			click: function () {
				if (this.status() == 'available') {
					//let's create a new <li> which we'll add to the cart items
					$('<li>'+this.data().category+' Seat # '+this.settings.label+': <b>$'+this.data().price+'</b> <a href="#" class="cancel-cart-item">[cancel]</a></li>')
						.attr('id', 'cart-item-'+this.settings.id)
						.data('seatId', this.settings.id);
					/*
					 * Lets update the counter and total
					 *
					 * .find function will not find the current seat, because it will change its stauts only after return
					 * 'selected'. This is why we have to add 1 to the length and the current seat price to the total.
					 */
					$counter.text(sc.find('selected').length+1);
					//
					var s=document.getElementById(this.settings.id).innerText ;
					$("#curSelected").append($("<li></li>").html(this.data().category+s).attr("id","li"+this.settings.id));
					return 'selected';
				} else if (this.status() == 'selected') {
					//update the counter
					$counter.text(sc.find('selected').length-1);
					//remove the item from our cart
					$('#cart-item-'+this.settings.id).remove();
					//seat has been vacated
					document.getElementById("li"+this.settings.id).remove();
					return 'available';
				} else if (this.status() == 'unavailable') {
					//seat has been already booked
					return 'unavailable';
				} else {
					return this.style();
				}
			}
		});
		//this will handle "[cancel]" link clicks
		$('#selected-seats').on('click', '.cancel-cart-item', function () {
			//let's just trigger Click event on the appropriate seat, so we don't have to repeat the logic here
			sc.get($(this).parents('li:first').data('seatId')).click();
		});
		//let's pretend some seats have already been booked
		sc.get(['1_1', '4_1','10_7','7_2', '13_5']).status('unavailable');
	});
	function refreshList(sc) {
		$("#curSelected").empty();
		sc.find('selected').each(function () {
			var s=document.getElementById(this.settings.id).innerText ;
			$("#curSelected").append($("<li></li>").html(this.data().category+s));
		});
	}
</script>
</body>
</html>