/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author iit
 */
public class Client {
    public static void main(String arg[])
    {
        TourPackage luxuryPackage = new Luxury();
        luxuryPackage.hire();
        
        TourPackage deluxPackage = new Delux();
        deluxPackage.hire();
        
        TourPackage poorPackage = new Economical();
        poorPackage.hire();
        
    }
}
