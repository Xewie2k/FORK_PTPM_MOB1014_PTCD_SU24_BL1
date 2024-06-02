/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_MangDong.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
           // nhap tt cua doi tuong tren tu ban phim 
           // va in thông tin của  đối tượng trên 
           Scanner sc = new Scanner(System.in);
           // B1: Nhap tt cua doi tuong tu ban phim
           System.out.println("Moi nhap ten:");
           String ten1 = sc.nextLine();
           System.out.println("Moi nhap toa hoc:");
           String toaHoc = sc.nextLine();
           System.out.println("Moi nhap dia chi:");
           String diaChi = sc.nextLine();
           System.out.println("Moi nhap dien tich:");
           int dienTich = Integer.valueOf(sc.nextLine());
           // B2: Khoi tao ra doi tuong 
//           LopHoc lh = new LopHoc(ten, toaHoc, diaChi, dienTich); // contructor co tham so
            LopHoc lh = new LopHoc(); // contructor kts
            // thay doi gia tri cua bat cu thuoc tinh nao 
            lh.setTen(ten1);
            // tu set not cac gia tri thuoc tinh con lai 
            
           // B3: In tt doi tuong
           lh.inThongTin();
           // khi dung contructor k tham so 
           // => in ra gia tri default cua kieu du lieu
    }
}
