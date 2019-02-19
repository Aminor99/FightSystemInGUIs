//the pane that asks the user what item they wanna use
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseItem extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("ChooseItem.fxml"));
      Scene scene = new Scene(parent);
      //stage.setTitle("Choose an Item!");
      stage.setTitle("Fight System.");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
     }
 }