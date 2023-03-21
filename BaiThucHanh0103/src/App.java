
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // tinh tong cac phan tu chang trong mang 2 chieu
        //cac phan tu trong mang do nguoi dung nhap vao
        Scanner sc = new Scanner(System.in);
        int sohang, socot, tong = 0;
        do
        {
            System.out.print("So hang = ");
            sohang = sc.nextInt();
        } while(sohang <= 0);
        do
        {
            System.out.print("So cot = ");
            socot = sc.nextInt();
        } while(socot <= 0);
        int arrA[][] = new int[sohang][socot];
        for(int i = 0; i < sohang; i++)
        {
            for(int j =0; j<socot; j++)
            {
                System.out.printf("A[%d][%d] = ",i,j);
                arrA[i][j] = sc.nextInt();
                if(arrA[i][j] %2 == 0) tong+= arrA[i][j];
            }
        }
        sc.close();
        System.out.println("tong = " + tong);
    }
}
