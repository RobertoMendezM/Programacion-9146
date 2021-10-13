
/**
 * Ejemplo tomado de:
 *  BlueJ
 *  
 *  Clase: 13/Oct/2021
 *  Curso: Programación
 *  Objetivo: Mostrar JavaFx
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ejemplo1 extends Application
{
    
    private int count = 0;
    private Label myLabel = new Label("0");

    
    @Override
    public void start(Stage stage)
    {
       
        Button myButton = new Button("Contador");

       
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(30, 10, 10, 50));
        pane.setMinSize(300, 300);
        pane.setVgap(200);
        pane.setHgap(50);

        myButton.setOnAction(this::buttonClick);

        pane.add(myButton, 1, 0);
        pane.add(myLabel, 0, 0);
     

        // JavaFX Scene -obligatorio-
        Scene scene = new Scene(pane, 300,100);
        stage.setTitle("Contador con JavaFX");
        stage.setScene(scene);

    
        stage.show();
    }

   
    private void buttonClick(ActionEvent event)
    {
        count = count + 1;
        myLabel.setText(Integer.toString(count));
    }
}
