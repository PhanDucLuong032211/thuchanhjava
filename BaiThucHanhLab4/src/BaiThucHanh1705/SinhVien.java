package BaiThucHanh1705;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SinhVien{
    String ten;
    float diem;
    public void nhaptt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        ten=sc.nextLine();
        System.out.println("Nhap diem :");
        diem=sc.nextFloat();
    }
    public void intt(){
        System.out.println("ten "+ten);
        System.out.println("diem "+diem);
    }
    public void addtt(List<SinhVien> A){
        while(true){
            SinhVien sv =new SinhVien();
            sv.nhaptt();
           
            if(sv.ten.equals("")){
                break;
            } 
            A.add(sv);
        }}
        public void inttm(List<SinhVien> B){
            System.out.println("danh sach sv ");
        for (SinhVien svv :B){
         svv.intt();
        }
        }
        public void thilai(List<SinhVien> C){
          System.out.println("danh sach hoc sinh thi lai :");
            for(int i=0;i<C.size();i++){
        if(C.get(i).diem<=5){
            System.out.println("\n"+C.get(i).ten);
        }
          }  
        }
        public void MAX(List<SinhVien> D){
            System.out.println("danh sach hoc sinh Diem cao :");
            float max = D.get(0).diem;  
            for(int i=0;i<D.size();i++){
              if(D.get(i).diem>=max){
              System.out.println("\n"+D.get(i).ten);
          }
            }  
          }
        public void timkiem(List<SinhVien> E){
            Scanner scc =new Scanner(System.in); String t;
        System.out.println("Nhap ten xem diem: ");
           
            t=scc.nextLine();

            for(int i=0;i<E.size();i++){
                if(E.get(i).ten.equals(t)){
                System.out.printf("Diem cua %s la %f ",t,E.get(i).diem);
            }
        }
            
        }
        
    
    public static void main(String[] args) {
        LinkedList<SinhVien> svList=new LinkedList<>();
        SinhVien std= new SinhVien();
        std.addtt(svList);
        std.inttm(svList);
        std.thilai(svList);
        std.MAX(svList);
        std.timkiem(svList);
    }

   }
