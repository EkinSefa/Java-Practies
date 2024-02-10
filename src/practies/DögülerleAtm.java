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
public class DögülerleAtm {
     public static void main(String[] args){

   Scanner klavye=new Scanner(System.in);
   int bakiye=1000;
   String işlemler= "1. işlem bakiye öğrenme\n"
                   +"2. işlem para çekme\n"
                   +"3. işlem para yatırma\n"
                   +"4.işlem (q) basarak çıkış yapınız";

    System.out.println("-----------------------------");
    System.out.println(işlemler);
    System.out.println("--------------------------------");               //    döngüler ile ATM  yapımı//

   while(true) {
    System.out.println(" işlem seçiniz");
    String işlem = klavye.nextLine();

     if (işlem.equals("q")) {
     System.out.println("çıkış yapılıyor...");
     break;
    }
    else if(işlem.equals("1")){
     System.out.println("bakiyeniz= "+ bakiye);
     break;
    }
    else if(işlem.equals("2")){
     System.out.println("para çekme ");
      System.out.println("çekeceginiz miktarı giriniz");
     int miktar =klavye.nextInt();

     if(bakiye<miktar){
      System.out.println("yetersiz bakiye bakiyeniz= "+bakiye);
      System.out.println("çekeceğiniz miktarı giriniz");
      miktar=klavye.nextInt();
     }

     bakiye-= miktar;
      System.out.println("kalan paranız= "+bakiye);
     break;
    }
    else if(işlem.equals("3")){
     System.out.println("para yatırma ");
      System.out.println("yatıracagınız para miktarını girinzi");
     int alınan=klavye.nextInt();
     bakiye+=alınan;
      System.out.println("total paranız= "+bakiye);
     break;
    }
    else{
     System.out.println("geçersiz işlem");
     break;
    }
   }
  }
    
}
