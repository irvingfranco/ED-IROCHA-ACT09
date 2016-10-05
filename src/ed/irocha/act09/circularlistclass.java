/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.act09;

/**
 *
 * @author casa
 * @param <T>
 */
public class circularlistclass <T> {
    //atributos
    nodeclass pivot;
    
    //construcutor
    public circularlistclass(){
        pivot=null;
    }
    //metodos
    public void insert(T d){
         nodeclass node = new nodeclass(d);
         if(!isempty()){//si no esta vacia insertamos el nodo al inciio y recorremos los nodos
             node.next = pivot;
             findlast().next = node;
             pivot = node;
         }else{// si la lista esta vacia
             pivot = node;
             node.next = node;
         }
    }
    private nodeclass findlast(){
        nodeclass aux=pivot ;
        do{
            aux = aux.next;
        }while(aux.next!=pivot);
        return aux;
    }
    public boolean isempty(){
        return pivot == null;
    }
    public void showlist(){
        nodeclass aux;
        aux=pivot;
        if(isempty()){
            System.out.println("la lista esta vacia");
        }else{
            do{
                System.out.println("["+ aux.getdata()+"]->");
                aux = aux.next;
            }while(aux.next!=pivot);
        }
    }
    public nodeclass searchNode(T data){
        nodeclass aux;
        if (isempty()){ //Si está vacío retorna falso.
            return null;
        }else{ //Si contiene elementos.
            aux = pivot; //colocamos auxiliar al inicio de la lista.
            if(aux.data ==data){
                return aux;
            }else{
                aux = aux.next;
          while(aux.data!=data && aux!=pivot){ //Mientras que no encuentre el dato  o no llegue al final de la lista recorrera la lista
                 aux = aux.next;
            }
            if(aux.data == data){
                return aux;
            } else {
                return null;
            }
            }
    }
    }
     
        public boolean enode(T data){
        nodeclass aux = searchNode(data);
        nodeclass auux = aux;
        if (aux==null){
            System.out.println("o se encontró el nodo");
            return false;
        }else{
             if(aux == pivot){
                findlast().next = aux.next;
                pivot = aux.next;
                aux.next = null;
             
            }else {
              do { 
                    auux = auux.next; 
                } while (auux.next!=aux); 
                auux.next = aux.next; 
                aux.next = null; 
            } return true;
            }
        }
}


