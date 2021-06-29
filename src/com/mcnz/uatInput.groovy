package com.mcnz
import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("abc.txt").eachLine {  
         line -> print "$line"; 
      } 
   } 
}
