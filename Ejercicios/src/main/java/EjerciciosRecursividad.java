
public class EjerciciosRecursividad {
   public int factorial(int num){
            if(num==1){
                return 1;
            }else{
                return num*factorial(num-1);
            }
        } 
   public int sumatoria(int num){
       if(num==0){
           return 0;
       }else{
           return num+sumatoria(num-1);
       }
   }
   public int potencia(int base, int exp){
       if(exp==0){
           return 1;
       }else{
           return base*potencia(base,exp-1);
       }
   }
   public int conteo(int num){
       if(num==0){
           return 0;
       }else{
           System.out.println(num);
           return conteo(num-1);
       }
   }
   public int multiplicacion(int n1, int n2){
       if(n2==1){
           return n1;
       }else{
           return n1+multiplicacion(n1,n2-1);
       }
   }
   public int printArray(int arreglo[],int n){
       if(n==1){
           return arreglo[0];
       }else{
           System.out.println(arreglo[n-1]);
           return printArray(arreglo,n-1);
       }
   }
   
}
