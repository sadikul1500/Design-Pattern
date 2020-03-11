/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author iit
 */
public class BaseObject implements IType{
    @Override
    public void read()
    {
        System.out.println("reading general file");
    }
    
    @Override
    public void write()
    {
        System.out.println("writing general file");
    }
}
