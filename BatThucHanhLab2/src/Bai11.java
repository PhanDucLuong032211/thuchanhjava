import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int x;int y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        x=sc.nextInt();
        int A[]=new int[x];
        for(int i=0;i<A.length;i++){
            System.out.printf("Nhap phan tu A[%d]:",i);
            A[i]=sc.nextInt();} 
        System.out.print("Mang ban dau la: ");
        for(int j=0;j<A.length;j++){
        System.out.print(+A[j]+";");}
        for(int k=0;k<A.length;k++){
            for(int l=0;l<A.length-1;l++){
        if(A[l]>A[k]){
            y=A[l];
            A[l]=A[k];
            A[k]=y;}}}
        System.out.println();
        System.out.print(" Mang sau khi sap xep tang dan: ");
        for(int jf=0;jf<A.length;jf++){
        System.out.print(+A[jf]+";");}
        sc.close();}}
