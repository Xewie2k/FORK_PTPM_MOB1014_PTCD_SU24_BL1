/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_KeThua;

/**
 *
 * @author hangnt
 */
// Cay lua ke thua tu ThucVat => extends
public class CayLua extends ThucVat {

    private int sanLuongMoiNam; // Thuoc tinh rieng 

    // Cay lua co bn thuoc tinh: 7 thuoc tinh(6 tt chung + 1 tt rieng)
    public CayLua() {
    }

    public CayLua(int sanLuongMoiNam, String ma, String ten, int gioiTinh, double canNang, int chieuCao, String loai) {
        super(ma, ten, gioiTinh, canNang, chieuCao, loai);
        this.sanLuongMoiNam = sanLuongMoiNam;
    }

    public int getSanLuongMoiNam() {
        return sanLuongMoiNam;
    }

    public void setSanLuongMoiNam(int sanLuongMoiNam) {
        this.sanLuongMoiNam = sanLuongMoiNam;
    }

    public void display() {
        // in tt cua cay lua 7
        System.out.println("San luong moi nam" + sanLuongMoiNam);
        // goi ham/ bien cua class cha => super 
        super.display(); // Goi cac thuoc tinh cua class Cha 
    }
}
