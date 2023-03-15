import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
    int x,y;
    String z ;
    Scanner sc= new Scanner(System.in);
    System.out.print("nhap ten cua ban :");
    z=sc.nextLine();
    System.out.print("Nhap nam hien tai: ");
    x=sc.nextInt();
    System.out.print("nhap nam sinh cua ban:");
    y=sc.nextInt();sc.close();
    if(x-y<16){System.out.printf("ban %s o do tuoi vi thanh nien",z);}
    else if(x-y>=16 && x-y<18){System.out.printf("ban %s o do tuoi truong thanh",z);}
    else if(x-y>18){System.out.printf("ban %s da gia",z);}
    }
    
}
