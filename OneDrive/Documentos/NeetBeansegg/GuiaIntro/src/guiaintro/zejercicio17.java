/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guiaintro;

import java.util.Scanner;


public class zejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         int cont =0;
         int contf=0;
         String salir;
        do  {
            System.out.println("ingrese una frase");
        String frase= leer.next();
        int longitud = frase.length();
        
        if(frase.substring(0,1).equals("x") && frase.substring(longitud-1,longitud).equals("o")&& longitud==5)   {
           cont+=1; 
        }else   { 
            contf+=1 ; }
       
        System.out.println("los correctos son : "+cont); System.out.println("los incorrectos son : " + contf );
            System.out.println("desea salir (S/N)");
             salir = leer.next();
        
    }while (!salir.equals("s"));
    
}
}
