import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int x;
        int tong=0;
        float TBC;
        Scanner sc=new Scanner(System.in);
       System.out.print("nhap do dai cua day so: ");
       x=sc.nextInt();
       int A[]=new int[x];
       for(int i=0;i<x;i++){
        System.out.printf("Nhap gia tri A[%d]",i);
        A[i]=sc.nextInt();
        tong+=A[i];
       }
       TBC=tong/x;
       System.out.print("Trung binh cong day vua nhap la ="+TBC); 
    sc.close();}
}
