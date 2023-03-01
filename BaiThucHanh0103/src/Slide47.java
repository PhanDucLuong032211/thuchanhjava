       import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int tong = 0;
        int[] A = new int[100];
        int X = 0;int z=0;
        
        Scanner sc = new Scanner(System.in);
        
        while (tong <= 100) {
            System.out.print("Nhap so nguyen: ");
            int x = sc.nextInt();
            tong += x;
            A[z] = x;
            z++;
        }
        System.out.print("tong= ");
        System.out.print(A[0]);
        for (int i = 1; i < z; i++) {
            System.out.print(" + " + A[i]);
        }
        System.out.println(" = " + tong);
    }
}
