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
public class Economical extends TourPackage{
    
    @Override
    public void ghurbo()
    {
        System.out.println("travel by walking");
    }
    
    @Override
    public void jabo()
    {
        System.out.println("go by walking");
    }
    
    @Override
    public void firbo()
    {
        System.out.println("return by walking");
    }
    
}
