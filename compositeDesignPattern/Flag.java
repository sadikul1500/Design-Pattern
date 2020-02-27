package compositeDesignPattern;

public class Flag extends CompositeShape{
	public Rectangle rectangle = new Rectangle();
	public Circle circle = new Circle();
	
	public void build()
	{
		ishape.add(rectangle);
		ishape.add(circle);		
	}

}