package BaiThucHanh1904;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ContactMain db=new ContactMain();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap kich thuoc danh ba: ");
        int A=sc.nextInt();
        String arrTen[]=new String[A];
        String arrSDT[]=new String[A];
        db.AddContact(arrTen, arrSDT);
        db.DeleteContact(arrTen, arrSDT);
        db.UpdateContact(arrTen, arrSDT);
        db.SearchContact(arrTen, arrSDT);
    }
}