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
public class EbobBulma {
     public static int ebobbulma(int sayi1,int sayi2){
        int ebob=1;
         for (int i=1;i<=sayi1 && i<=sayi2;i++){                   //  ebob bulma
             if ((sayi1%i==0) && (sayi2%i==0)){
                  ebob=i;
             }
         }
         return ebob;                       //   void yoksa işlemler sürekli dönüyor ve retur ile durdurman gerekli//
     }                                     // en son hangi işlemi istiyosa  return önüne istediğin işlemi yaz//

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println(" birinci sayıyı giriniz : ");
        int birincisayi=klavye.nextInt();
        System.out.println(" ikinci sayıyı giriniz :");
        int ikincisayi= klavye.nextInt();
        System.out.println("iki sayının ebobu : " + ebobbulma(birincisayi,ikincisayi));  //int varken fonksyondan yerine//
    }                                                                                  // yerine yazarak çalıştırma//
    
}
