/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc7
 */
public class runbangundatar {
     public static void main ( String [] args) {

         
         masterbangundatar F = new masterbangundatar ();
         System.out.println ("\nHasil method prosedur dengan parameter");
         F.hitungluasjajargenjang(4, 6);
         
         System.out.println ( "Hasil method fungsi dengan parameter");
         System.out.println ( "luas jajargenjang =" + F.Luasjajargenjang(5, 7));
         
         System.out.println ("\nHasil method static prosedur");
         masterbangundatar.hitungjajargenjang(3, 8);
         
         System.out.println ("\nHasil method static fungsi");
         System.out.println ("Luas jajargenjang = " + masterbangundatar.Hitungjajargenjangluas(4, 9));

         
     }
     
     
}
