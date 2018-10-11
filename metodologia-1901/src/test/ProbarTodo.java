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
public class ProbarTodo {
    public static void main(String[]args){
        Opcion op1=new Opcion("El azucar y la Harina", true);
       //System.out.println("Tu titulo es "+op1.titulo); 
        //System.out.println("Es correcta" +op1.correcta);  
       
        Opcion op2=new Opcion("La grasa", false);
         Opcion op3=new Opcion("El Sol", false);
          Opcion op4=new Opcion("La contaminacion", false);
           Opcion op5=new Opcion("La Sal", false);
           
           
           //Se crean los arreglos asi, los []van primero. 
           Opcion[] opciones={op1,op2,op3,op4,op5};
           
           //Para hacer la pregunta, "Primero es de tipo String", el segundo de Tipo Arreglo.
           Pregunta p1=new Pregunta("Este es la principal causa del Cancer",opciones);
           
           System.out.println(p1.titulo);
           
           //ciclo for nuevo
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
           
        }
           
    }
}
