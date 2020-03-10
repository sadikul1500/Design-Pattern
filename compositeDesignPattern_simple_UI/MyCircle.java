package compositeDesignPattern;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class MyCircle implements Ishape{
	private int x, y, radius;
	
	public MyCircle()
	{
		this.x = 100;
		this.y = 100;
		this.radius = 1;
	}
	
	public MyCircle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
    public Pane draw(Pane pane)
    {
        pane.getChildren().add(new Circle(x, y, radius));
        return pane;
    }

    public void build()
    {
        System.out.println("Circle built");
    }
}
