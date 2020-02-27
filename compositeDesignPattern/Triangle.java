package compositeDesignPattern;

public class Triangle extends CompositeShape{

    public void build()
    {
        for(int i=0; i<3; i++)
        {
            ishape.add(new Line());
        }
        //draw();
    }
}