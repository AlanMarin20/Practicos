
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0 , numOpcion=0;
        Scanner consola=new Scanner(System.in);
        EjerciciosRecursividad ej= new EjerciciosRecursividad();
       
        do{    
            System.out.println("Ingrese 0.termina/t1.Factorial/t2.Sumatoria/t3.Potencia/t4.Conteo/5.Multiplicacion/6.ArregloRecursivo");
            numOpcion=consola.nextInt();
            switch(numOpcion){
                case 1:
                    System.out.println("Ingrese un numero");
                    num=consola.nextInt();
                    System.out.println(ej.factorial(num));
                break;
                case 2:
                    System.out.println("Ingrese un numero");
                    num=consola.nextInt();
                    System.out.println(ej.sumatoria(num));
                break;
                case 3:
                    int exp=0;
                    System.out.println("Ingrese la base");
                    num=consola.nextInt();
                    System.out.println("Ingrese el exponente");
                    exp=consola.nextInt();
                    System.out.println(ej.potencia(num,exp));
                break;
                case 4:
                    System.out.println("Ingrese un numero");
                    num=consola.nextInt();
                    System.out.println(ej.conteo(num));
                break;
                case 5:
                    int n1=0;
                    System.out.println("Ingrese un numero");
                    num=consola.nextInt();
                    System.out.println("Ingrese un numero");
                    n1=consola.nextInt();
                    System.out.println(ej.multiplicacion(n1,num));
                break;
                case 6:
                    int n=0, i=0;
                    System.out.println("Ingrese el tamaño del arreglo");
                    n=consola.nextInt();
                    int arreglo[]=new int[n];
                    for(i=0;i<n;i++){
                       System.out.println("Ingrese un numero"); 
                       arreglo[i]=consola.nextInt();
                    }
                    System.out.println(ej.printArray(arreglo,n));
            }
        }while(numOpcion!=0);
    }
}
