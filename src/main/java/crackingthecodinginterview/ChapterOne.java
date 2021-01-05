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
   
   //Initial assumptions:
   //Didnt wonder about ASCII or Unicode, used java libraries. 
   public static boolean isUniqueNaive(String s) {
       HashSet<Character> seenCharacters = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
          if(seenCharacters.contains(s.charAt(i))) return false;
          seenCharacters.add(s.charAt(i));
       }
       return true;
   } 
      
   // Book solution maps the value into bits, and then checks to see if it is in our bit vector, if not add it to our bit vector. If it is (bitwise and) > 0 then we return false
   public static boolean isUniqueBookSolution(String s){
       int checker = 0;
       for(int i = 0; i < s.length(); i++){
           int val = s.charAt(i) - '0'; // a->0, b->1...z->
           
           if((checker & (1<<val)) > 0) {  //on first iteration, nothing is in checker
               return false;
           }
           checker |= (1  << val); // add val to checker
    
       }
           return true;
           
       }
   
   /*************************************************************************************************************************
   *                                        1.2 Check Permutation                                           *
   *************************************************************************************************************************/
   public static boolean checkPermutation(String str, String cmprStr){
       if(str.length() != cmprStr.length()) return false;
       int[] strTwo  = new int[128],strOne = new int[128];
       for(int i = 0; i < str.length(); i++){
          strOne[str.charAt(i)]++;
          strTwo[cmprStr.charAt(i)]++;
       }
       for(int i = 0; i < 128; i++){
           if(strOne[i] != strTwo[i]) return false;
       }
       return true;
   }
   /*************************************************************************************************************************
   *                                        1.6 String Compression                                                 *
   *************************************************************************************************************************/
   public static class Spot {
      char letter;
      int count = 0;
      public Spot(char c, int cv){
          this.letter = c;
          this.count = cv;
      }
      
      public void addCount() {
          this.count = this.count + 1;
      }
   }
   //Uses space for O(n) time, HashMap implemented using Spot object to maintain uniqueness of similar characters in different sequences i.e aaabbaa
   public static String compress(String s){
       ArrayList<Spot> spotCount = new ArrayList<>();
       int runner;
       for(int holder = 0; holder < s.length(); ){
           runner = holder + 1;
           Spot currSpot = new Spot(s.charAt(holder),1);
           

             while(runner < s.length() && s.charAt(runner) == s.charAt(holder)){
                   runner++;
                   currSpot.count++;
             }
        //  System.out.println(holder + " " + runner +" "+ currSpot.count + " " + currSpot.letter );
           spotCount.add(currSpot);
           holder = runner;
       }
       
       StringBuilder ret = new StringBuilder();
       for(Spot spot : spotCount) {
           ret.append(spot.letter);
           ret.append(spot.count);
       }
  
              
       return ret.length() <  s.length() ? ret.toString() : s;
       
               
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
     
       }
       
       return compressed.length() <  s.length() ? compressed.toString() : s;
       
   }
}


