//controller class for the enemy appearance pane
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ProgressBar;

public class EnemyAppearanceController {
   @FXML
   private AnchorPane enemyAppearancePane;
   @FXML
   private ImageView outputEnemyImage;
   @FXML 
   private Label outputEnemyAppearance;
   @FXML 
   private Label outputUserHealth;
   @FXML 
   private Label outputUserMana;
   @FXML 
   private Label outputEnemyHealth;
   @FXML
   private Button attackButton;
   @FXML
   private Button magicButton;
   @FXML
   private Button itemButton;
   @FXML
   private Button fleeButton;
   @FXML
   private ProgressBar usersHealthBarProgress;
   @FXML
   private ProgressBar userManaProgress;
   @FXML
   private ProgressBar enemyHealthBarProgress;
   
   //load images when you get them
   private static Image slimeImage = new Image("slime.png");
   private static Image spiderImage = new Image ("spider.png");
   private static Image goblinImage = new Image("goblin.png");
   private static Image wolfImage = new Image("wolf.png");
   private static Image golemImage = new Image("golem.png");
   private static Image feyImage = new Image("fey.png");
   private static Image elementalImage = new Image("elemental.png");
  
   static Enemy chosenEnemy = Enemy.enemiesArray[Enemy.getRandomEnemy()];
   
   //chooses the enemy and sets the enemy and label respectively
   public void initialize(){
      
      outputUserHealth.setText(User.player.getHP() + "/" + User.player.getMaxHP());
      outputUserMana.setText(User.player.getMana() + "/" + User.player.getMaxMana());
      outputEnemyHealth.setText(chosenEnemy.getHP() + "/" + chosenEnemy.getMaxHP());
      
      System.out.println(usersHealthBarProgress.getProgress());
      
      //sets the progress bars
      /*usersHealthBarProgress.setProgress((Double.valueOf(User.player.getHP())*Double.valueOf(User.player.getMaxHP()))/100.0);
      userManaProgress.setProgress((Double.valueOf(User.player.getMana())*Double.valueOf(User.player.getMaxMana()))/100.0);
      enemyHealthBarProgress.setProgress((Double.valueOf(chosenEnemy.getHP())*Double.valueOf(chosenEnemy.getMaxHP()))/100.0);*/
      
      if(chosenEnemy.getName().equals("Elemental")) {
         outputEnemyAppearance.setText(User.player.getName() + " encountered an " + chosenEnemy.getName() + "!");
      } else {
         outputEnemyAppearance.setText(User.player.getName() + " encountered a " + chosenEnemy.getName() + "!");
      }
      
      if (Enemy.getRandomEnemy() == 0){
         outputEnemyImage.setImage(slimeImage);
      } else if (Enemy.getRandomEnemy() == 1){
         outputEnemyImage.setImage(spiderImage);
      } else if (Enemy.getRandomEnemy() == 2){
         outputEnemyImage.setImage(goblinImage);
      } else if (Enemy.getRandomEnemy() == 3){
         outputEnemyImage.setImage(wolfImage);
      } else if (Enemy.getRandomEnemy() == 4){
         outputEnemyImage.setImage(golemImage);
      } else if (Enemy.getRandomEnemy() == 5){
         outputEnemyImage.setImage(feyImage);
      } else if (Enemy.getRandomEnemy() == 6){
         outputEnemyImage.setImage(elementalImage);
      }
   }
   
   //event listeners
   public void attackButtonListener() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("ChooseAttack.fxml")); //this calls the attack pane
      enemyAppearancePane.getChildren().setAll(pane);      
   }
   public void magicButtonListener() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("ChooseMagic.fxml")); //this calls the attack pane
      enemyAppearancePane.getChildren().setAll(pane);
   }
   public void itemButtonListener() throws Exception {
      AnchorPane pane = FXMLLoader.load(getClass().getResource("ChooseItem.fxml")); //this calls the item pane
      enemyAppearancePane.getChildren().setAll(pane);
   }
   public void fleeButtonListener() throws Exception {
      //calls flee button when made
      //AnchorPane pane = FXMLLoader.load(getClass().getResource("ChooseFlee.fxml")); //this calls the attack pane
      //enemyAppearancePane.getChildren().setAll(pane);
   }
   
   public static Image getChosenEnemyImage(){
   
      if (Enemy.getRandomEnemy() == 0){
         return slimeImage;
      } else if (Enemy.getRandomEnemy() == 1){
         return spiderImage;
      } else if (Enemy.getRandomEnemy() == 2){
         return goblinImage;
      } else if (Enemy.getRandomEnemy() == 3){
         return wolfImage;
      } else if (Enemy.getRandomEnemy() == 4){
         return golemImage;
      } else if (Enemy.getRandomEnemy() == 5){
         return feyImage;
      } else if (Enemy.getRandomEnemy() == 6){
         return elementalImage;
      } 
      return null; 
   }

}