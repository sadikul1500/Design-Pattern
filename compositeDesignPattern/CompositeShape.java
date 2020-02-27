package compositeDesignPattern;

import java.util.ArrayList;

public abstract class CompositeShape implements Ishape{
    public ArrayList<Ishape> ishape = new ArrayList<>();

    public abstract void build();

    public void draw()
    {
        build();
        for(int i=0; i<ishape.size(); i++)
        {
            ishape.get(i).draw();
        }
    }

    public void add(Ishape shape)
    {
        ishape.add(shape);
    }

}