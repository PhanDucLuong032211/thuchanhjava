package HinhTruTron.NhanVien;
import java.util.Scanner;

public class NhanVien {
    public String ten ;
    public int tuoi ;
    public long luong;
    public float hsluong;
    public final long luongcb=1490000;
    public void nhaptt(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten=sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi=sc.nextInt();
        System.out.print("Nhap he so luong: ");
        hsluong=sc.nextFloat();
        sc.close();}
    public long tinhluong(){
       luong=(long) (hsluong*(float)luongcb);
        return luong;
    }
    public void intt(){
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi"+tuoi);
        System.out.printf("Luong cua %s la : %d",ten,luong);
    }

    
}
