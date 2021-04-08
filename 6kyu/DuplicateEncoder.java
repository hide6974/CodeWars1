import java.util.Map;
import java.util.HashMap;

public class DuplicateEncoder {
	static String encode(String word){
 
     // 格納だけするfor分 wordを１文字ずつStringの文字にし、char 配列格納するループ
     Map<Character , Integer> map = new HashMap<>();
     word = word.toLowerCase();
     
     for(int i=0;i<word.length();i++){
       if(map.containsKey(word.charAt(i))){
         int value = map.get(word.charAt(i));
         map.remove(word.charAt(i));
         map.put(word.charAt(i),++value);
       }else{
         map.put(word.charAt(i),1);
       }
    }
    String output ="";

    for(int i=0; i<word.length();i++){
      output += (map.get(word.charAt(i)) > 1) ? ")" :"(";
    }      
    return output;
    }
    
   public static void main (String[] args) {
    
    // String str = encode("din") ; 
    // System.out.println(str);
    String str1 = encode("recede") ; 
    System.out.println(str1);

   }

}
