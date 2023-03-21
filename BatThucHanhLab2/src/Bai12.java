import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so hang :");
        x=sc.nextInt();
        System.out.print("Nhap so cot :");
        y=sc.nextInt();
        int A[][]=new int[x][y];
        for(int a=0;a<x;a++){
            for(int b=0;b<y;b++){
                System.out.printf("Nhap phan tu A[%d][%d]",a,b);
                A[a][b]=sc.nextInt();}}
                int Max= A[0][0] ;
        for(int c=0;c<x;c++){
            for(int d=0;d<y;d++){
                if(A[c][d]> Max){
                    Max=A[c][d];}}}  
        System.out.print("Gia tri lon nhat la:"+Max);                   
        sc.close();}}
