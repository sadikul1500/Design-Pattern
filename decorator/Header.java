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
public class Header extends AbstractDecorator{
    //public IType file;
    public Header(IType file) {
        super(file);
    }
    
    public void removeHeader()
    {
        System.out.println("removing header");
    }
    
    public void addHeader()
    {
        System.out.println("adding header");
    }
    
    public void read()
    {
        removeHeader();
        file.read();
    }
    
    public void write()
    {
        file.write();
        addHeader();
    }

}
