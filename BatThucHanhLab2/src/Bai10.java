import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        char ch;
        int count = 0;
        System.out.print("nhap chuoi bat ky ");
        str = input.nextLine();
        System.out.print("nhap ky tu bat ky: ");
        ch = input.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("so lan xuat hien ky tu '" + ch + "trong chuoi la: " + count);
   input.close(); }
}
