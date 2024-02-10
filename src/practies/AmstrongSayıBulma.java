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
public class AmstrongSayıBulma {
    
    
    
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int basamakSayısı=0,rakam;
        int toplam=0;
        System.out.println("bir sayı giriniz");
        int sayı=key.nextInt();
        int geçici=sayı;
        int geçici2=sayı;                                              // amstrong sayı bulma

        while(geçici > 0) {
            geçici /= 10;
            basamakSayısı++;
        }

        while(sayı > 0) {
            rakam = sayı % 10;
            toplam += Math.pow(rakam, basamakSayısı);
            sayı /= 10;
        }
        if(toplam == sayı) {
            System.out.println(geçici2 + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(geçici2 + " sayisi armstrong bir sayi degildir.");
        }
    }
}
