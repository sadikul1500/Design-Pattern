package compositeDesignPattern;

public class Flag extends CompositeShape{
	public Rectangle rectangle = new Rectangle();
	public MyCircle circle = new MyCircle(200, 100, 40);
	
	public void build()
	{
		ishape.add(rectangle);
		ishape.add(circle);		
	}

}
