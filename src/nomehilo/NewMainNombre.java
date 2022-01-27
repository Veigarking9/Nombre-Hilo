/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomehilo;
import java.util.Scanner;

/**
 *
 * @author xabier.barreiroalber
 */
public class NewMainNombre {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce el nombre que quieras del hilo");
        String nombre = t.nextLine();
        NomeHilo Hilo1 = new NomeHilo(nombre);
        Hilo1.start(); 
    }
}
 
