package my.sp.main;

public class Character {
	
	
	String race = null;
	String name = null;
	int health = 1;
	int strength = 0;
	int intelligence = 0;
	int agility = 0;
	int endurance = 0;
	int willPower = 0;
	String flavorText = null;
	
	public Character(String startRace, String startName,int startHealth, int startStrength,
	int startInt, int startAgil, int startEndur, int startWill, String descrip)
	{
		race = startRace;
		name = startName;
		health = startHealth;
		strength = startStrength;
		intelligence = startInt;
		agility = startAgil;
		endurance = startEndur;
		willPower = startWill;
		flavorText = descrip;
		
	}
//Getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getEndurance() {
		return endurance;
	}
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	public String getFlavorText() {
		return flavorText;
	}
	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	
	int attack (int strength) { // Generates random number (1 to strength) and adds strength value.
		int atknum = (int) (Math.random() * strength + 1) + strength;
		return atknum;
	}
	int defense (int endurance) { // Generates random number (1 to endurance) and adds endurance value.
		int defnum = (int) (Math.random() * 15 + 1) + endurance;
		return defnum;
	}
	
}