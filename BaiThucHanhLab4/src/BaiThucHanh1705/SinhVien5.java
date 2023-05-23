package BaiThucHanh1705;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SinhVien5 {
     String maSV;
     String hoTen;
     String lop;

    public SinhVien5(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Map<String, SinhVien5> danhSachSinhVien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho và ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien5 sinhVien = new SinhVien5(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sinhVien);
        }

       
        System.out.print("Nhập tên Lớp: ");
        String tenLop = scanner.nextLine();

        System.out.println("sinh vien thuoc lop " + tenLop + ":");
        for (SinhVien5 sinhVien : danhSachSinhVien.values()) {
            if (sinhVien.getLop().equals(tenLop)) {
                System.out.println("msv: " + sinhVien.getMaSV());
                System.out.println("ten: " + sinhVien.getHoTen());
                System.out.println("Lop: " + sinhVien.getLop());
                System.out.println();
            }
        }

        
        System.out.print("msv=: ");
        String maSV = scanner.nextLine();

        SinhVien5 sinhVien = danhSachSinhVien.get(maSV);
        if (sinhVien != null) {
            System.out.println("ten: " + sinhVien.getHoTen());
            System.out.println("Lop: " + sinhVien.getLop());
        } else {
            System.out.println("Khong co " + maSV);
        }
    }
}
