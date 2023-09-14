
package Test;

import java.util.Scanner;
import utils.ColaList;


public class TestCola {
    public static void main(String[] args) {
        ColaList<Integer> numeros=new ColaList<Integer>();
        int opcion=0;
        Scanner consola= new Scanner(System.in);
        
        do{
            System.out.println("1.Agrega\t2.Elimina\t3.Muestra\t4.Tamaño\t5.Limpia\t6.EstaVacia?");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un valor");
                    Integer dato=consola.nextInt();
                    numeros.push(dato);    
                break;
                case 2:
                    System.out.println(numeros.pop());    
                break;
                case 3:
                    System.out.println(numeros.top());
                break;
                case 4:
                    System.out.println(numeros.size());    
                break;
                case 5:
                    numeros.makeEmpty();    
                break;
                case 6:
                    System.out.println(numeros.isEmpty());    
                break;
            }
        System.out.println("0. Termina");
        opcion=consola.nextInt();
        }while(opcion!=0);
    }
}
