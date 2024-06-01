/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B2_VongLap_OOP.P1_VongLap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // do..while 
        Scanner sc = new Scanner(System.in); // Moi nhap du lieu tu ban phim 

        while (true) {   // While(1){} // menh de luon dung          
            System.out.println("Moi nhap menu");
            int menu = Integer.valueOf(sc.nextLine());
            // tao menu 
            switch (menu) {
                case 1:
                    // chuc nang cua tung case 
                    System.out.println("Chuc nang 1");
                    break;
                case 2:
                    System.out.println("Chuc nang 2");
                    break;
                case 3:
                    System.out.println("Chuc nang 3");
                    break;
                case 4:
                    System.out.println("Chuc nang 4");
                    break;
                case 5:
                    System.out.println("Chuc nang 5");
                    break;
                case 6:
                    System.out.println("Chuc nang 6");
                    break;
                case 7:
                    System.out.println("Chuc nang 7");
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
//                    break; => CHI GIUP THOAT KHOI VONG LAP
                    System.exit(0); // DUNG NGAY LAP TUC CHUONG TRINH
                    // them System.exit(0);  o case thoat thay vi them break
//                    return;
                default:
                    System.out.println("Chuc nang khong ton tai ");
                    break;
            }
        }

    }
}
