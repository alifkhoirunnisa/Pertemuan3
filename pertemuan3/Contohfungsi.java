/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc7
 */
public class Contohfungsi {
      int alas = 4;
      int tinggi = 6;
      
      int hitungluasjajargenjang (){
          int luas = alas * tinggi ;
       System.out.println ( "alas = " + alas );
       System.out.println ( " tinggi = " + tinggi);
       System.out.println ( " luas = " + luas );
       return luas;
      }
      public static void main ( String [] args) {
          Contohfungsi F = new Contohfungsi();
          System.out.println ( "luasjajargenjang = " + F.hitungluasjajargenjang());
      }
}
