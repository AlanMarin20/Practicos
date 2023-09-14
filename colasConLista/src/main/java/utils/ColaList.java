package utils;


public class ColaList<AnyType> {
    
    private Nodo<AnyType> front = null;
    private Nodo<AnyType> back = null;
    
    /**
     * Agrega un nuevo nodo al final de la cola
     * @param element 
     */
    public void push(AnyType element){
       
        Nodo<AnyType> newNodo = new Nodo <AnyType>(element);
        if(front==null){
            front=newNodo;
            back=newNodo;
        }else{
            back.next=newNodo;
            back=newNodo;
        }
    }
    /**
     * Retorna y elimina el primer valor de la cola.
     * @return 
     */
    public AnyType pop(){
        AnyType element = front.data;
        front=front.next;
        return element;
    }
    
    /**
     * Retorna el primer valor de la cola.
     * @return 
     */
    public AnyType top(){
        return front.data;
    }
    
    /**
     * Si la lista esta vacia devuelve true, si tiene al 
     * menos un dato devuelve false.
     * @return 
     */
    public boolean isEmpty(){
        return this.front==null;
    }
    
    /**
     *Elimina todos los elementos de la cola. 
     */
    public void makeEmpty(){
        this.front=null;
        this.back=null;
    }
    
    /**
     * Recorre la cola y retorna el tamaño de la cola.
     * @return 
     */
    public int size(){
        int count=0;
        Nodo<AnyType> actual = this.front;
        while(actual!=null){
            actual=actual.next;
            count++;
        }
        return count;
    }
    
    
}
