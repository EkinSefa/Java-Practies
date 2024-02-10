/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practies;

/**
 *
 * @author EKIN
 */
public class Örnek {
     public static void main(String[] args) {


//       1    2    3
 //     4     5    6
 //     7     8    9   çıktımız bu şekilde olsun

        int dizi[][] = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; 3 > j; j++) {
                System.out.print(dizi[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
