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
public abstract class TarjetaNomina extends Tarjeta{

   
    public void pagar(float deposito) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
     
   setSaldo(getSaldo()+deposito);
    }
   //  private int numero;
     
     
     
}
