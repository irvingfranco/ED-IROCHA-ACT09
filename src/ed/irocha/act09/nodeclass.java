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
public class nodeclass <T> {
    //Atributos
    public nodeclass next;
     T data;
    //Metodos
    //constructor
    nodeclass(T data){
        this.data = data;
        this.data = null;
    }
    
    public nodeclass(){
        this.data = null;
        this.next = null;
    }
    public T getdata(){
        return this.data;
    }
    public void setdata(T d){
        this.data = d;
    }
}
