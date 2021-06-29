package com.mcnz
import java.io.File 
class uatInput { 
   static void main(String[] args) { 
      new File("abc.txt").eachLine {  
         line -> print "$line"; 
      } 
   } 
}
