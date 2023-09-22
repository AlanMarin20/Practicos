
package ejercicios;

import java.util.Scanner;
import utils.StackList;

/**
 *
 * @author 54338
 */
public class TestPila {
    public static void main(String[] args) {
        
        StackList<Integer> numero = new StackList<Integer> ();
        int opcion=0;
        Scanner consola= new Scanner(System.in);
        
        do{
            System.out.println("1.Agrega\t2.Elimina\t3.Muestra\t4.Tamaño\t5.Limpia\t6.EstaVacia?");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un valor");
                    Integer dato=consola.nextInt();
                    numero.push(dato);
                break;
                case 2:
                    System.out.println(numero.pop());
                break;
                case 3:
                    System.out.println(numero.top());
                break;
                case 4:
                    System.out.println(numero.size());
                break;
                case 5:
                    numero.makeEmpty();
                break;
                case 6:
                    System.out.println(numero.isEmpty());
                break;
            }
            System.out.println("0.Termina");
            opcion=consola.nextInt();
        }while(opcion!=0);
    }
}
