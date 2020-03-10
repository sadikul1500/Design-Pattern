package compositeDesignPattern;

import javafx.scene.layout.Pane;
import java.util.ArrayList;

public abstract class CompositeShape implements Ishape{
    public ArrayList<Ishape> ishape = new ArrayList<>();

    public abstract void build();

    public Pane draw(Pane pane)
    {
        build();
        for(int i=0; i<ishape.size(); i++)
        {
           pane =  ishape.get(i).draw(pane);
        }
        
        return pane;
    }

    public void add(Ishape shape)
    {
        ishape.add(shape);
    }

}
