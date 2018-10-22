/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author T-107
 */
public class ProbarExamen {
    public static void main(String[]args){
        Opcion op1=new Opcion("El Popocatepelt",false);
       //System.out.println("Tu titulo es "+op1.titulo); 
        //System.out.println("Es correcta" +op1.correcta);  
       
        Opcion op2=new Opcion("El Everest", true);
         Opcion op3=new Opcion("El Aconcagua", false);
          Opcion op4=new Opcion("El Pico de Orizaba", false);
           
           
           
           //Se crean los arreglos asi, los []van primero. 
           Opcion[] opciones={op1,op2,op3,op4};
           
           //Para hacer la pregunta, "Primero es de tipo String", el segundo de Tipo Arreglo.
           Pregunta p1=new Pregunta("¿Cual es la montaña más alta del mundo",opciones);
           
           System.out.println(p1.titulo);
           
           //ciclo for nuevo
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
           
        }
           
    }
}
