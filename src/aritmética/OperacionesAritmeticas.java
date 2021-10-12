/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmética;

/**
 *
 * @author Santiago
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
       Aritmetica a1 = new Aritmetica();
       a1.a = 2;
       a1.b = 5;
       a1.suma();
       
       int res = a1.suma2();
       System.out.println("res = " + res);
       
       res=a1.sumaArgs(7,9);
       System.out.println("res usando args = " + res);
       
       //Creacion de 1 Objeto a través del constructor con argumentos
       Aritmetica a2 = new Aritmetica(5,8);
        System.out.println("a: "+a2.a);
        System.out.println("b: "+a2.b);
        
        //variables locales
        var num1 = 5;
        var num2 = 7;
        
        nuevoMetodo();
    }
    public static void nuevoMetodo(){
        System.out.println("Dentro de nuevo Método");
    }
}
