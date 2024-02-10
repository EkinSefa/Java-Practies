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
public class KullanıcıGiriş {
     public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        String şifre="yazılım2022";
        System.out.println(" sifre giriniz");
        String kullanıcıGiriş=key.nextLine();
        int i=5;
        while (1<i){
            if (kullanıcıGiriş.equals(şifre)){
                System.out.println(" sisteme hoş geldiniz ");
                break;
            }
            else{
                i--;
                System.out.println(" girilen şifre yanlis");
                System.out.println(" kalan kakkınız"+(i));
                kullanıcıGiriş= key.nextLine();

            }

        }
    }
    
}
