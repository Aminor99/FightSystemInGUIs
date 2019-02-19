//controller class for choose item gui

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

public class ChooseItemController {
   @FXML
   private AnchorPane chooseItemPane;
   @FXML
   private  ToggleGroup itemGroup;
   @FXML 
   private ImageView outputItemImage;
   @FXML
   private Label outputItemDescription;
   @FXML
   private Label outputPotionQuantity;
   @FXML
   private Label outputGreaterPotionQuantity;
   @FXML
   private Label outputPanaceaQuantity;
   @FXML
   private Label outputTonicQuantity;
   @FXML
   private Label outputGreaterTonicQuantity;
   @FXML
   private Label outputElixerQuantity;
   @FXML 
   private RadioButton potionRadioButton;
   @FXML 
   private RadioButton greaterPotionRadioButton;
   @FXML 
   private RadioButton panaceaRadioButton;
   @FXML 
   private RadioButton tonicRadioButton;
   @FXML 
   private RadioButton greaterTonicRadioButton;
   @FXML 
   private RadioButton elixerRadioButton;
   
   private Image potionImage = new Image ("potion.png");
   private Image greaterPotionImage = new Image ("greater potion.png");
   private Image panaceaImage = new Image ("panacea.png");
   private Image tonicImage = new Image ("tonic.png");
   private Image greaterTonicImage = new Image ("greater tonic.png");
   private Image elixerImage = new Image ("elixer.png");
   
   public void initialize(){ 
      outputPotionQuantity.setText(String.valueOf(Items.potion.getAmount()));
      outputGreaterPotionQuantity.setText(String.valueOf(Items.greaterPotion.getAmount()));
      outputPanaceaQuantity.setText(String.valueOf(Items.panacea.getAmount()));
      outputTonicQuantity.setText(String.valueOf(Items.tonic.getAmount()));
      outputGreaterTonicQuantity.setText(String.valueOf(Items.greaterTonic.getAmount()));
      outputElixerQuantity.setText(String.valueOf(Items.elixer.getAmount())); 
   }
   
   //event listeners
   public void potionListener(){
      outputItemDescription.setText(Items.potion.getEffect());
      outputItemImage.setImage(potionImage);
      if(Items.potion.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void greaterPotionListener(){
      outputItemDescription.setText(Items.greaterPotion.getEffect());
      outputItemImage.setImage(greaterPotionImage);
      if(Items.greaterPotion.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void panaceaListener(){
      outputItemDescription.setText(Items.panacea.getEffect());
      outputItemImage.setImage(panaceaImage);
      if(Items.panacea.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void tonicListener(){
      outputItemDescription.setText(Items.tonic.getEffect());
      outputItemImage.setImage(tonicImage);
      if(Items.tonic.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void greaterTonicListener(){
      outputItemDescription.setText(Items.greaterTonic.getEffect());
      outputItemImage.setImage(greaterTonicImage);
      if(Items.greaterTonic.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void elixerListener(){
      outputItemDescription.setText(Items.elixer.getEffect());
      outputItemImage.setImage(elixerImage);
      if(Items.elixer.getAmount() == 0){
         outputItemDescription.setText("You don't have anymore of those!");
      }
   }
   public void chooseItemButtonListener() throws Exception {
      
      if(potionRadioButton.isSelected()){
         if(Items.potion.getAmount()>0) {     
            int newHealth = (User.player.getHP() + Items.potion.getPotency());
            User.player.setHP(User.player.getHP() + newHealth);
            Items.potion.setAmount(Items.potion.getAmount()-1);
            if(User.player.getHP()>User.player.getMaxHP()){
               User.player.setHP(User.player.getMaxHP());
            }
         } 
      } else if (greaterPotionRadioButton.isSelected()) {
         if(Items.greaterPotion.getAmount()>0) {     
            int newHealth = (User.player.getHP() + Items.greaterPotion.getPotency());
            Items.greaterPotion.setAmount(Items.greaterPotion.getAmount()-1);
            User.player.setHP(User.player.getHP() + newHealth);
            if(User.player.getHP()>User.player.getMaxHP()){
               User.player.setHP(User.player.getMaxHP());
            }
         } 
      } else if (panaceaRadioButton.isSelected()) {
         if(Items.panacea.getAmount()>0) {     
            User.player.setHP(Items.panacea.getPotency());
            Items.panacea.setAmount(Items.panacea.getAmount()-1);
         } 
      } else if (tonicRadioButton.isSelected()) {
         if(Items.tonic.getAmount()>0) {     
            int newMana = (User.player.getMana() + Items.tonic.getPotency());
            User.player.setMana(User.player.getMana() + newMana);
            Items.tonic.setAmount(Items.tonic.getAmount()-1);
            if(User.player.getMana()>User.player.getMaxMana()){
               User.player.setMana(User.player.getMaxMana());
            }
         } 
      } else if (greaterTonicRadioButton.isSelected()){
         if(Items.greaterTonic.getAmount()>0) {     
            int newMana = (User.player.getMana() + Items.greaterTonic.getPotency());
            User.player.setMana(User.player.getMana() + newMana);
            Items.greaterTonic.setAmount(Items.greaterTonic.getAmount()-1);
            if(User.player.getMana()>User.player.getMaxMana()){
               User.player.setMana(User.player.getMaxMana());
             }
         }
      } else if (elixerRadioButton.isSelected()){
         if(Items.elixer.getAmount()>0) {     
            User.player.setMana(Items.elixer.getPotency());
            Items.elixer.setAmount(Items.elixer.getAmount()-1);
         }
      }
   
      AnchorPane pane = FXMLLoader.load(getClass().getResource("EnemyAppearance.fxml")); //this calls the item pane
      chooseItemPane.getChildren().setAll(pane);
   }
 }
