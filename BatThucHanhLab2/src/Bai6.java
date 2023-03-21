import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        long x;long y=1;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Nhap so nguyen duong :");
            x=sc.nextInt();
        }
            while(x<=0);
        
        for(long i=1;i<=x;i++){
            y=y*i;
        }
        System.out.print("giai thua cua so vua nhap la :"+y);

   sc.close(); }
    
}
