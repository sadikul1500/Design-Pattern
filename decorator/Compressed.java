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
public class Compressed extends AbstractDecorator{
    public Compressed(IType file)
    {
        super(file);
    }
    
    public void decompress()
    {
        System.out.println("decompressing");
    }
    
    public void compress()
    {
        System.out.println("compressing");
    }
    
    public void read()
    {
        decompress();
        file.read();
    }
    
    public void write()
    {
        file.write();
        compress();
    }
}
