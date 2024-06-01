/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B2_VongLap_OOP.P2_OOP.B2;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1: Nhap tt doi tuong tu ban phim 
        // Dong Vat => 5 tt 
        System.out.println("Moi nhap vao ma:");
        String ma = sc.nextLine();
        System.out.println("Moi nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Moi nhap can nang:");
        double canNang = Double.valueOf(sc.nextLine());
        System.out.println("Moi nhap chieu cao:");
        int chieuCao = Integer.valueOf(sc.nextLine());
        System.out.println("Moi nhap khu vuc song:");
        String khuVucSong = sc.nextLine();
        // B2: Tao 1 doi tuong dong vat 
        DongVat dv = new DongVat(ma, ten, canNang, chieuCao, khuVucSong);
        // B3: In tt dong vat 
        dv.inThongTin();
    }
}
