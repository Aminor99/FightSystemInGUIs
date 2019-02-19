//makes a player object
class User{

	private static String name, job;
	private static int hp, maxHP, attack, magicAttack, defense, mana, maxMana, speed, attackRate;
   
	User(String n, String j, int h, int mHP, int atk, int mAtk, int def, int m, int mM, int s, int aR){
		name = n;
		job = j;
		hp = h;
      maxHP = mHP;
		attack = atk;
		magicAttack = mAtk;
		defense = def;
		mana = m;
      maxMana = mM;
      speed = s;
      attackRate = aR;
	}
   public String getName(){
      return name;
   }
   public void setName(String n){
      name = n;
   }
   public String getJob(){
      return job;
   }
   public void setJob(String j){
      job = j;
   }
	public int getHP() {
		return hp;
	}
	public void setHP(int h) {
		hp = h;
	}
   public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int mHP) {
		maxHP = mHP;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int atk) {
		attack = atk;
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int mAtk) {
		magicAttack = mAtk;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int def) {
		defense = def;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int m) {
		mana = m;
	}
   public int getMaxMana(){
      return maxMana;
   }
   public void setMaxMana(int mM){
      maxMana = mM;
   }
   public int getSpeed(){
      return speed;
   }
   public int getAttackRate(){
      return attackRate;
   }
   //i made this class so that i wouldnt have to set the stats separately
   public void setStats(int h, int mHP, int a, int mAtk, int m, int mM, int d, int s, int aR){
      hp = h;
      maxHP = mHP;
      attack = a;
      magicAttack = mAtk;
      mana = m;
      maxMana = mM;
      defense = d;
      speed = s;
      attackRate = aR;
   }
   //creates the user object
   public static User player = new User("","",0,0,0,0,0,0,0,0,0);
}
   