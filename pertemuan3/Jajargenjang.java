/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc7
 */
public class Jajargenjang {
   int alas = 4;
   int tinggi = 6;
   
   
   void hitungluasjajargenjang (){
       int luas = alas * tinggi ;
       System.out.println ( "alas = " + alas );
       System.out.println ( " tinggi = " + tinggi);
       System.out.println ( " luas = " + luas );
       
   }
   public static void main ( String [] args) {
       Jajargenjang p = new Jajargenjang ();
       p.hitungluasjajargenjang();
   }
}
