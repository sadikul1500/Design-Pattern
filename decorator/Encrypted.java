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
public class Encrypted extends AbstractDecorator{

    public Encrypted(IType file) {
        super(file);
    }
    
    public void decrypt()
    {
        System.out.println("decrypting file");
    }
    
    public void encrypt()
    {
        System.out.println("encrypting file");
    }
    
    public void read()
    {
        decrypt();
        file.read();
    }
    
    public void write()
    {
        file.write();
        encrypt();
    }
}
