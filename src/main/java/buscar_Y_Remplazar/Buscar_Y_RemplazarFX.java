package buscar_Y_Remplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buscar_Y_RemplazarFX extends Application{
	
	private GridPane root;
	
	private Label Buscar_Label;
	private TextField Buscar_TextField;
	private Button Button_Buscar;
	
	private Label Remplazar_Label;
	private TextField Remplazar_TextField;
	
	
	private VBox Checkbox_VBox_1;
	private CheckBox Mym_CheckBox;
	private CheckBox HaciaAtras_CheckBox;
	
	
	private VBox Checkbox_VBox_2;
	private CheckBox ExpresionRegular_CheckBox;
	private CheckBox ResaltarResultados_CheckBox;
	
	private HBox Group_Checkbox_1;
	
	private VBox buttons_VBox;
	
	private Button Remplazar_Button;
	private Button RemplazarTodo_Button;
	private Button Cerrar_Button;
	private Button Ayuda_Button;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Primera Fila
		Buscar_Label= new Label();
		Buscar_Label.setText("Buscar:");
		Buscar_Label.setAlignment(Pos.BASELINE_LEFT);
		
		Buscar_TextField= new TextField();
		Buscar_TextField.setText("Buscar");
		Buscar_TextField.setAlignment(Pos.BASELINE_CENTER);
		
		Button_Buscar= new Button();
		Button_Buscar.setText("Buscar");
		Button_Buscar.setAlignment(Pos.BASELINE_CENTER);
		
		Remplazar_Button= new Button();
		Remplazar_Button.setText("Remplazar"); 
		
		RemplazarTodo_Button= new Button();
		RemplazarTodo_Button.setText("Remplazar Todo");
		
		Cerrar_Button= new Button();
		Cerrar_Button.setText("Cerrar");
		
		Ayuda_Button= new Button("Ayuda");
		Ayuda_Button.setAlignment(Pos.BASELINE_CENTER);
		
		buttons_VBox= new VBox();
		buttons_VBox.setSpacing(3);
		buttons_VBox.getChildren().addAll(RemplazarTodo_Button, Cerrar_Button, Ayuda_Button);
		
		//Segunda Fila
		Remplazar_Label= new Label();
		Remplazar_Label.setText("Remplazar con:");
		Remplazar_Label.setAlignment(Pos.BASELINE_LEFT);
		
		Remplazar_TextField= new TextField();
		Remplazar_TextField.setAlignment(Pos.BASELINE_CENTER);
		
		//Tercera Fila
		Mym_CheckBox=new CheckBox("Mayúsculas y minúsculas");
		Mym_CheckBox.setSelected(false);
		
		HaciaAtras_CheckBox= new CheckBox("Buscar Hacia Atrás");
		HaciaAtras_CheckBox.setSelected(false);
		
		ExpresionRegular_CheckBox= new CheckBox("Expresión Regular");
		ExpresionRegular_CheckBox.setSelected(false);
		
		ResaltarResultados_CheckBox= new CheckBox("Resaltar Resultados");
		ResaltarResultados_CheckBox.setSelected(false);
		
		Checkbox_VBox_1= new VBox();
		Checkbox_VBox_1.setSpacing(5);
		Checkbox_VBox_1.setAlignment(Pos.BASELINE_LEFT);
		Checkbox_VBox_1.getChildren().addAll(Mym_CheckBox,ExpresionRegular_CheckBox);
		
		Checkbox_VBox_2= new VBox();
		Checkbox_VBox_2.setSpacing(5);
		Checkbox_VBox_2.getChildren().addAll(HaciaAtras_CheckBox, ResaltarResultados_CheckBox);
		
		Group_Checkbox_1= new HBox(Checkbox_VBox_1,Checkbox_VBox_2);
		Group_Checkbox_1.setSpacing(10);
		
		//GridPane
		
		GridPane root= new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.addRow(0, Buscar_Label, Buscar_TextField);
		root.addRow(1, Remplazar_Label, Remplazar_TextField);
		root.add(Group_Checkbox_1, 1, 2);
		root.add(Button_Buscar, 2, 0);
		root.add(Remplazar_Button, 2, 1);
		root.add(buttons_VBox, 2, 2);
		//root.add(Checkbox_VBox_2, 2, 2);
		//root.addRow(2, Mym_CheckBox, HaciaAtras_CheckBox);
		//root.addRow(3, ExpresionRegular_CheckBox, ResaltarResultados_CheckBox);
		GridPane.setFillWidth(Buscar_Label, true);
		GridPane.setFillWidth(Remplazar_Label, true);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints(),	
			};
		
		root.getColumnConstraints().setAll(cols);
		
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		cols[1].setHalignment(HPos.LEFT);
		
		GridPane.setHalignment(Buscar_Label, HPos.LEFT);
		
		RowConstraints [] rows = {	
				new RowConstraints(),	
				new RowConstraints(),	
				new RowConstraints(),	
				new RowConstraints(),	
				new RowConstraints(),	
			};
		
		rows[2].setVgrow(Priority.NEVER);
		rows[3].setVgrow(Priority.NEVER);
		
		GridPane.setFillWidth(Button_Buscar, true);
		Button_Buscar.setMinWidth(100);
		
		GridPane.setFillWidth(Remplazar_Button, true);
		Remplazar_Button.setMinWidth(100);
		
		GridPane.setFillWidth(RemplazarTodo_Button, true);
		RemplazarTodo_Button.setMinWidth(100);
		
		GridPane.setFillWidth(Cerrar_Button, true);
		Cerrar_Button.setMinWidth(100);
		
		GridPane.setFillWidth(Ayuda_Button, true);
		Ayuda_Button.setMinWidth(100);
		/*
		 * GridPane.setFillWidth(Checkbox_VBox_1, false);
		 * GridPane.setFillWidth(Checkbox_VBox_2, false);
		 */
		
		Scene scene= new Scene(root,640,400);
		primaryStage.setTitle("Buscar y remplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
