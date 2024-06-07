/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B4_BaiMau;

/**
 *
 * @author hangnt
 */
public class Nguoi {
//    ten - String , tuoi - int, gioiTinh - int ( 0-Nữ, 1- Nam), queQuan - String , ngheNghiep - String

    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String ngheNghiep;
    
    public Nguoi() {
    }
    
    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String ngheNghiep) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public int getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getQueQuan() {
        return queQuan;
    }
    
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    public String getNgheNghiep() {
        return ngheNghiep;
    }
    
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    
    public String chuyenDoiGioiTinh(int gioiTinh) {
        if (gioiTinh == 1) {
            return "Nam";
        }
        return "Nu";
    }

//    @Override
//    public String toString() {
//        return "Nguoi{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + chuyenDoiGioiTinh(gioiTinh) + ", queQuan=" + queQuan + ", ngheNghiep=" + ngheNghiep + '}';
//    }
    public void inThongTin() {
        // 1 la in cac tt cua class
//        System.out.println(toString());
        System.out.println("Ten = " + ten);
        System.out.println("Tuoi = " + tuoi);
        System.out.println("Gioi tinh = " + chuyenDoiGioiTinh(gioiTinh));
    }
}
