import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double x1,x2,tong,hieu,tich,thuong,du;
        System.out.print("nhap X1:");
        x1=sc.nextDouble();
        System.out.print("nhap X2:");
        x2=sc.nextDouble();sc.close();
tong=x1+x2;hieu=x1-x2;tich=x1*x2;thuong=x1/x2;du=x1%x2;
System.out.println("tong ="+tong);
System.out.println("hieu ="+hieu);
System.out.println("tich ="+tich);
System.out.println("thuong ="+thuong);
System.out.println("chia lay du duoc "+du);
if(hieu==0){System.out.println("hai so bang nhau");}
else if(hieu>0){System.out.println("X1>X2");}
else if(hieu<0){System.out.println("X2>X1");}
}
    }