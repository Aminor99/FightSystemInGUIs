//the pane that displays the choices of magic the uer can choose from
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseMagic extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("ChooseMagic.fxml"));
      Scene scene = new Scene(parent);
      //stage.setTitle("Choose a Spell!");
      stage.setTitle("Fight System.");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
     }
 }