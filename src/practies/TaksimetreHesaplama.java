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
public class TaksimetreHesaplama {
    
         public static void main(String[] args){                                         // taksimetre hesabı//


          Scanner a = new Scanner(System.in);
             System.out.print("Aracınız kilometre de kaç kuruş yakıyor (örnegin:0,30) =");
             double kurus=a.nextDouble();
             System.out.print("Aracınız kaç kilometre gitti:");
             int km =a.nextInt();
             double para= (kurus * km);
             System.out.print("Ödemeniz gereken tutar= " + para + " tl' dir.");

         }
    
}
