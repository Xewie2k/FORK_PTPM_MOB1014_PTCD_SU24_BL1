/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.B1_OnTapNhapXuatVaReNhanh.P1_NhapXuat;

//import java.util.Scanner; // include => Khai bao thu vien
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NhapXuatThongTin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nhập vào tên, địa chỉ của bản thân và in ra màn hình 
        // C -> scanf
        // Java -> Scanner 
        Scanner sc = new Scanner(System.in); // Nhap du lieu tu ban phim 
        // C => 5 so nguyen => scanf 5 
        // Java => 5 so nguyen => Scanner 
        System.out.print("Moi nhap ten:");
        String ten = sc.nextLine();  // Nhap chuoi tu ban phim 
        System.out.print("Moi nhap dia chi:");
        String diaChi = sc.nextLine();  // Nhap chuoi tu ban phim 
        System.out.println("Ten = " + ten + " Dia chi = " + diaChi);
        // Chuoi: nextLine()
        // so nguyen int: nextInt() 
//        sc.nextFloat();
//        sc.nextDouble();
//        sc.nextLong();
    }

}
