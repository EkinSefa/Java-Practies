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
public class BedenKitleİndeks {
      public static void main(String[] args){                   // beden kitle indeksi hesapla//

                Scanner h = new Scanner(System.in);

                System.out.print("kilonuzu giriniz");
                int kilo= h.nextInt();
                System.out.print("boyunuzu giriniz(örnek:1,72)") ;
                double boy=h.nextDouble();
                double bki = kilo / (boy * boy) ;
                System.out.println("beden kitle indeksi="+bki);

          }
    
}
