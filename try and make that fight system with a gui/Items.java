//for making items object
class Items{

	String name, effect; //effect is like, if its a potion, it gives health, if its a booster,  it adds to attack or defense
	int potency, amount; //to what degree potions heal, armor adds to defense, yknow
   
	Items(String n, String e, int p, int a){
		name = n;
		effect = e;
		potency = p;
		amount = a;
	}
	public String getEffect() {
		return effect;
	}
	public int getPotency() {
		return potency;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int a) {
		amount = a;
	}
   
   //initializes the items 
   static Items potion = new Items("Potion", "Heals the user.", 30, 5);
   static Items greaterPotion = new Items("Greater Potion", "Greatly heals the user.", 60, 2);
	static Items panacea = new Items("Panacea", "Gives the user full health.", User.player.getMaxHP(), 1);
	static Items tonic = new Items("Tonic", "Grants the user some mana.", 10, 5);
   static Items greaterTonic = new Items("Greater Tonic", "Grants the user a lot of mana.", 30, 2);
	static Items elixer = new Items("Elixer", "Gives the user full mana.", User.player.getMaxMana(), 1);
   
}