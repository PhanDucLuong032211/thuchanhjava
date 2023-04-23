package Main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        HinhTron hinhTron =new HinhTron();
        hinhTron.xuatTen("Hinh Tron");
        hinhTron.nhapBanKinh(hinhTron.nhapBanKinhtubanphim());
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi(hinhTron.tinhChuVi());
        hinhTron.inDienTich(hinhTron.tinhDienTich());
        HinhTru hinhTru=new HinhTru();
        hinhTru.xuatTen("Hinh Tru");
        hinhTru.nhapChieuCao(hinhTru.nhapchieuCaotubanphim());
        hinhTru.nhapBanKinh(hinhTru.nhapBanKinhtubanphim());
        hinhTru.tinhTheTich();
        hinhTru.inTheTich(hinhTru.tinhTheTich());
        HinhChuNhat hinhChuNhat=new HinhChuNhat();
        hinhChuNhat.xuatTen("Hinh Chu Nhat");
        hinhChuNhat.nhapChieuDai(hinhChuNhat.nhapchieuDaitubanphim());
        hinhChuNhat.nhapChieuRong(hinhChuNhat.nhapchieuRongtubanphim());
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi(hinhChuNhat.tinhChuVi());
        hinhChuNhat.inDienTich(hinhChuNhat.tinhDienTich());
        HinhVuong hinhVuong=new HinhVuong();
        hinhVuong.xuatTen("Hinh Vuong");
        hinhVuong.nhapCanh(hinhVuong.nhapchieuDaitubanphim());
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi(hinhVuong.tinhChuVi());
        hinhVuong.inDienTich(hinhVuong.tinhDienTich());
    }
    
}
