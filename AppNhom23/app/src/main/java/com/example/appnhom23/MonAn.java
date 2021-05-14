package com.example.appnhom23;

public class MonAn {
    public MonAn(String tenmon, int hinh) {
        this.tenmon = tenmon;
        this.hinh = hinh;
    }

    private String tenmon;

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    private int hinh;

}
