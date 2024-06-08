/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // Nhap tt cua cay lua va in ra man hinh
        // tt cay lua => 7 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập TT của cây lúa ở đây: ");
        System.out.println("Nhập mã cây lúa ở đây: ");
        String ma = sc.nextLine();
        System.out.println("Nhập tên của cây lúa ở đây:");
        String ten = sc.nextLine();
        System.out.println("Nhập giới tính của cây lúa ở đây: ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập cân nặng của cây lúa ở đây: ");
        double canNang = Double.valueOf(sc.nextLine());
        System.out.println("Nhập chiều cao của cây lúa ở đây: ");
        int chieuCao = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập loại cây lúa ở đây: ");
        String loai = sc.nextLine();
        System.out.println("Nhập sản lượng mỗi năm ở đây: ");
        int sanLuongMoiNam = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao doi tuong
        CayLua cl = new CayLua(sanLuongMoiNam, ma, ten, gioiTinh,
                canNang, chieuCao, loai);
        // B3: In ra man hinh
        cl.display();
    }
}
