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
public class FaizHesaplama {
    public static void main(String[] args){

    Scanner klavye=new Scanner(System.in);
     System.out.println(" bankamızın faiz oranı 0.06 dır");
     System.out.print(" Ana Paranızı giriniz = ");                      //Faiz uygulaması//
     int anapara=klavye.nextInt();
     System.out.print(" kaç yıl alacaksınız = ");
     int vade = klavye.nextInt();
     double toplampara=anapara;
     double faiz=0.06;
      for (int i=1;i<=vade;i++){
       toplampara= (toplampara * faiz) + toplampara;
       System.out.println(i+ ". yıl sonunda ödemeniz gereken para = " +toplampara);
      }
  }
    
}
