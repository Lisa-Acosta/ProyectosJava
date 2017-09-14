/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapolacainversaapp;

import java.util.Scanner;

/*
    Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) 
    y un signo aritmético (String), según este último se realizara la operación correspondiente. 
    Al final mostrara el resultado. Hacer tantas operaciones como desee el usuario
Los signos aritméticos disponibles son:
+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^: 1º operando como base y 2º como exponente.
%: módulo, resto de la división entre operando1 y operando2.
    */
/**
 *
 * @author Lisa
 */
public class CalculadoraPolacaInversaApp {
    private static Scanner teclado;
    /*private int operando1;
    private int operando2;
    private String operacion;*/

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        teclado = new Scanner (System.in);
        calcula();
    }
    public static void calcula(){
        String ingreso = "SI";
        
        do{
            System.out.println("Ingrese el valor del 1° Operando: ");
            int numero1 = teclado.nextInt();
            System.out.println("Ingrese el valor del 1° Operando: ");
            int numero2 = teclado.nextInt();
            System.out.println("Ingrese la operación: +,-,*,/,^ (Potencia), % (módulo)");
            String operacion = teclado.next();
            double resultado=0;
            char opera = operacion.charAt(0);
        
            switch (opera){
                case '+': resultado = numero1+numero2;break;
                case '-': resultado = numero1-numero2;break;
                case '*': resultado = numero1*numero2;break;
                case '/': resultado = numero1/numero2;break;
                case '^': resultado = Math.pow(numero1,numero2);break;
                case '%': resultado = numero1%numero2;break;
                default:break;
            }
            
            System.out.println("El resultado es: "+resultado);
            System.out.print("Desea seguir calculando operaciones?(SI/NO): ");
            ingreso = teclado.next();
            
        }while(ingreso.equals("SI"));
        System.out.println("Gracias!!");
    }
}
