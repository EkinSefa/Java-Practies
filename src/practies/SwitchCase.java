/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practies;

/**
 *
 * @author EKIN
 */
public class SwitchCase {
     Random rasgele=new Random();
        int bölgeler=rasgele.nextInt(7)+1;

        switch (bölgeler) {
            case 1:
            System.out.println("akdeniz bölgesi");
         break;
            case 2:
             System.out.println("marmara bölgesi");            //Switch bölgeler rasgele random ile//
             break;
            case 3:
             System.out.println("karadeniz bölgesi");
         break;
            case 4:
               System.out.println("ege bölgesi");
         break;
            case 5:
               System.out.println("iç anadolu bölgesi");
         break;
            case 6 :
                System.out.println("güneydogu anadulu");
         break;
            case 7 :
               System.out.println("dogu anadolu");
         break;
            default:
                System.out.println("bölge bulunamadı");         // farklı bir sayı girişinde  urayada break gelir//
        }
    }
    
    
}
