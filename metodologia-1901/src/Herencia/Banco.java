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
public class Banco {
    
    public static void main(String[] args ){
    
   
   /* TarjetaCredito t1=new TarjetaCredito();

     t1.setNumero(666);
    
    
     TarjetaAhorro t2=new  TarjetaAhorro();
    //t2.numero=4321;
       TarjetaNomina t3=new  TarjetaNomina();
      // t3.numero=-666;
       
     //  if (t1.getNumero()<0)
     //  {t1.getNumero()=-t1.getNumero();}
           //
        System.out.println("El numero de la carpeta t3 es "+t1.getNumero());
      
    */
   
   TarjetaCredito tcredito=new  TarjetaCredito() {};
   
   tcredito.setNumero(1234);
  tcredito.setNombre("Banamex");
  tcredito.setTipo("Credito");
   tcredito.setSaldo(100);
   
   TarjetaAhorro tahorro=new  TarjetaAhorro() {};
   
   tahorro.setNumero(4321);
    tahorro.setNombre("Bancomer");
     tahorro.setTipo("Ahorro");
   tahorro.setSaldo(100);
   
   
   TarjetaNomina tnom=new TarjetaNomina() {};
   tnom.setNumero(1020);
   tnom.setNombre("Hsbc");
   tnom.setTipo("Nomina");
   tnom.setSaldo(100);
   
   //Gennerar el codigo del deposito
   //vamos a hacerlo de la forma mas basica
   
  /* tnom.pagar(150);
   
   tahorro.pagar(150);
   
   tcredito.pagar(150);
   */
   //Generar un arreglo de tarjetas
   
   Tarjeta tarjetas[]=new Tarjeta[3];
   tarjetas[0]=tnom;
   tarjetas[1]=tahorro;
   tarjetas[2]=tcredito;

   //Iteramos el arreglo
   
   for(Tarjeta t: tarjetas){
       
      // t.pagar(150);
       System.out.println("Saldo es " + t.getSaldo()+ " Tipo " +t.getTipo());
   
       
   }
   
   
   
   
   
    }
    
}
