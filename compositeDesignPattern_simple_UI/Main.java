package compositeDesignPattern;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Main extends Application{

	Pane paneForShape = new Pane();
	
	public Pane triangle(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		Triangle triangle = new Triangle();
		//paneForShape.getChildren().add(new Line());
        paneForShape = triangle.draw(paneForShape);
        return paneForShape;
	}
	
	public Pane rectangle(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		Rectangle rectangle = new Rectangle();
		 paneForShape = rectangle.draw(paneForShape);
        return paneForShape;
	}
	
	public Pane line(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		 paneForShape.getChildren().add(new Line(50, 100, 400, 100));
        return paneForShape;
	}
	
	public Pane flag(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		Flag flag = new Flag();
		paneForShape = flag.draw(paneForShape);
		return paneForShape;
	}
	
	public Pane star(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		Star star = new Star();
		paneForShape = star.draw(paneForShape);
		return paneForShape;
	}
	
	public Pane circle(Pane paneForShape)
	{
		paneForShape.getChildren().clear();
		 paneForShape.getChildren().add(new Circle(200, 70, 55));
        return paneForShape;
	}
	
	public  BorderPane getPane() {
		HBox paneForButtons = new HBox(30);
		Button bt = new Button("Triangle");
		Button br = new Button("Rectangle");
		Button bl = new Button("Line");
		Button bc = new Button("Circle");
		Button bf = new Button("Flag");
		Button bs = new Button("Star");
		
		paneForButtons.getChildren().addAll(bt, br, bl, bc, bf, bs);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");
		
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
		
		
		bt.setOnAction(e -> paneForShape = triangle(paneForShape));
		br.setOnAction(e -> paneForShape = rectangle(paneForShape));
		bl.setOnAction(e -> paneForShape = line(paneForShape));
		bc.setOnAction(e -> paneForShape = circle(paneForShape));
		bf.setOnAction(e -> paneForShape = flag(paneForShape));
		bs.setOnAction(e -> paneForShape = star(paneForShape));
		
		
		//paneForShape.getChildren().add(text);
		pane.setCenter(paneForShape);
				 
		return pane;
	}
	
	public void start(Stage primaryStage) {
		Scene scene = new Scene(getPane(), 450, 200);
		primaryStage.setTitle("Composite Shape"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	 }
	
    public static void main(String[] args)
    {
        launch(args);
        
        
    }
}

