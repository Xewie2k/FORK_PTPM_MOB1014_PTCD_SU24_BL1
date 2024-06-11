/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B8_ChuaDeThiThu;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private String noiSong;

    public DongVat() {
    }

    public DongVat(String maDongVat, String tenDongVat, int canNang, String noiSong) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    @Override
    public String toString() {
        return "DongVat{" + "maDongVat=" + maDongVat + ", tenDongVat=" + tenDongVat + ", canNang=" + canNang + ", noiSong=" + noiSong + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
