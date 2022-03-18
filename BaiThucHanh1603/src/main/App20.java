package main;
import shapes.HinhChuNhat;
import shapes.HinhTron;

public class App20 {

    public static void main(String[] args){
        //Khai báo các đối tượng bằng từ khóa new
        HinhTron hinhTron = new HinhTron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        //Nhập dữ liệu vào cho hinhTron , tính chu vi , diện tích
        hinhTron.NhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        //Ngăn cách các hình cho người dùng đỡ nhầm
        System.out.println("\n\n");

        //Nhập dữ liệu vào cho hinhChuNhat , tính chu vi , diện tích
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

    }
}