package Shapes;

import java.util.Scanner;

public class HinhHoc{
    Scanner sc=new Scanner(System.in);
    public float nhapBanKinhtubanphim(){
    System.out.print("\nnhap ban kinh :");
    return sc.nextFloat(); }
    public float nhapchieuDaitubanphim(){
    System.out.print("\nnhap chieu dai :");
    return sc.nextFloat(); }
    public float nhapchieuRongtubanphim(){
    System.out.print("\nnhap chieu rong :");
    return sc.nextFloat(); }
    public float nhapchieuCaotubanphim(){
    System.out.print("\nnhap chieu cao :");
    return sc.nextFloat(); }

    public void xuatTen(String Ten){
        System.out.println(""+Ten);}
    public void inChuVi(float chuVi){
        System.out.println("Chu vi ="+chuVi);
    }
    public void inDienTich(float dienTich){
        System.out.println("Dien tich ="+dienTich);
    }
    public void inTheTich(float theTich){
        System.out.println("The tich ="+theTich);
    }
}