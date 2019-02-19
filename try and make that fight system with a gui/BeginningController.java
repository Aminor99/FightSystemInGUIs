//controller class for the beginning gui
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class BeginningController {
   @FXML
   private AnchorPane originalRootPane;
   @FXML
   private TextField inputName;
   @FXML
   private Button enterBattleButton;
   
   //event listener
   public void enterBattleButtonListener() throws IOException {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("ChooseClass.fxml")); //this calls the next window
      originalRootPane.getChildren().setAll(pane); //idk what this does i got this from a video
      
      User.player.setName(inputName.getText()); //this takes the name input by the user and sets it as the name field in the character object
   }
}