//controller class for the choose atack pane
import java.util.Random;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ProgressBar;

public class ChooseAttackController {
   @FXML
   private AnchorPane chooseAttackPane;
   @FXML
   private Button nextButton;
   @FXML
   private ImageView outputFirstAttackerImage;
   @FXML
   private ImageView outputSecondAttackerImage;
   @FXML
   private Label outputWhoAttacksFirst;
   @FXML
   private Label outputWhoAttacksSecond;
   @FXML
   private Label outputAttackInfo;   
   
   private String loadAttackingText[] = {"Attacking.","Attacking..","Attacking..."}; //figure this out
   
   private int r = 8;
   
   private Image tinyWarriorImage = new Image("tiny warrior.png");
   private Image tinyThiefImage = new Image("tiny thief.png");
   private Image tinyMageImage = new Image("tiny mage.png");
   private Image tinyBardImage = new Image("tiny bard.png");
   private Image tinyPaladinImage = new Image("tiny bard.png");
   private Image tinyClericImage = new Image("tiny cleric.png");
   
   //initialize method
   public void initialize() throws InterruptedException { //exeption is for the thread
   
      if(EnemyAppearanceController.chosenEnemy.getSpeed() > (User.player.getSpeed())) { //if the enemy is faster than the user
         //first attacker image is the enemy
         outputWhoAttacksFirst.setText("The " + EnemyAppearanceController.chosenEnemy.getName() + " attacks " + User.player.getName() + "!");
         outputFirstAttackerImage.setImage(EnemyAppearanceController.getChosenEnemyImage());
         outputSecondAttackerImage.setImage(getUserTinyImage());
         
         attackUser(EnemyAppearanceController.chosenEnemy, User.player);
         
      } else if (User.player.getSpeed() > (EnemyAppearanceController.chosenEnemy.getSpeed())){ // if the user is faster than the enemy
         //first attacker is the user
         outputWhoAttacksFirst.setText(User.player.getName() + " attacks the " + EnemyAppearanceController.chosenEnemy.getName() + "!");
         outputFirstAttackerImage.setImage(getUserTinyImage());
         outputSecondAttackerImage.setImage(EnemyAppearanceController.getChosenEnemyImage());
         
         attackEnemy(User.player, EnemyAppearanceController.chosenEnemy);
         
      } else if (User.player.getSpeed() == (EnemyAppearanceController.chosenEnemy.getSpeed())){ //if the speeds are equal
         //first attacker in the user
         outputWhoAttacksFirst.setText(User.player.getName() + " attacks the " + EnemyAppearanceController.chosenEnemy.getName() + "!");
         outputFirstAttackerImage.setImage(getUserTinyImage());
         outputSecondAttackerImage.setImage(EnemyAppearanceController.getChosenEnemyImage());
         
         attackEnemy(User.player, EnemyAppearanceController.chosenEnemy);
         
      } 
      
      /*for(int i = 0; i < 3; ++i){
         Thread.sleep(2000); //so that the text is updated slowly
         outputAttackInfo.setText(loadAttackingText[i]); //FIGURE THIS OUT  
      }  */ 
   }
   
   public int getRandomAttackRate(){ //is this really necessary :/
      Random ranAtkRate = new Random();
      int attackRate = ranAtkRate.nextInt(20);
      return attackRate;
   }
   
   //called if the enemy attacks first
   public void attackUser(Enemy e, User u){
     if((e.getAttackRate() + getRandomAttackRate()) > 8){ //if the enemy attacks the user
         outputAttackInfo.setText("The " + e.getName() + " attacks for " + (e.getAttack() - u.getDefense()) + " damage!");
         u.setHP(u.getHP() - (e.getAttack() - u.getDefense()));
         if(u.getHP() <= 0){ //this is for if the player dies
            //send user to game over pane
         }
         outputWhoAttacksSecond.setText(u.getName() + " retaliates and attacks the  " + e.getName() + " for " + u.getAttack() + " damage!");
         e.setHP((e.getHP() - u.getAttack()));
         if(e.getHP() <= 0){ //this is for if the enemy is dead
            //find a way to get the thing to stop looping
         }   
     } else { //if the enemy misses
         outputAttackInfo.setText("The " + e.getName() + " missed!");
         outputWhoAttacksSecond.setText(u.getName() + " takes a chance and attacks the  " + e.getName() + " for " + u.getAttack() + " damage!");
         e.setHP((e.getHP() - u.getAttack()));
         if(e.getHP() <= 0){ //this is for if the enemy is dead
            //find a way to get the thing to stop looping
         } 
     }
   }
   
   //called if the user attacks the enemy
   public void attackEnemy(User u, Enemy e){
      if((u.getAttackRate() + getRandomAttackRate()) > 8){ //the user hits the enemy
         outputAttackInfo.setText(u.getName() + " attacks the  " + e.getName() + " for " + u.getAttack() + " damage!");
         e.setHP((e.getHP() - u.getAttack())); //then the user attacks the monster
         if(e.getHP() <= 0){ //this is for if the enemy is dead
            //HAVE A PANE THAT GOES "hey you won good job wanna fight again?" BAM
         } else { //if the enemy isnt dead, the player attacks back
            outputWhoAttacksSecond.setText("The " + e.getName() + " strikes back for " + (e.getAttack() - u.getDefense()) + " damage!");
            u.setHP(u.getHP() - (e.getAttack() - u.getDefense()));
         }
         
          //this is for if the enenmy is still alive
      } else { //if the user whiffs the attack lol
         outputAttackInfo.setText(u.getName() + " misses the attack!");
         outputWhoAttacksSecond.setText("The " + e.getName() + " attempts to strikes back for " + e.getAttack() + " damage!");
         u.setHP(u.getHP() - (e.getAttack() - u.getDefense())); 
         if(u.getHP() <= 0){ //this is for if the player dies
            //send user to game over pane
         }
      }
   }
   public Image getUserTinyImage(){
      //ill update the tiny portraits later but for now im gonna user what i already have
      if(User.player.getJob().equals("Warrior")) {
         return tinyWarriorImage;
      } else if(User.player.getJob().equals("Thief")) {
         return tinyThiefImage;
      } else if (User.player.getJob().equals("Mage")) {
         return tinyMageImage;
      } else if(User.player.getJob().equals("Bard")) {
         return tinyBardImage;
      } else if(User.player.getJob().equals("Paladin")) {
         return tinyPaladinImage;
      } else if (User.player.getJob().equals("Cleric")) {
         return tinyClericImage;
      }   
      return null;
    }
   
   //event listeners
   public void nextButtonListener() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("EnemyAppearance.fxml")); 
      chooseAttackPane.getChildren().setAll(pane); 
   }
}