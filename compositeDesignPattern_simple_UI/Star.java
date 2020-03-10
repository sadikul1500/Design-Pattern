package compositeDesignPattern;

public class Star extends CompositeShape{
	//public Rectangle rectangle = new Rectangle();
	//public MyCircle circle = new MyCircle(200, 100, 40);
	
	public void build()
	{
		ishape.add(new MyLine(100, 160, 200, 10));
		ishape.add(new MyLine(200, 10, 300, 160));
		ishape.add(new MyLine(300, 160, 80, 50));
		ishape.add(new MyLine(80, 50, 320, 50));
		ishape.add(new MyLine(100, 160, 320, 50));
		
	}

}
