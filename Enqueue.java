
public class Enqueue <AnyType> {
    
    private Integer front;//Indice del primero.
    private Integer back;//Indice del ultimo.
    private Integer size;//Tamaño del arreglo.
    private Integer count;//Cantidad de espacios llenos
    
    private AnyType array[];
    
    public Enqueue (Integer size){
        this.size = size;
        this.count=0;
        this.front = 0;
        this.back = 0;
        this.array = (AnyType[])new Object[size];
    }
    
    
    //Agrega un valor a la cola.
    public void Push(AnyType item) throws Exception {
    if(isFull())
        throw new Exception("La cola esta completa");
    else{
        this.array[this.back]=item;
        this.count++;
        if(this.back==(this.size-1))
            this.back=0;
        else
            this.back++;
    }
    } 
    
    //Elimina el primer valor de la cola.
    public void pop() throws Exception{
    if(isEmpty())
        throw new Exception("La cola esta vacia");
    else{
        this.count--;
        if(this.back==0)
            this.back =(this.size-1);
        else
            this.back--;
    }
    }
    
    //Retorna el primer valor de la cola.
    public AnyType top(){
        return this.array[front];
    }
    
    //Responde si la cola esta vacia.
    public Boolean isEmpty(){
        return this.front==this.back;
    }
    
    //Borra la lista
    public void makeEmpty(){
        /*this.front=0;
        this.back=0; Hace lo mismo que la linea siguiente
        */
        this.front=this.back=0;
    }
    
    //Responde si la cola esta llena
    public Boolean isFull(){
        return (size-1)==count;
    }
    
    
}
