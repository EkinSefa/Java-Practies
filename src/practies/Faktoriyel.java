/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practies;

import java.util.Scanner;

/**
 *
 * @author EKIN
 */
public class Faktoriyel {
   public static void faktöriyel() {
          Scanner a = new Scanner(System.in);
          System.out.print(" bir sayı giriniz : ");
          int sayı = a.nextInt();
          int faktöriyel1 = 1;
          while (sayı > 0) {

              faktöriyel1 = faktöriyel1 * sayı;
              sayı -= 1;

          }
          System.out.println("girilen sayının faktöriyei= " + faktöriyel1);
      }


      public static void main(String[] args) {
          
          faktöriyel();
      }
    
}
