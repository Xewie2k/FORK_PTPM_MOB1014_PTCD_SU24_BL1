/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B6_ChuaBaiMauFullChucNang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    // Tao menu lap lai
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThucVat> lists = new ArrayList<>();
        ThucVatService service = new ThucVatService();
        int ch;
        do {
            System.out.println(""
                    + "1.Thêm thực vật (Sau khi thêm hỏi có muốn thêm tiếp hay ko)\n"
                    + "2.Hiển thị dsach thực vật\n"
                    + "3.Tìm kiếm tên thực vật bắt đầu bằng \"t\"\n"
                    + "4.Hiển thị dsach các thực vật ở vị trí chẵn\n"
                    + "5. Sắp xếp tăng dần theo tên\n"
                    + "6. Sắp xếp giảm dần theo khối lượng\n"
                    + "7. Xoá thực vật theo vị trí \n"
                    + "8. Xoá thực vật theo mã \n"
                    + "9. Tìm kiếm thực vật trong khoảng khối lượng\n"
                    + "0.Thoát");
            System.out.print("Mời bạn chọn chương trình:");
            ch = Integer.valueOf(sc.nextLine());
            switch (ch) {
                case 1:
                    service.themThucVat(lists);
                    break;
                case 2:
                    service.inDanhSach(lists);
                    break;
                case 3:
                    service.timKiemTenBatDauBangT(lists);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Moi nhap vi tri muon xoa:");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaTheoViTri(lists, viTri);
                    System.out.println("Danh sach sau khi xoa:");
                    service.inDanhSach(lists);
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc");
                    break;
                default:
                    System.out.println("Không có chương trình");
                    break;
            }
        } while (ch != 0);
    }
}
