/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B6_ChuaBaiMauFullChucNang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class ThucVatService {

    // 10 chuc nang 
    public void themThucVat(ArrayList<ThucVat> lists) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Moi nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Moi nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Moi nhap loai cay:");
            String loaiCay = sc.nextLine();
            System.out.println("Moi nhap khu vuc song:");
            String khuVucSong = sc.nextLine();
            System.out.println("Moi nhap khoi luong:");
            int khoiLuong = Integer.valueOf(sc.nextLine());
            ThucVat tv = new ThucVat(ma, ten, loaiCay, khuVucSong, khoiLuong);
            lists.add(tv);
            // Hoi muon tiep tuc hay khong 
            System.out.println("Muon tiep tuc nhap khong(Y/N):");
            String tiepTuc = sc.nextLine();
            if (tiepTuc.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void inDanhSach(ArrayList<ThucVat> lists) {
        for (ThucVat tv : lists) {
            tv.inThongTin();
        }
    }

    public void timKiemTenBatDauBangT(ArrayList<ThucVat> listThucVat) {
        for (ThucVat thucVat : listThucVat) { // for each 
            if (thucVat.getTen().startsWith("T")) {
                thucVat.inThongTin();
            }
        }
    }

    public void danhSachThucVatViTriChan(ArrayList<ThucVat> a) {
        for (int i = 0; i < a.size(); i++) {
            // 0 2 4 6.. 
            if (i % 2 == 0) {
                a.get(i).inThongTin();
                // a.get(i): Gia tri o vi tri i <=> a[i]
            }
        }
    }

    public void xoaTheoViTri(ArrayList<ThucVat> lists, int viTri) {
        lists.remove(viTri); // XOA THEO VI TRI 
    }

    public void xoaTheoMa(ArrayList<ThucVat> lists, String ma) {
        for (int i = 0; i < lists.size(); i++) {
            // KIEM TRA MA NHAP VAO CO TON TAI TRONG LIST KHONG
            // NEU TON TAI THI MOI XOA
            if (lists.get(i).getMa().equalsIgnoreCase(ma)) {
                lists.remove(i); // XOA THEO VI TRI
                break;
            }
        }
    }

    public void timKiemThucVatTrongKhoangKhoiLuong(ArrayList<ThucVat> lists,
            int min, int max) {
        for (ThucVat tv : lists) {
            if (tv.getKhoiLuong() >= min && tv.getKhoiLuong() <= max) {
                tv.inThongTin();
            }
        }
    }
    
    public void keThua(){
        // nhu bai hom truoc
    }
    
}
