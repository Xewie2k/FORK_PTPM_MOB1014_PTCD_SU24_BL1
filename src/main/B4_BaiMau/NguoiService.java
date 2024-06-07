/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B4_BaiMau;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NguoiService {
    // trong menu co bn chuc nang => service se co it nhat bang day ham 

    public void nhapThongTin(ArrayList<Nguoi> listNguoi) {
        // Nhap thong tin cua doi tuong nguoi tu ban phim 
        // B1: Nhap tt cua Nguoi tu ban phim 
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Moi nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap gioi tinh:");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap que quan");
        String queQuan = sc.nextLine();
        System.out.println("Moi nhap nghe nghiep");
        String ngheNghiep = sc.nextLine();
        // B2: Khoi tao doi tuong 
        Nguoi n = new Nguoi(ten, tuoi, gioiTinh, queQuan, ngheNghiep);
        // B3: Them phan tu vao list 
        listNguoi.add(n);
    }

    public void inThongTinDanhSach(ArrayList<Nguoi> lists) {
        for (Nguoi a : lists) {
            a.inThongTin();
        }
    }
}
