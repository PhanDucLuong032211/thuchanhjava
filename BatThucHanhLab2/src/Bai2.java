import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap mot so nguyen bat ky:");
        x=sc.nextInt();sc.close();
        if(x%2==0){System.out.println("so chan");}
        else{System.out.println("so le");}
    }
    
}
