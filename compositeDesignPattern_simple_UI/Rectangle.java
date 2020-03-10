package compositeDesignPattern;

public class Rectangle extends CompositeShape{

    public void build()
    {
    	ishape.add(new MyLine(100, 50, 300, 50));
        ishape.add(new MyLine(100, 150, 100, 50));
        ishape.add(new MyLine(100, 150, 300, 150));
        ishape.add(new MyLine(300, 150, 300, 50));
        //draw();
    }
}
