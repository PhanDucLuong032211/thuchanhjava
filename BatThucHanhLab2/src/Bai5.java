import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int x,tong=0;
        Scanner sc=new Scanner(System.in);
        while(tong<=100){
            System.out.print("nhap so bat ky :");
            x=sc.nextInt();
            tong=tong+x;
        }System.out.print("tong cac so da nhap ="+tong);
    sc.close();}
    
}
