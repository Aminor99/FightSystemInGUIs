//the pane that displays who attacks first, second, who goes more than once, etc
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseAttack extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("ChooseAttack.fxml"));
      Scene scene = new Scene(parent);
      //stage.setTitle("Attack!");
      stage.setTitle("Fight System.");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
     }
 }