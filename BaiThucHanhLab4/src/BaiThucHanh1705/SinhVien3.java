package BaiThucHanh1705;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SinhVien3{
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
    public void addtt(List<SinhVien3> A){
        while(true){
            SinhVien3 sv =new SinhVien3();
            sv.nhaptt();
           
            if(sv.ten.equals("")){
                break;
            } 
            A.add(sv);
        }}
        public void inttm(List<SinhVien3> B){
            System.out.println("danh sach sv ");
        for (SinhVien3 svv :B){
         svv.intt();
        }
        }
        public void thilai(List<SinhVien3> C){
          System.out.println("danh sach hoc sinh thi lai :");
            for(int i=0;i<C.size();i++){
        if(C.get(i).diem<=5){
            System.out.println("\n"+C.get(i).ten);
        }
          }  
        }
        public void MAX(List<SinhVien3> D){
            System.out.println("danh sach hoc sinh Diem cao :");
            float max = D.get(0).diem;  
            for(int i=1;i<D.size();i++){
              if(D.get(i).diem>=max){
              System.out.println("\n"+D.get(i).ten);
          }
            }  
          }
        public void timkiem(List<SinhVien3> E){
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
        LinkedList<SinhVien3> svList=new LinkedList<>();
        SinhVien3 std= new SinhVien3();
        std.addtt(svList);
        std.inttm(svList);
        std.thilai(svList);
        std.MAX(svList);
        std.timkiem(svList);
    }

   }
