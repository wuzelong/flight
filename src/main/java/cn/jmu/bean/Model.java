package cn.jmu.bean;

public class Model {
    private String modelid;

    private String modelname;

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }
}