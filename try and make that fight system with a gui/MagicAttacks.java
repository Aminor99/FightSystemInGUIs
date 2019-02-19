//class to make magic attack objects

public class MagicAttacks {

	String spellName;
	int mp, spellDamage;
   
	public MagicAttacks(String sN, int m, int sD){
		spellName = sN;
		spellDamage = sD;
		mp = m;
	}
   
	public void setSpellName(String sN) {
		spellName = sN;
	}
	public void setSpellDamage(int sD) {
		spellDamage = sD;
	}
	public void setMP(int m) {
		mp = m;
	}
	public String getSpellName() {
		return spellName;
	}
	public int getSpellDamage() {
		return spellDamage;
	}
	public int getMP() {
		return mp;
	}
   //initializing the magic attacks
   static MagicAttacks fira = new MagicAttacks("Fira", 8, 10);
   static MagicAttacks blizza = new MagicAttacks("Blizza", 10, 12);
	static MagicAttacks thunda = new MagicAttacks("Thunda", 12, 14);
	static MagicAttacks aero = new MagicAttacks("Aero", 14, 16);
}
