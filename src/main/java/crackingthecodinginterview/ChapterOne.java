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
   /*************************************************************************************************************************
   *                                        1.1 isUnique                                                                    *
   **************************************************************************************************************************/
   public static boolean isUniqueNaive(String s) {
       HashSet<Character> seenCharacters = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
          if(seenCharacters.contains(s.charAt(i))) return false;
          seenCharacters.add(s.charAt(i));
       }
       return true;
   } 
   
  /*************************************************************************************************************************
   *                                        1.6 String Compression Start                                                   *
   *************************************************************************************************************************/
   
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
   
       if(s.length() < ret.length()) return s;
       else     return ret;
   }
   //No extra space used, only what is needed to meet the requirements. Ternary operator used for elegance. 
   //Also uses String builder
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
            System.out.println("Woah");
       }
       
       return compressed.length() <  s.length() ? compressed.toString() : s;
       
   }
}


