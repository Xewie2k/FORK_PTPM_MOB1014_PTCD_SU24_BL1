/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B2_VongLap_OOP.P2_OOP.B1;

/**
 *
 * @author hangnt
 */
public class SinhVien {
//    Tạo class SinhVien gồm các thuộc tính maSV-String ,
    // hoTen - String , namSinh - int , chuyenNganh - String , 
    // diemTB- double  và các phương thức contructor, getter, setter 
    // và phương thức display(): void. 
    // Doi tuong(Object) - Co 2 dac trung
    // 1. Thuoc tinh(attribute) <=> cac bien 
    // 2. Phuong thuc(method)   <=> cac ham 
    // pham vi truy cap => private 
    // Co 4 pham vi truy cap(access modifier)
    // public, protected, default, private  
//    String maSV; // khi k ghi gi o phia dang truoc => pham vi truy cap: default

    private String maSV;
    private String hoTen;
    private int namSinh;
    private String chuyenNganh;
    private double diemTB;

    // cach tao contructor, getter, setter 
    // Tao 2 contructor: contructor k ts, contructor full ts
    // C1: chuot phai => insert code => contructor 
    // C2: ctrl space 2 lan 
//    // contructor k tham so 
//    public SinhVien() {
//    }
//
//    // contructor full ts
//    public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh, double diemTB) {
//        this.maSV = maSV;
//        this.hoTen = hoTen;
//        this.namSinh = namSinh;
//        this.chuyenNganh = chuyenNganh;
//        this.diemTB = diemTB;
//    }
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ","
                + " namSinh=" + namSinh + ", chuyenNganh="
                + chuyenNganh + ", diemTB=" + diemTB + '}';
    }

    // ham display => hien thi tt cua doi tuong ra man hinh
    // Sinh vien => 5 tt => sout in 5 tt ra 
    // C1: sout nhieu lan (dua vao thuoc tinh) 
    public void display() {
        // in cac thuoc tinh cua doi tuong SV 
//        System.out.println("Ma SV" + maSV);
//        System.out.println("Ten" + hoTen);
        // tuong tu
        System.out.println(toString());
    }
}
