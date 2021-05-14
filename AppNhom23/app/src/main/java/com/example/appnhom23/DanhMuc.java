package com.example.appnhom23;

public class DanhMuc {
    private String tenDM;
    private int hinh;

    public DanhMuc(String tenDM, int hinh) {
        this.tenDM = tenDM;
        this.hinh = hinh;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
