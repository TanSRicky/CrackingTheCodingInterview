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
       System.out.println(compressBookSolution("zlajsfowfgwqpgkjasdhjkadfohoklmnaopqrstfuvxqwyzakgdopadjkoperherio"));
       System.out.println(compress("zlajsfowfgwqpgkjasdhjkadfohoklmnaopqrstfuvxqwyzakgdopadjkoperherio"));
       
          System.out.println(compressBookSolution("abc"));
       System.out.println(compress("abc"));
       
          System.out.println(compressBookSolution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa56]3126p[olha.,.12512621opkdfhglafjm"));
       System.out.println(compress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa56]3126p[olha.,.12512621opkdfhglafjm"));
   }
    
   public static void isUniqueTest() {
       System.out.println(isUniqueNaive("abcdef"));
       System.out.println(isUniqueNaive("aabbccddeeff"));
       System.out.println(isUniqueNaive("abcdefa"));
   }
    
}
