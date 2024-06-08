/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_KeThua;

/**
 *
 * @author hangnt
 */
public class ThucVat {

    // ma - String, ten - String, gioiTinh-int (1-Đực, 2- Cái) ,
    // canNang - double, chieuCao - int, loai - String
    private String ma;
    private String ten;
    private int gioiTinh;
    private double canNang;
    private int chieuCao;
    private String loai;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, int gioiTinh, double canNang, int chieuCao, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.loai = loai;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

//    public String chuyenDoiGioiTinh() {
//        if (gioiTinh == 1) {
//            return "Duc";
//        }
//        return "Cai";
//    }
    // toan tu 3 ngoi 
    // menh de ? "ket qua cua viec menh de dung" : "gia khi con lai khi menh de sai"
    @Override
    public String toString() {
        return "ThucVat{" + "ma=" + ma + ", ten=" + ten + ", "
                + "gioiTinh=" + (gioiTinh == 1 ? "Duc" : "Cai") + ", "
                + "canNang=" + canNang + ", "
                + "chieuCao=" + chieuCao + ", "
                + "loai=" + loai + '}';
    }

    public void display() {
        System.out.println(toString());
    }
}
