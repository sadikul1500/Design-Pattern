package compositeDesignPattern;

public class Circle implements Ishape{
    public void draw()
    {
        System.out.println("Circle drawn");
    }

    public void build()
    {
        System.out.println("Circle built");
    }
}