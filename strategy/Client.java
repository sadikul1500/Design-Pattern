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
public class Client {
    
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        cart.pay(new Bkash(), 100);
                
    }
}
