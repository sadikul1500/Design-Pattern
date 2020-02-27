package compositeDesignPattern;

public class Main {
	
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.draw();
        System.out.println("\n");
        
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        System.out.println("\n");
        
        Flag flag = new Flag();
        flag.draw();
        System.out.println("\n");
        
    }
}