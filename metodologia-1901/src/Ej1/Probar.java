/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author T-107 
 */
public class Probar {
    public static void main(String[] args) {
        
        
        Persona p=new Persona();
        
        p.peso=80;
        p.altura=1.71f;
        
        
        
        Imc i=new Imc();
        
        i.p=p;
        i.calcular();
        
        System.out.println("El IMC de la persona es :"+i.valor);
        
        
    }
}

