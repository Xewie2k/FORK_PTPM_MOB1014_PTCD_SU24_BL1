/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B2_VongLap_OOP.P2_OOP.B2;

/**
 *
 * @author hangnt
 */
public class DongVat {
//     ma - String , ten - String, canNang - double, chieuCao - int, khuVucSong - String

    private String ma;
    private String ten;
    private double canNang;
    private int chieuCao;
    private String khuVucSong;

    public DongVat() {
    }

    public DongVat(String ma, String ten, double canNang, int chieuCao, String khuVucSong) {
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.khuVucSong = khuVucSong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    @Override
    public String toString() {
        return "DongVat{" + "ma=" + ma + ", ten=" + ten + ","
                + " canNang=" + canNang + ", "
                + "chieuCao=" + chieuCao + ","
                + " khuVucSong=" + khuVucSong + '}';
    }

    public void inThongTin() {
        System.out.println(toString());
    }
}
