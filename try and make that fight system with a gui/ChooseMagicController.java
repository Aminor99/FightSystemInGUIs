//controller class for the chosoe magc pane

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ChooseMagicController {
   @FXML 
   private AnchorPane chooseMagicPane;
   @FXML
   private ToggleGroup magicGroup;
   @FXML 
   private RadioButton firaRadioButton;
   @FXML 
   private RadioButton blizzaRadioButton;
   @FXML 
   private RadioButton thundaRadioButton;
   @FXML 
   private RadioButton aeroRadioButton;
   @FXML
   private Label outputFiraDamage;
   @FXML
   private Label outputBlizzaDamage;
   @FXML
   private Label outputThundaDamage;
   @FXML
   private Label outputAeroDamage;
   @FXML
   private Label outputFiraMana;
   @FXML
   private Label outputBlizzaMana;
   @FXML
   private Label outputThundaMana;
   @FXML
   private Label outputAeroMana;
   @FXML
   private Button chooseSpellButton;
   @FXML
   private ImageView outputMagicImage;
   
   private Image firaImage;
   private Image blizzaImage;
   private Image thundaImage;
   private Image aeroImage;
   
   private static MagicAttacks f = MagicAttacks.fira;
   private static MagicAttacks b = MagicAttacks.blizza;
   private static MagicAttacks t = MagicAttacks.thunda;
   private static MagicAttacks a = MagicAttacks.aero;
   
   public void initialize(){
      outputFiraDamage.setText(String.valueOf(MagicAttacks.fira.getSpellDamage()));
      outputBlizzaDamage.setText(String.valueOf(MagicAttacks.blizza.getSpellDamage()));
      outputThundaDamage.setText(String.valueOf(MagicAttacks.thunda.getSpellDamage()));
      outputAeroDamage.setText(String.valueOf(MagicAttacks.aero.getSpellDamage()));
      
      outputFiraMana.setText(String.valueOf(MagicAttacks.fira.getMP()));
      outputBlizzaMana.setText(String.valueOf(MagicAttacks.blizza.getMP()));
      outputThundaMana.setText(String.valueOf(MagicAttacks.thunda.getMP()));
      outputAeroMana.setText(String.valueOf(MagicAttacks.aero.getMP()));
   }
   //event listenrs
   public void firaListener(){
      //outputMagicImage.setImage(firaImage);
   }
   public void blizzaListener(){
      //outputMagicImage.setImage(blizzaImage);
   }
   public void thundaListener(){
      //outputMagicImage.setImage(thundaImage);
   }
   public void aeroListener(){
      //outputMagicImage.setImage(aeroImage);
   }
   
   public MagicAttacks getValues() { //this is just to get the selected magic attack :/
      if(firaRadioButton.isSelected()){
         return f;
      } else if (blizzaRadioButton.isSelected()){
         return b;
      } else if (thundaRadioButton.isSelected()){
         return t;
      } else if (aeroRadioButton.isSelected()){
         return a;
      }
      return null;
   }
   
   public void chooseSpellButton() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("MagicAttack.fxml")); //this calls the item pane
      chooseMagicPane.getChildren().setAll(pane);
   }
   
}