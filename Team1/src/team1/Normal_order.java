/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team1;

import java.util.Date;

/**
 *
 * @author Mandeep Kaur
 */
public class Normal_order extends Order{
    
    public Normal_order(Date date, String number) {
        super(date, number);
    }
    public void dispatch()
    {
        System.out.println("dispatch normal order");
    }
     public void receive()
    {
        System.out.println("receive normal order");
    }
    
}
