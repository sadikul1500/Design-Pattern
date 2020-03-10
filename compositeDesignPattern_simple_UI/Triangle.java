package compositeDesignPattern;

public class Triangle extends CompositeShape{

    public void build()
    {
        //for(int i=0; i<3; i++)
        //{
           ishape.add(new MyLine(200, 50, 100,150));
           ishape.add(new MyLine(100, 150, 300, 150));
           ishape.add(new MyLine(300, 150, 200, 50));
        //}
        //draw();
    }
}
