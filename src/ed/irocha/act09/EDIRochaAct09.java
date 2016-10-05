/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.act09;

/**
 *
 * @author casa
 */
public class EDIRochaAct09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circularlistclass lista = new circularlistclass();
        lista.insert("Hola Mundo");
        lista.insert(29);
        lista.insert(3.4);
        lista.showlist();
        lista.searchNode("Mundo");
    }
    
}
