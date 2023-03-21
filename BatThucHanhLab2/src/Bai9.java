import java.util.Scanner;

public class Bai9 {
 public static void main(String[] args) {
  String x;
  int hoa=0,thuong=0,so=0;
  Scanner sc = new Scanner(System.in);
System.out.print("Nhap Ky tu tu ban phim");
x=sc.nextLine();
for (int i = 0; i < x.length(); i++) {
    char ch = x.charAt(i);
    if (Character.isUpperCase(ch)) {
        hoa++;
    } else if (Character.isLowerCase(ch)) {
        thuong++;
    } else if (Character.isDigit(ch)) {
        so++;
    }
   
 } 
 System.out.println("so chu hoa: " + hoa);
 System.out.println("so chu thuong: " + thuong);
 System.out.println("so chu so: " + so);  
 sc.close();}}
