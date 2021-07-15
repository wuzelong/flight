package cn.jmu.test;

import com.aliyuncs.exceptions.ClientException;

import cn.jmu.utils.AliyunSmsUtils;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AliyunSmsUtils aliyunSmsUtils=new AliyunSmsUtils();
		try {
			aliyunSmsUtils.sendSms("13639023313", "648176");
		} catch (ClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
	}

}
