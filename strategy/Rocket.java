/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author iit
 */
public class Rocket implements IpaymentMethod{
    public void makePayment(int amount)
    {
        System.out.println("rocket payment done");
    }
}
