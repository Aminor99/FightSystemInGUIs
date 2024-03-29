//the pane that displays the enemy and asks the user what the wanna do
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnemyAppearance extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("EnemyAppearance.fxml"));
      Scene scene = new Scene(parent);
      //stage.setTitle("An Enemy Appeared!");
      stage.setTitle("Fight System.");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
     }
 }