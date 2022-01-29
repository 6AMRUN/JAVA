/// @author 6AMRUN
/// @version The date: 4/26/2021
/// Finished Date: 4/30/2021
/// @brief Create GUI using JavaFX for labels, buttons, circles, rectangles and images
/// @note Total time taken to develop, write, test and debug this
/// solution: 4-5 hrs

import javafx.application.Application;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Project12_Week12 extends Application{
	@Override
	public void start(Stage primaryStage) {

		// Flow pane for Labels & Buttons
    	FlowPane pane = new FlowPane();
   	 	pane.setPadding(new Insets(11, 20, 20, 20)); //border size: spacing top(11), right(12), bottom(13), left(14)
    	pane.setHgap(10);
    	pane.setVgap(10);
    	Scene scene = new Scene(pane, 198, 250);

   	 	// New Stage for circle and rectangles
   	 	Stage stage = new Stage();
   	 	Pane pane2 = new Pane();
		Scene scene2 = new Scene(pane2, 350, 456);

		// New pane for images
		Pane pane3 = new HBox(50);
		Scene scene3 = new Scene(pane3);
		Stage stage2 = new Stage();
		pane3.setPadding(new Insets(5, 5, 5, 5));

		// Stage Titles
		primaryStage.setTitle("Alexies Farinas");
		stage.setTitle("Alexies Farinas: Circles & Rectangles");
		stage2.setTitle("Alexies Farinas: Images");

		// Create Text Fields for labels
   		TextField EmpF = new TextField();
		TextField SalaryF = new TextField();
    	TextField SalesF = new TextField();

    	// Name the Labels
    	Label EmpID = new Label("Employee ID: ");
    	Label Salary = new Label("Salary: ");
   		Label Sales = new Label("Sales: ");

   		// Create Buttons
	    Button btAdd = new Button("Clear");
	    Button btAdd2 = new Button("Enter");
	    Button btAdd3 = new Button("Exit");

	    // Insert Labels, TextFields, and Button to pane
		pane.getChildren().addAll(EmpID, EmpF, Salary, SalaryF, Sales, SalesF, btAdd, btAdd2, btAdd3);

		// Display Stage for Flow pane
    	primaryStage.setScene(scene);
   	 	primaryStage.show();


   	 	// Create Cirlce 1
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(75);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.RED);
		pane2.getChildren().add(circle);

		// Create Circle 2
		Circle c2 = new Circle();
		c2.setCenterX(75);
		c2.setCenterY(100);
		c2.setRadius(50);
		c2.setFill(Color.RED);
		c2.setStroke(Color.BLACK);
		pane2.getChildren().add(c2);

		// Create Rectangle 1
		Rectangle rectangle = new Rectangle(250, 200, 75, 150);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.BLUE);
		pane2.getChildren().add(rectangle);

		// Create Rectangle 2
		Rectangle r = new Rectangle(150, 250, 50, 150);
		r.setStroke(Color.BLACK);
		r.setFill(Color.BLUE);
		pane2.getChildren().add(r);

		// Display Stage for Circles & Rectangles
		stage.setScene(scene2);
		stage.show();

		// Create Image 1
		Image image = new Image("csn.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(150);
    	imageView.setFitWidth(150);
		pane3.getChildren().add(imageView);

		// Create Image 2
		Image image2 = new Image("image2.png");
    	ImageView imageView2 = new ImageView(image2);
   	 	imageView2.setFitHeight(150);
    	imageView2.setFitWidth(150);
    	pane3.getChildren().add(imageView2);

    	// Display Stage for Images
		stage2.setScene(scene3);
    	stage2.show();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Entering GUI");
		launch(args);
    }// Main Method

} // Class
