/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practies;

import java.util.Random;

/**
 *
 * @author EKIN
 */
public class DiziOluştur {
      public static void main(String[] args) {


        diziolustur();

    }

    public static char[] diziolustur() {
        Random rastgele = new Random();
        char semboldizi[] = new char[100];  //    Dizi  100 eleman atadım//

        for (int i = 0; i < 100; i++) {
            semboldizi[i] = (char) (rastgele.nextInt(26) + 'a');   // radomla dizi içine rstgele sembol atadık//

        }
        diziGoster(semboldizi);

        return semboldizi;
    }

    public static void diziGoster(char[] dizisırala) {
        int kontrol = 0;
        for (int i = 0; i < dizisırala.length; i++) {
            if (kontrol == 25) {
                System.out.println("");
                kontrol = 0;
            }
            System.out.print("'" + dizisırala[i] + "'");
            kontrol++;
        }
        karakterSay(dizisırala);

    }

    public static int[] karakterSay(char[] dizi) {
        // harf dizisi oluştur  26 harfi atama yap//
        int dizitanı [] = new int[26];
        int i = 0 ;
        for (char c = 'a' ; c<='z'; c++){
            dizitanı[i]=c ;
            i++;
        }
        int harfsay [] = new int[26];
        for (int j = 0 ; j<harfsay.length ; j++){
            harfsay[j] = 0 ;
        }
        for (int j = 0 ; j < dizi.length ; j++){
            for (int k = 0 ; k < dizitanı.length ; k++){
                if(dizi[j] == dizitanı[k]){
                    harfsay[k]++;
                }
            }
        }
        sayilarigoster(harfsay);
        return null ;
    }
    public static void sayilarigoster(int[] karSayilari) {//Metodu elde edilen karakter sayılarını her bir

        System.out.println("\n");
        char alfabe[] = new char[26];
        int a = 0;
        for (char j = 'a'; j <= 'z'; j++) {
            alfabe[a] = j; // bir değişkeni diğer değişkene eşitlemek istersek değişken türleri aynı

            a++;
        }

        int kontrol = 0;
        for (int i = 0; i < karSayilari.length; i++) {
            if (kontrol == 10) {
                System.out.println("");
                kontrol = 0;
            }
            System.out.print(karSayilari[i] + "" + alfabe[i] + " ");
            kontrol++;
        }
    }
    
}
