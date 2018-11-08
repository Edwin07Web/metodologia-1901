/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public abstract class TarjetaCredito extends Tarjeta {

    
    
    public void pagar(float deposito) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      setSaldo((getSaldo()+deposito)-deposito*0.03f);
    }
    
    
    
    
    // private int numero; 
    
   /* public void setNumero(int x){
   //if (x<0)x=-x;
        numero=x;
       
   }
   */    
    
    /* public void setNumero(int numero){

      this.numero=numero;
      
      
    }

    public int getNumero(){
    return numero;
    
    }
   */ 

    /**
     * @return Este metodo te regrea el valor del numero de tu tarjeta
     */
   /* public int getNumero() {
        return numero;
    }

    /**
     * @param numero Aqui debes introducir en los pararentesis n valor del numero de la tarjeta
     */
   /* public void setNumero(int numero) {
        this.numero = numero;
    }
   
    */

    
}
