package com.example.duan1_n6_cp17303.DTO_N6_CP17303;

import java.io.Serializable;

public class SanPhamDTO implements Serializable {
    int idsanpham;
    String tensanpham;
    Float giatien;
    int soluong;
    String anhsanpham;
    String thongtin;
    int idbinhluan;

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public Float getGiatien() {
        return giatien;
    }

    public void setGiatien(Float giatien) {
        this.giatien = giatien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getAnhsanpham() {
        return anhsanpham;
    }

    public void setAnhsanpham(String anhsanpham) {
        this.anhsanpham = anhsanpham;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public int getIdbinhluan() {
        return idbinhluan;
    }

    public void setIdbinhluan(int idbinhluan) {
        this.idbinhluan = idbinhluan;
    }
}