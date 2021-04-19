package com.example.appnhom23;

public class MonAn {
    private String tenMon;
    private String moTa;
    private int hinh;

    public MonAn(String tenMon, String moTa, int hinh) {
        this.tenMon = tenMon;
        this.moTa = moTa;
        this.hinh = hinh;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
