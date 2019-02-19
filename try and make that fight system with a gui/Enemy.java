import java.util.Random;
//class for making enemy objects
class Enemy{

	String name;
	int HP, maxHP, attack, speed, attackRate; 
	
	Enemy(String n, int h, int mHP, int a, int s, int aR){
		name = n;
		HP = h;
      maxHP = mHP;
		attack = a;	
      speed = s;
      attackRate = aR;	
	}
   public String getName(){
      return name;
   }
	public int getHP() {
		return HP;
	}
	public void setHP(int h) {
		HP = h;
	}
   public int getMaxHP(){
      return maxHP;
   }
	public int getAttack() {
		return attack;
	}
   public int getSpeed() {
      return speed;
   }
   public int getAttackRate(){
      return attackRate;
   }
   
   private static Random ranEnemyNum = new Random();
   private static int enemyNum = ranEnemyNum.nextInt(7); 
   
   static Enemy slime = new Enemy("Slime", 16, 16, 12, 2, 4);
	static Enemy spider = new Enemy("Spider", 20, 20, 15, 9, 4);
	static Enemy goblin = new Enemy("Goblin", 22, 22, 16, 6, 5);
   static Enemy wolf = new Enemy("Wolf", 24, 24, 18, 8, 3);
   static Enemy golem = new Enemy("Golem", 30, 30, 20, 1, 2);
   static Enemy fey = new Enemy("Fey", 40, 40, 22, 5, 1);   
   static Enemy elemental = new Enemy("Elemental", 55, 55, 25, 3, 0);
   
   static Enemy enemiesArray[] = {slime, spider, goblin, wolf, golem, fey, elemental};
   
   //selects a random enemy and returns it
   
   public static int getRandomEnemy(){
      return enemyNum;
   }
}
