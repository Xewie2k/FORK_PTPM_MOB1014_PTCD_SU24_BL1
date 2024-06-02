/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_MangDong.P1_OnTap;

/**
 *
 * @author hangnt
 */
public class LopHoc {
//    - LopHoc gồm các thuộc tính : 
    // ten-String, toa-String, diaChi-String, 
    // dienTich - int và các constructor, getter,
    // setter và hàm inThongTin(): void  

    private String ten; // null
    private String toa;
    private String diaChi;
    private int dienTich; // 0
    // float double => 0.0

    // contructor : khoi tao 1 doi tuong (new)
    public LopHoc() {
    }

    public LopHoc(String ten, String toa, String diaChi, int dienTich) {
        this.ten = ten;
        this.toa = toa;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    // getter: lay ra tt cua thuoc tinh bat ky
    public String getTen() {
        return ten;
    }

    // setter: thay doi tt cua thuoc tinh bat ky
    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "ten=" + ten + ", toa=" + toa + ", diaChi=" + diaChi + ", dienTich=" + dienTich + '}';
    }

    public void inThongTin() {
        System.out.println(toString());
    }
}
