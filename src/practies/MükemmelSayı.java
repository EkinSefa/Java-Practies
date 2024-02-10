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
public class MükemmelSayı {
    
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int toplam=0;
        int sayı=key.nextInt();
        for (int i=1;sayı>i;i++){
          if (sayı % i==0){
              toplam=toplam+i;
            }

        }
        if(sayı==toplam){
            System.out.println(sayı+ "mükemmel sayıdır");
        }
        else{
            System.out.println(sayı+ "mükemel sayı değildi");
        }
    }
    
}
