//controller class for the choose class gui
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ChooseClassController {
   @FXML
   private AnchorPane chooseClassPane; 
   @FXML
   private Label outputClassDescription;
   @FXML
   private Button chooseClassButton;
   @FXML
   private ToggleGroup classToggleGroup;
   @FXML
   private RadioButton warriorRadioButton;
   @FXML
   private RadioButton mageRadioButton;
   @FXML
   private RadioButton paladinRadioButton;
   @FXML
   private RadioButton thiefRadioButton;
   @FXML
   private RadioButton bardRadioButton;
   @FXML
   private RadioButton clericRadioButton;
   @FXML
   private ImageView outputClassImage;
   
   private Image warriorClass = new Image ("warrior class.png");;
   private Image mageClass = new Image ("mage class.png");
   private Image paladinClass = new Image("paladin class.png");
   private Image thiefClass = new Image ("thief class.png");
   private Image bardClass = new Image("bard class.png"); 
   private Image clericClass = new Image("cleric class.png");
   
   //warrior button event listener. gives description of the class and sets character stats if user choses warrior
   public void warriorListener(){
      if(warriorRadioButton.isSelected()){
         outputClassDescription.setText("A brave soul with great attack.");
         User.player.setJob("Warrior");
         User.player.setStats(100, 100, 10, 2, 25, 25, 4, 4, 5);
         outputClassImage.setImage(warriorClass);
      }
   }
   //mage button event listener. gives description of the class and sets character stats if user choses mage
   public void mageListener(){
      if(mageRadioButton.isSelected()){
         outputClassDescription.setText("A powerful wizard that smite foes.");
         User.player.setJob("Mage");
         User.player.setStats(70, 70, 4, 10, 60, 60, 3, 6, 3);
         outputClassImage.setImage(mageClass);
      }
   }
   //paladin button event listener. gives description of the class and sets character stats if user choses paladin
   public void paladinListener(){
       if(paladinRadioButton.isSelected()){
         outputClassDescription.setText("A strong figure ready to defend.");
         User.player.setJob("Paladin");
         User.player.setStats(110, 110, 8, 4, 35, 35, 9, 2, 5);
         outputClassImage.setImage(paladinClass);
      }
   }
   //thief button event listener. gives description of the class and sets character stats if user choses thief
   public void thiefListener(){ //wtf did thief freak out
       if(thiefRadioButton.isSelected()){
         outputClassDescription.setText("A criminal with well balanced stats."); // this does nothing for somereason
         User.player.setJob("Thief");
         User.player.setStats(90, 90, 9, 4, 30, 30, 5, 10, 3);
         outputClassImage.setImage(thiefClass);
      }
   }
   //bard button event listener. gives description of the class and sets character stats if user choses bard
   public void bardListener(){
       if(bardRadioButton.isSelected()){
         outputClassDescription.setText("A musician with balanced stats.");
         User.player.setJob("Bard");
         User.player.setStats(80, 80, 6, 8, 55, 55, 3, 8, 4);
         outputClassImage.setImage(bardClass);
      }
   }
   //cleric button event listener. gives description of the class and sets character stats if user choses cleric
   public void clericListener(){
       if(clericRadioButton.isSelected()){
         outputClassDescription.setText("Wielder of holy magic.");
         User.player.setJob("Cleric");
         User.player.setStats(80, 80, 5, 6, 40, 40, 8, 5, 4);
         outputClassImage.setImage(clericClass);
      }
   }
   
   //make the button event listener display stats,
   public void chooseClassButtonListener() throws IOException {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("ShowStats.fxml")); //this calls the next window
      chooseClassPane.getChildren().setAll(pane);  //figure this out, its keeping the layout and proprties of the first pane. Why?
   }
}