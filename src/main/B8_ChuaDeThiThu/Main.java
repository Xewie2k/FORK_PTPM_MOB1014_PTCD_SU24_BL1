/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B8_ChuaDeThiThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DongVatService service = new DongVatService();
        ArrayList<DongVat> list = new ArrayList<>();
        while (true) {
            System.out.println("Moi nhap chuc nang:");
            int chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    service.nhapThongTin(list);
                    break;
                case 2:
                    service.inDongVat(list);
                    break;
                case 3:
                    System.out.println("Moi nhap can nang min:");
                    int canNangMin = Integer.valueOf(sc.nextLine());
                    System.out.println("Moi nhap can nang max:");
                    int canNangMax = Integer.valueOf(sc.nextLine());
//                    service.timKiemTrongKhoangCanNang(list, 
//                            canNangMin, canNangMax);
                    ArrayList<DongVat> listSearch = service.timKiemC2
                                (list, canNangMin, canNangMax);
                    if(listSearch.isEmpty()){ // kiem tra list co phan tu hay k 
                        System.out.println("Khong co gia tri nao thoa mai");
                    }else{
                        // thoa man 
                        service.inDongVat(listSearch);
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Chuc nang k ton tai");
                    break;
            }
        }
    }
}
