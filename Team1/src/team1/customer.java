/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1;

/**
 *
 * @author temp
 */
public class customer {
    String custname;
    String custlocation;
    
      public customer(String thename, String thelocation)
   {
       this.custname= thename;
       this.custlocation= thelocation;
       
   }
   public String getcustname()
   {
       return custname;
   }
    public String getcustlocation()
   {
       return custlocation;
   }
    public void sendOrder()
    {
        System.out.println("send order");
    }
    public void receiveOrder()
    {
        System.out.println("receive order");
    }
}
