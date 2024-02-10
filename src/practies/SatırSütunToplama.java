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
public class SatırSütunToplama {
            public static void main(String[] args){                   
            Random rastgele = new Random();                    // dizini satır sütun
            int m = rastgele.nextInt(7)+1;
            int n = rastgele.nextInt(7)+1;                                    //sayısını rastgele bir şekide dağıtımı
            matrisUret(7, 7);
        }
        public static int [][] matrisUret(int m , int n){
            Random rastgele = new Random();
            int dizi[][] = new int[m][n]  ;                 // satır ve
                                                           // sütündaki sayıların belli bir aralık belirleyerek
            for (int i = 0; i < m; i++) {                   // random atama
                                                            // işlemi gerçekleştiği yerdir
                for (int j = 0; j < n; j++) {
                    dizi[i][j] = rastgele.nextInt(23)+1;
                    System.out.print(dizi[i][j]+" \t ");
                }
                System.out.println("");
            }
            satirsutunTop(dizi);
            return null;
        }
        public static int satirsutunTop(int[][] dizitop){
            for (int i = 0; i < dizitop.length; i++) {
                int toplam = 0 ; // dizide bulunan satırdaki
                                                             //  sayıların uzunluğu kadar for da döner ve toplar
                for (int j = 0; j < dizitop.length; j++) {
                    toplam = toplam+dizitop[i][j] ;
                }
                System.out.println(i+1+". Satırdaki Sayıların Toplamı = "
                        +toplam);
            }
            System.out.println("");
            for (int i = 0; i < dizitop.length; i++) { // sütundaki bulunan
                                                                 // sayıların uzunluğu kadar for da döner ve toplar
                int toplam = 0 ;
                for (int j = 0; j < dizitop.length; j++) {
                    toplam = toplam + dizitop[j][i];
                }
                System.out.println(i+1+". Sütundaki Sayıların Toplamı = "+toplam);
            }
            return 0;
        }
    
}
