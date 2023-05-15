package BaiThucHanh1005;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
public static void main(String[] args) { 
HashMap<String, String> hashMapCity = new HashMap<>();
 hashMapCity.put("QNg", "Quảng Ngãi"); 
 hashMapCity.put("ON", "Quang Nam"); 
 hashMapCity.put("ON", "Quang Ninh"); 
 hashMapCity.put("HCM", "Thành phố Hồ Chí Minh");
System.out.println("Danh sách các thành phố trong hashMapCity: "); 
   Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet(); System.out.println(setCity);

if (hashMapCity .containsValue("Thành phố Hồ Chí Minh")) 
{ System.out.println("Có Thành phố Hồ Chí Minh trong hashMapCity");
}}}
