package compositeDesignPattern;

public class Rectangle extends CompositeShape{

    public void build()
    {
        for(int i=0; i<4; i++)
        {
            ishape.add(new Line());
        }
        //draw();
    }
}