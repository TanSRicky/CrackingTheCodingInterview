/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crackingthecodinginterview;

/**
 *
 * @author RJ
 */
/**
 * Write a description of class ChapterOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
*/
import java.util.*;
public class ChapterOne
{

   public static void compressTest(){
       System.out.println(compress("aaabbbccaa"));
       System.out.println(compress("zlajsfowfgwqpgkjasdhjkadfohoklmnaopqrstfuvxqwyzakgdopadjkoperherio"));
       System.out.println(compress("abc"));
       System.out.println(compress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa56]3126p[olha.,.12512621opkdfhglafjm"));
   }
   //Uses space for O(n) time, HashMap
   public static String compress(String s){
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i = 0; i < s.length(); i++) {
           if(map.containsKey(s.charAt(i))){
                  map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
           } else {
                   map.put(s.charAt(i), 1);
               }
       }
       String ret = "";
       for(Character c : map.keySet()) {
           ret = ret + c + map.get(c);
       }
   
       if(s.length() <= ret.length()) return s;
       else     return ret;
   }
   //No extra space used, only what is needed to meet the requirements. Ternary operator used for elegance. 
   public static String compressBookSolution(String s){
       StringBuilder compressed = new StringBuilder();
       int countConsecutive = 0;
        for (int i = 0; i < s.length(); i++){
            countConsecutive++;
            
            if( i + 1 >= s.length() || s.charAt(i) != s.charAt(i +1)) {
                compressed.append(s.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
       }
       
       return compressed.length() < s.length() ? compressed.toString() : s;
       
   }
}


