/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B1_OnTapNhapXuatVaReNhanh.P1_NhapXuat;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai3 {

    public static void main(String[] args) {
        // Nhập vào tên, tuoi, ngành học,ky hoc, địa chỉ, quê quán của bản thân và in ra màn hình 
        Scanner scan = new Scanner(System.in);
        // nhap tt tu man hinh 
        System.out.println("Moi nhap ten:");
        String ten = scan.nextLine(); 
        System.out.println("Moi nhap tuoi:");
//        int tuoi = scan.nextInt();
        int tuoi = Integer.valueOf(scan.nextLine());
        int tuoi1 = Integer.parseInt(scan.nextLine());
        // them o cho ma k nhap dc
        // C1:scan.nextLine()
        // C2: ep kieuu 
        // Coi tat moi thu nhap tu ban phim luon luon la chuoi (nextLine())
        // Ep kieu ve kieu du lieu tuong ung
        scan.nextLine();
        System.out.println("Moi nhap nganh hoc:");
        String nganhHoc = scan.nextLine();
        System.out.println("Moi nhap ky hoc:");
        int kyHoc = scan.nextInt();
        System.out.println("Moi nhap dia chi:");
        String diaChi = scan.nextLine();
        System.out.println("Moi nhap que quan:");
        String queQuan = scan.nextLine();
        // in tt ra man hinh
        System.out.println("Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Nganh hoc : " + nganhHoc);
        System.out.println("Ky hoc : " + kyHoc);
        System.out.println("Dia chi  : " + diaChi);
        System.out.println("Que quan : " + queQuan);
    }
}
