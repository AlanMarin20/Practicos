
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int arraySize = 10; // Tamaño del array
        int[] randomArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(1000); // Genera un número aleatorio entre 0 (inclusive) y 1000 (exclusive)
        }
        int opcion=0;
        Scanner consola=new Scanner(System.in);
        Funciones func= new Funciones();
        do{
        System.out.println("\n1. Insercion\t2. shellSort");
        opcion=consola.nextInt();
        switch(opcion){
            case 1:
                func.insercion(randomArray);
            break; 
            case 2:
                func.shellSort(randomArray);
            break;
        }
        }while(opcion!=0);
    }
}
