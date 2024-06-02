/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B3_MangDong.P2_MenuLapLai;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
           Scanner sc = new Scanner(System.in);
//        do{
//            int chucNang ;
//        }while(chucNang!=0);
        while (true) {
            System.out.println("Moi nhap chuc nang:");
            // tranh truong hop => loi bo nho dem 
            int chucNang = Integer.valueOf(sc.nextLine());
//            float a = Float.valueOf(sc.nextLine());
//            double b = Double.valueOf(sc.nextLine());
    
            switch (chucNang) {
                case 1:
                    // code chuc nang case 1
                    System.out.println("Chuc nang 1");
                    break;
                case 2:
                    System.out.println("Chuc nang 2");
                    break;
                case 0:
                    System.out.println("Thoat");
//                    break;
                    System.exit(0);
                default:
                    System.out.println("Chuc nang k ton tai");
                    break;
            }
        }
    }
}
