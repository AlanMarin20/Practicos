
public class Funciones {
    public void insercion(int[]array){
        int aux=0;
        System.out.println("Imprecion arreglo original");
        for(int i:array)
            System.out.print(i+"\t");
        for(int i=1;i<array.length;i++){    //recorre hasta el final del arreglo
            for(int j=i;j>0 && array[j]<array[j-1];j--){
                System.out.println("jj:"+j);
                System.out.println("ii:"+i);
                    aux=array[j];
                    array[j]=array[j-1];
                    array[j-1]=aux;
            }
        }
        System.out.println("Imprecion arreglo ordenado");
        for(int i:array)
            System.out.print(i+"\t");
    }
    
    public void shellSort(int[]array){
        System.out.println("Imprecion arreglo original");
        
            for(int i:array)
                System.out.print(i+"\t");
            for(int gap=array.length/2;gap>0;gap/=2){
                for(int i=gap;i<array.length;i++){
                    for(int j=i-gap;j>=0 && array[j]>array[j+gap];j-=gap){
                        int aux=array[j];
                        array[j]=array[j+gap];
                        array[j+gap]=aux;
                    }
            }
            }
            System.out.println("\nImprecion arreglo ordenado");
            for(int i:array)
            System.out.print(i+"\t");
    }
}

