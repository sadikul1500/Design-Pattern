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
public class Main {
    public static void main(String[] args)
    {
        IType file = new Encrypted(new Compressed(new BaseObject()));
        IType file3 = new Header(new Compressed(new BaseObject()));
        file.read();
        file.write();
        System.out.println("---first file done---");
        file3.read();
        file3.write();
    }
    
}
