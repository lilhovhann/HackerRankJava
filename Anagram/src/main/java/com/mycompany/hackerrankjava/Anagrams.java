package com.mycompany.hackerrankjava;
import java.util.Scanner;
/**
 *
 * @author lilith
 */
public class Anagrams {
    
    static boolean isAnagram(String a, String b) {

            char[] arrA = a.toLowerCase().toCharArray();
            char[] arrB = b.toLowerCase().toCharArray();
            bubbleSort(arrA);
            bubbleSort(arrB);
            
            String A = new String(arrA);
            String B = new String(arrB);
           
            

        return A.equals(B);
            
    }


    public static void bubbleSort(char [] arr){
        
        int n = arr.length;  
         
         for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                
                               char temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("hello");
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



