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
public class Aritmetica {
    int a;
    int b;
    //metodo 
    public void suma(){
        System.out.println(a+b);
    }
    //si queremos devolver a través de un método un valor, deberemos usar la palabra return
    public int suma2(){
        return a + b;//podriamos ponerlo con this
    }
    //metodo con argumentos pasados
    public int sumaArgs(int valor1, int valor2){
        a = valor1;
        b = valor2;
        return a + b;//podriamos ponerlo con this
    }
    //metodo con el operador this
    public int sumaArgs2 (int valor1, int valor2){
        //si queremos modificar los atributos de nuestra clase
        this.a = valor1;
        this.b = valor2;
        return this.a + this.b;
    }
    /*Nota! Dentro de un método static no podemos usar la palabra this*/
    
    //Constructor vacio
    public Aritmetica(){//constructor sin argumentos
        //si no creamos este y en la clase no hay mas constructores, es como si tuvieramos uno vacio por defecto
    }
    //Segundo constructor
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructores con argumentos");
    }
}
