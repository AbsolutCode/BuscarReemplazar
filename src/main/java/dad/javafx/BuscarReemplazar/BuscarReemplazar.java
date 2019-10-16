package dad.javafx.BuscarReemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {
	
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private Label buscarLabel, reemplazarLabel;
	private TextField buscarText, reemplazarText;
	private CheckBox mayusCheckBox, expresionRegularCheckBox, buscarAtrasCheckBox, resaltarCheckBox;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		// TextFields
		
		buscarText = new TextField();
		buscarText.setPrefColumnCount(4);
		reemplazarText = new TextField();
		reemplazarText.setPrefColumnCount(4);
		
		// Labels
		
		buscarLabel = new Label("Buscar:");
		reemplazarLabel = new Label("Reemplazar con:  ");
		
		// Buttons
		
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		// CheckBoxs
		
		mayusCheckBox = new CheckBox("Mayúsculas y minúsculas");
		expresionRegularCheckBox = new CheckBox("Expresión regular");
		buscarAtrasCheckBox = new CheckBox("Buscar hacia atrás");
		resaltarCheckBox = new CheckBox("Resaltar resultados");
		
		// HBoxs y VBoxs
		
		VBox botones = new VBox(5, buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		VBox labels = new VBox(15, buscarLabel, reemplazarLabel);
		VBox checkbox = new VBox(5, mayusCheckBox, expresionRegularCheckBox);
		VBox checkboxs = new VBox(5, buscarAtrasCheckBox, resaltarCheckBox);
		HBox checkboxes = new HBox(5, checkbox, checkboxs);
		VBox texts = new VBox(5, buscarText, reemplazarText, checkboxes);
		
		// GridPane
		
		GridPane grid = new GridPane();
		
		grid.setPadding(new Insets(5));
	    
		grid.setVgap(5); 
	    grid.setHgap(5);
	    grid.setGridLinesVisible(false);
	    
	    grid.addRow(0, labels, texts, botones);
	    
	    ColumnConstraints [] cols = {
	  			new ColumnConstraints(),
	  			new ColumnConstraints(),
	  			new ColumnConstraints()
	  		};
	  	
	    grid.getColumnConstraints().setAll(cols);
	  	cols[1].setHalignment(HPos.CENTER);
	  	cols[1].setHgrow(Priority.ALWAYS);
	  	cols[1].setFillWidth(true);
		
		// Scene
		
		Scene escena = new Scene(grid, 640, 480);

		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
