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
public class ShoppingCart {
    public void pay(IpaymentMethod ipay, int amount)
    {
        ipay.makePayment(amount);
    }
}
