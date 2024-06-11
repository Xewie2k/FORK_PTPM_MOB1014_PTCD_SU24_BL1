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
public class DongVatService {
    // chua 3 ham 

    public void nhapThongTin(ArrayList<DongVat> lists) {
        Scanner a = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ma: ");
            String maDongVat = a.nextLine();
            System.out.println("Nhap ten: ");
            String tenDongVat = a.nextLine();
            System.out.println("Nhap can nang");
            int canNang = Integer.valueOf(a.nextLine());
            System.out.println("Nhap noi song: ");
            String noiSong = a.nextLine();
            DongVat dv = new DongVat(maDongVat, tenDongVat, canNang, noiSong);
            lists.add(dv);
            System.out.println("Nhap tiep? (Y/N)");
            String x = a.nextLine();
            if (x.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
    public void inDongVat(ArrayList<DongVat> list) {
        for (DongVat dv : list) {
            dv.display();
        }
    }

//    public void timKiemTrongKhoangCanNang(ArrayList<DongVat> lists, 
//            int minCanNang, int maxCanNang) {
//        for (DongVat dv : lists) {
//            if (dv.getCanNang() >= minCanNang 
//                    && dv.getCanNang() <= maxCanNang) {
//                dv.display();
//            }
//        }
//    }
    // Cu phap:
//    kieu du tra ve cua ham ten ham(tham so truyen vao ){
//        
//    }
    public ArrayList<DongVat> timKiemC2(ArrayList<DongVat> listBanDau,
            int min, int max) {
        // B1 => Phai lam cho ham het do 
        ArrayList<DongVat> listSearch = new ArrayList<>();
        // neu gs k co gia tri thoa man => size = 0 
        // CODE O GIUA
        for (DongVat dv : listBanDau) {
            if (dv.getCanNang() >= min && dv.getCanNang() <= max) {
                // ADD GIA TRI THOA MAI VAO LIST SEARCH
                listSearch.add(dv);
            }
        }
        return listSearch;
    }
    
    public void sapXepTangDanTheoTen(ArrayList<DongVat> a) {
//        a.sort((o1, o2) -> {
//            return o1.getTenDongVat().compareTo(o2.getTenDongVat()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
//        });
        a.sort((a1, a2) -> {
            return a1.getTenDongVat().compareTo(a2.getTenDongVat()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
//    public int tinhTong(int a,int b){
//        int tong = 0;
//        
//        return tong;
//    }
}
