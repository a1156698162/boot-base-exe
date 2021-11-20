package com.xiaoruyuan.domain;

public class Exe {
    private Integer exeId;
    private String exeName;
    private Integer queId;
    private Double exePrice;

    public Exe() {
    }

    public Exe(Integer exeId, String exeName, Integer queId, Double exePrice) {
        this.exeId = exeId;
        this.exeName = exeName;
        this.queId = queId;
        this.exePrice = exePrice;
    }

    public Integer getExeId() {
        return exeId;
    }

    public void setExeId(Integer exeId) {
        this.exeId = exeId;
    }

    public String getExeName() {
        return exeName;
    }

    public void setExeName(String exeName) {
        this.exeName = exeName;
    }

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public Double getExePrice() {
        return exePrice;
    }

    public void setExePrice(Double exePrice) {
        this.exePrice = exePrice;
    }

    @Override
    public String toString() {
        return "ExeController{" +
                "exeId=" + exeId +
                ", exeName='" + exeName + '\'' +
                ", queId=" + queId +
                ", exePrice=" + exePrice +
                '}';
    }
}
