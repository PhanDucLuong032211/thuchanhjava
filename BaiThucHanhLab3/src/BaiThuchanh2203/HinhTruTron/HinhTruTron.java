package HinhTruTron;
import java.util.Scanner;

public class HinhTruTron {
  public float bankinh,chuvi,dientich,thetich,chieucao;
  public final float pi = 3.14f;
  public void nhapbkcc(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap do dai ban kinh:");
    bankinh=sc.nextFloat();
    System.out.print(" Nhap do dai chieu cao");
    chieucao=sc.nextFloat();sc.close();}  
  public float tinhcv(){
    chuvi=2*bankinh*pi;
    return chuvi;}
  public float tinhdt(){
    dientich=2*bankinh*chieucao*pi;
    return dientich;}
  public float tinhtt(){
    thetich=dientich*chieucao;
return thetich;}
  public void inracv(){
  System.out.printf("Chu vi duong tron ban kinh %.2f la:%.2f",bankinh,chuvi);}
  public void inradt(){
  System.out.printf("Dien tich hinh tron ban kinh %.2f la:%.2f ",bankinh,dientich);}
  public void inratt(){
  System.out.printf("The tich hinh tron ban kinh %.2f la:%.2f ",bankinh,thetich);}
}





