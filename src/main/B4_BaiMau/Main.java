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
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NguoiService service = new NguoiService();
        ArrayList<Nguoi> lists = new ArrayList<>();
        while (true) {
            System.out.println("Moi nhap chuc nang:");
            int chucNang = Integer.valueOf(s.nextLine());
            switch (chucNang) {
                case 1:
                    service.nhapThongTin(lists);
                    break;
                case 2:
                    service.inThongTinDanhSach(lists);
                    break;
                case 0:
                    System.out.println("Thoat");
                    System.exit(0);
                default:
                    System.out.println("Chuc nang khong ton tai");
                    break;
            }
        }
    }
}
