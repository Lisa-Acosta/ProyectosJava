/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica;

import java.util.*;
import java.lang.String;
/**
 *
 * @author Lisa
 */
public class GuiaPractica {
    private static Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        teclado = new Scanner (System.in);
        //suma();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio14Bis();
        //ejercicio14Bis2();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        ejercicio18();
        //ejercicio19();
        //ejercicio20();
        //ejercicio21();
        //ejercicio22();
        //ejercicio23();
        //ejercicio24();
        //ejercicio25();
        //ejercicio26();
        
        
    }

    /*/**
    *
    */
    public static void suma (){
        System.out.print("Ingrese un número:");
        double num1 = teclado.nextDouble();
        System.out.print("Ingrese otro número:");
        double num2 = teclado.nextDouble();
        System.out.print("La suma de los números es:"+(num1+num2));

        
    }
    /**
     * Instrucciones de asignación (entender los cambios en las posiciones de memoria)
a. Escribir un programa que: - Declare e inicialice 3 variables enteras a, b, c 
* con los siguientes valores: a=10; b=-8; c = 36
i. Visualice el contenido de las tres variables
ii. Realice las siguientes operaciones de asignación: a=b; b=c; c = a;
iii. Visualice nuevamente el contenido de las tres variables.
b. Ejecute el programa
c. Explique los cambios en los valores de las variables.
     */
    public static void ejercicio3(){
        int a = 10;
        int b= -8;
        int c= 36;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);
        a=b;
        b=c;
        c=a;
        System.out.println("a = "+a+" b = "+b+" c = "+c);
}
    /*
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
    Si son iguales indicarlo también. Cambiar los valores para comprobar que funciona.
    */
    public static void ejercicio4(){
        int var1 = 8;
        int var2 = 9;
        if (var1 > var2)
            System.out.println("La variable mayor es: "+var1);
        else
            System.out.println("La variable mayor es: "+var2);
        
        if (var1==var2)
            System.out.println("Las dos variables son iguales");          
    }
    
    /*
    Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. 
    Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
    */
    public static void ejercicio5(){
        String nombre = "Lisa";
        System.out.println("Bienvenido "+nombre);
    }
    /*
    Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir por teclado.
    */
    public static void ejercicio6(){
        System.out.print("Ingrese su Nombre:");
        String nombre = teclado.next();
        System.out.println("Bienvenido "+nombre);
    }
    /*
    Haz una aplicación que calcule el área de un círculo (pi*R2). 
    El radio se pedirá por teclado.
    */
    public static void ejercicio7(){
        System.out.print("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: "+area);
    }
    
    /*
    Lee un número por teclado e indica si es divisible entre 2. 
    Si no lo es, también debemos indicarlo.
    */
    public static void ejercicio8(){
        System.out.print("Ingrese un número: ");
        double numero = teclado.nextDouble();
        if (numero % 2 == 0)
            System.out.println("El número ingresado es divisible por 2");
        else 
            System.out.println("El número ingresado no es divisible por 2");
            }
    
    /*
    Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
    Por ejemplo: si introduzco un 97, me muestre una a.
    */
    public static void ejercicio9(){
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        char ascii = (char)numero;
        System.out.print("El número ingresado en ASCII es: "+ascii);
    }
    /*
    Modifica el ejercicio anterior, para que en lugar de pedir un número, 
    pida un carácter (char) y muestre su código en la tabla ASCII.
    */
    public static void ejercicio10(){
        System.out.print("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);
        int codigo = (int)caracter;            
        System.out.println("El código ASCII del caracter ingresado es: "+codigo);
        
    }
    /*
    Lee un número por teclado que pida el precio de un producto y calcule el precio final con IVA. 
    El IVA sera una constante que sera del 21%.
    */
    public static void ejercicio11(){
        System.out.print("Ingrese el Precio del Producto: ");
        double precio = teclado.nextDouble();
        double iva = 21;
        double preciofinal = precio+((precio*iva)/100);
        System.out.println("El precio final del producto con 21%IVA es: "+preciofinal);
    }
    /*
    Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
    */
    public static void ejercicio12(){
        int numero= 1;
        while(numero<=100){
            System.out.println(numero);
             numero++;
        }
    }
    
    /*
    Haz el mismo ejercicio anterior con un bucle for
    */
    public static void ejercicio13(){
        for(int i=1;i<=100;i++)
         System.out.println(i);
    }
    
    /*
    Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3
    Utiliza el bucle que desees.
    */
    public static void ejercicio14(){
        for(int i=1;i<=100;i++){
            if((i%2==0)&&(i%3==0))
                System.out.println("Número divisible por 2 y 3: "+i);
    }
    }
    /*
    Optimizado
    */
    public static void ejercicio14Bis(){
        for(int i=6;i<=100;i+=6)
            System.out.println("Número divisible por 2 y 3: "+i);
    }
    /*
    Menos optimizado
    */
    public static void ejercicio14Bis2(){
        for(int i=1;i<=100;i++){
            if(i%6==0)
              System.out.println("Número divisible por 2 y 3: "+i);
    }
    }
    /*
    Realiza una aplicación que nos pida un número de ventas a introducir,
    después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
    Al final mostrara la suma de todas las ventas.
    */
    public static void ejercicio15(){
        System.out.print("Ingrese el número de ventas que desea sumar: ");
        int ventas = teclado.nextInt();
        int nroVentas = 1;
        double montoTotal = 0;
        while(nroVentas <= ventas){
            System.out.print("Ingrese el monto de la "+nroVentas+"° venta: ");
            double monto = teclado.nextDouble();
            montoTotal+=monto;
            nroVentas++;
        }
        System.out.println("El monto Total de las ventas es: "+montoTotal);
    }
    /*
    Realiza una aplicación que nos calcule una ecuación de segundo grado. 
    Debes pedir las variables a, b y c por teclado.
    */
    public static void ejercicio16(){
        double x1 ;
        double x2 ;
        System.out.println("Ingrese los valores de la ecuación de Segundo Grado");
        System.out.print("Ingrese el valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = teclado.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = teclado.nextDouble();
        double soluciones = Math.pow(b, 2) -(4 * a * c);
        if (soluciones > 0)
        {
            System.out.println("La ecuación tiene dos soluciones");
            x1 = (- b + Math.sqrt(soluciones))/(2*a);
            x2 = (- b - Math.sqrt(soluciones))/(2*a);
            System.out.println("Valor de X1: "+x1);
            System.out.println("Valor de X2: "+x2);
        }
        else {
            if (soluciones == 0)
            {
                System.out.println("La ecuación tiene una solución");
                x1 = (- b )/(2*a);
                System.out.println("Valor de X1: "+x1);
            }
            else
                System.out.print("La ecuación no tiene solución");
        }
    }
    /*
    Lee un número por teclado y comprueba que este número es mayor o igual que cero, 
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
    */
    public static void ejercicio17(){
    double numero;
        do{
          System.out.print("Ingrese un número: ");
          numero = teclado.nextDouble();
        }while( (numero)< 0);
        System.out.println("El número ingresado es: "+numero);
    }
    
    /*
    Login con 3 intentos.
    */
    public static void ejercicio18(){
        int intentos = 0;
        boolean valido = false;
        
        while (valido == false && intentos<3){
            System.out.print("Ingrese usuario: ");
            String usuario = teclado.next();
            
            System.out.print("Ingrese contraseña: ");
            String contraseña = teclado.next();
            
            valido= esValido(usuario, contraseña);
            
            intentos++;
        }
        if(valido == true)
            System.out.print("Logueo Exitoso");
        if( valido == false && intentos ==3)
            System.out.println("Se acabaron los intentos");
    }
    public static boolean esValido(String p_usuario, String p_contraseña){
        String usuarioValido = "Lisa";
        String contraseñaValida= "pass";
        
        return p_usuario.equals(usuarioValido) && p_contraseña.equals(contraseñaValida);
    }
    /*
    Crea una aplicación que nos pida un día de la semana y que nos diga si es 
    un dia laboral o no.
    */
    public static void ejercicio19(){
        System.out.print("Ingrese un día de la semana: ");
        String dia = teclado.next();
        String []diaSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        int indice=7;
        for (int i=0;i<7;i++){
            if(dia.equals(diaSemana[i]))
                indice = i;
            }
        switch (indice){
            case 5: System.out.print("Es fin de semana");break;
            case 6: System.out.print("Es fin de semana");break;
            case 7: System.out.print("No es un día");break;
            default: System.out.print("Es un día Laborable");break;
        }      
     }
    /*
    Pide por teclado dos números y genera 10 números aleatorios entre esos números.
    */
    public static void ejercicio20(){
        System.out.print("Ingrese 2 números para generar aleatorios");
        System.out.print("Ingrese número de inicio: ");
        int inicio = teclado.nextInt();
        System.out.print("Ingrese número de fin: ");
        int fin = teclado.nextInt();
        int intervalo = fin - inicio;
        for (int i= 1;i<=10;i++){
            System.out.println((int)(Math.random()*intervalo)+inicio);
        }
    }
    /*
    Pide por teclado un número entero positivo (debemos controlarlo) 
    y muestra el número de cifras que tiene. 
    */
    public static void ejercicio21(){
        System.out.print("Ingrese un número entero positivo: ");
        int numero = teclado.nextInt();
        System.out.println("El número: "+numero+ " tiene "+ Integer.toString(numero).length()+" cifras");
    }
    
    /*
    Pide un número por teclado e indica si es un número primo o no.
    */
    public static void ejercicio22(){
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        boolean primo = true;
        for(int i = 2; i < numero; i++){
            if (numero%i == 0)
                primo = false;
            }
        if(primo == true)
            System.out.println(numero+" es un número primo" );
        else
            System.out.println(numero+" no es un número primo");
    }
    /*
    Muestra los números primos entre 1 y 100.
    */
    public static void ejercicio23(){
        System.out.println("Números primos entre 1 y 100: ");
        int numero = 1;
        while(numero <=100){
            boolean primo = true;
            for(int i = 2; i < numero; i++){
                if (numero%i == 0)
                    primo = false;
            }
            if(primo == true)
                System.out.println(numero);
            numero++;
        }
    }
    /*
    Del siguiente String “La lluvia en Corrientes fue una pesadilla durante 
    los meses de abril y mayo” cuenta cuantas vocales hay en total.
    */
    public static void ejercicio24(){
        String frase= "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        int vocales=0;
        for(int i = 0;i<frase.length();i++){
            switch(frase.charAt(i)){
                case 'a': vocales++;break;
                case 'e': vocales++;break;
                case 'i': vocales++;break;
                case 'o': vocales++;break;
                case 'u': vocales++;break;
                default:break;
            }
        }
        System.out.println("La frase: ");
        System.out.println(frase);
        System.out.println("tiene "+vocales+" vocales");
    }
/*
    Reemplaza todas las a del String anterior por una e.
    */
    private static void ejercicio25() {
        String frase= "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        System.out.println("Frase Original: "+frase);
        String nuevaFrase =frase.replace('a', 'e');
        System.out.println("Nueva frase: "+nuevaFrase);
    }
    /*
    Recorre el mismo String y transforma cada carácter a su código ASCII.
    Muéstralos en línea recta, separados por un espacio entre cada carácter.
    */
    private static void ejercicio26(){
        String frase= "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        int ascii;
        System.out.println(frase);
        System.out.println("en código ASCII");
        String nuevaFrase="";
        for(int i = 0;i<frase.length();i++){
            ascii=(int) frase.charAt(i);
            System.out.print(ascii+" ");
        }
    }   
}




