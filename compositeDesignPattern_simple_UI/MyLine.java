package compositeDesignPattern;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class MyLine implements Ishape{
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	public MyLine()
	{
		this.startX = 0;
		this.endX = 100;
		this.startY = 0;
		this.endY =  100;
	}
	
	public MyLine(int x1,  int y1, int x2, int y2)
	{
		this.startX = x1;
		this.endX = x2;
		this.startY = y1;
		this.endY =  y2;
	}
	@Override
	public Pane draw(Pane pane)
    {
        pane.getChildren().add(new Line(startX, startY, endX, endY));
        return pane;
    }
    public void build()
    {
    	//ishape.add(new Line());
    }

	

	
}
