package crackingthecodinginterview;

import static crackingthecodinginterview.ChapterOne.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RJ
 */
public class TestBench {
    
    public static void main(String[] args) {
        compressTest();
        isUniqueTest();
    }
    
    public static void compressTest(){
        
               System.out.println(compressBookSolution("aaabbbccc"));
       System.out.println(compress("aaabbbccc"));
       System.out.println(compressBookSolution("zlajsfowfgwqpgkjasdhjkadfohoklmnaopqrstfuvxqwyzakgdopadjkoperherio"));
       System.out.println(compress("zlajsfowfgwqpgkjasdhjkadfohoklmnaopqrstfuvxqwyzakgdopadjkoperherio"));
       
       System.out.println(compressBookSolution("abc"));
       System.out.println(compress("abc"));
       

   }
    
   public static void isUniqueTest() {
       System.out.println(isUniqueNaive("abcdef"));
       System.out.println(isUniqueNaive("aabbccddeeff"));
       System.out.println(isUniqueNaive("abcdefa"));
   }
    
}
