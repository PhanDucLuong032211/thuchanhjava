package BaiThucHanh2604;
import java.util.ArrayList;
import java.util.ListIterator;
public class Slide19 {

public static void main(String[] args) {
    

    
    ArrayList<Character> arrListChar = new ArrayList<>();
    
    arrListChar.add('a');
    
    arrListChar.add('e');
    
    arrListChar.add('b'); arrListChar.add('c');
    
    
    
    ListIterator<Character> listIterator = arrListChar.listIterator();
    
    System.out.println("Cac phan tu có trong arrListChar la:" );
    while (listIterator.hasNext()) {
    
    System.out.print(listIterator.next() + "\t");
    
}}}