//the controller class for the show stats gui
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowStatsController {
   @FXML
   private AnchorPane statsScreenPane;
   @FXML
   private Button toTheBattleButton;
   @FXML
   private Label outputName;
   @FXML
   private Label outputClass;
   @FXML
   private Label outputHP;
   @FXML
   private Label outputAttack;
   @FXML
   private Label outputMagicAttack;
   @FXML
   private Label outputMana;
   @FXML
   private Label outputDefense;
   @FXML
   private ImageView outputPortraitImage;
   
   private static Image warriorImage = new Image("warrior.png");
   private static Image mageImage = new Image("mage.png");
   private static Image thiefImage = new Image("thief.png");
   private static Image paladinImage = new Image("paladin.png");
   private static Image bardImage = new Image("bard.png");
   private static Image clericImage = new Image("cleric.png");
   
   //fills the labels with text with the respective stats of the user
   public void initialize(){
      outputName.setText(User.player.getName());
      outputClass.setText(User.player.getJob());
      outputHP.setText("HP: " + User.player.getHP());
      outputAttack.setText("Attack: " + User.player.getAttack());
      outputMagicAttack.setText("Magic Attack: " + User.player.getMagicAttack());
      outputMana.setText("Mana: " + User.player.getMana());
      outputDefense.setText("Defense: " + User.player.getDefense());
      
      if(User.player.getJob().equals("Warrior")) {
         outputPortraitImage.setImage(warriorImage);
      } else if (User.player.getJob().equals("Mage")) {
         outputPortraitImage.setImage(mageImage);
      } else if (User.player.getJob().equals("Paladin")) {
         outputPortraitImage.setImage(paladinImage);
      } else if (User.player.getJob().equals("Thief")) {
         outputPortraitImage.setImage(thiefImage);
      } else if (User.player.getJob().equals("Bard")) {
         outputPortraitImage.setImage(bardImage);
      } else if (User.player.getJob().equals("Cleric")){
         outputPortraitImage.setImage(clericImage);
      }
   }
   public void toBattleButtonListener() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("EnemyAppearance.fxml")); 
      statsScreenPane.getChildren().setAll(pane); 
   }
}
