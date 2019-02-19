//the pane that displays "hey youre in a game, give yourself a name"
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseClass extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("ChooseClass.fxml"));
      Scene scene = new Scene(parent);
      stage.setTitle("Choose Your Class!");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
     }
 }