//gui that shows the users stats
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowStats extends Application {
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("ShowStats.fxml"));
      Scene scene = new Scene(parent);
      stage.setTitle("See your Stats!");
      stage.setScene(scene);
      stage.show();
   }
   public static void main (String[] args) {
      launch(args);
   }
}