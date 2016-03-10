package charcreate;

import java.util.Arrays;
import java.util.HashSet;

public class Character {

	private static Character instance = new Character();
	private String race;
	private String subrace;
	private String name;
	private String eyes;
	private String hair;
	private char gender;
	private int age;
	private int[] height = new int[2];
	private String background;
	private String ideal;
	private String bond;
	private String flaw;
	private String charaClass;
	private int[] skills;
	private String feature;
	private HashSet<String> cantrips;
	private HashSet<String> spells;
	private String weapon;
	private String armor;
	private String bonusWeapon;
	private String pack;
	private HashSet<String> additional;

	private Character() {
		
	}
	
	public static Character getInstance() {
		return instance;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSubrace() {
		return subrace;
	}

	public void setSubrace(String subrace) {
		this.subrace = subrace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getHeight() {
		return height;
	}

	public void setHeight(int foot, int inch) {
		this.height[0] = foot;
		this.height[1] = inch;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getIdeal() {
		return ideal;
	}

	public void setIdeal(String ideal) {
		this.ideal = ideal;
	}

	public String getBond() {
		return bond;
	}

	public void setBond(String bond) {
		this.bond = bond;
	}

	public String getFlaw() {
		return flaw;
	}

	public void setFlaw(String flaw) {
		this.flaw = flaw;
	}

	public String getCharaClass() {
		return charaClass;
	}

	public void setCharaClass(String charaClass) {
		this.charaClass = charaClass;
	}

	public int[] getSkills() {
		return skills;
	}

	public void setSkills(int[] skills) {
		this.skills = skills;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public HashSet<String> getCantrips() {
		return cantrips;
	}

	public void setCantrips(HashSet<String> cantrips) {
		this.cantrips = cantrips;
	}

	public HashSet<String> getSpells() {
		return spells;
	}

	public void setSpells(HashSet<String> spells) {
		this.spells = spells;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getBonusWeapon() {
		return bonusWeapon;
	}

	public void setBonusWeapon(String bonusWeapon) {
		this.bonusWeapon = bonusWeapon;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public HashSet<String> getAdditional() {
		return additional;
	}

	public void setAdditional(HashSet<String> additional) {
		this.additional = additional;
	}

	@Override
	public String toString() {
		return "Character [race=" + race + ", subrace=" + subrace + ", name=" + name + ", eyes=" + eyes + ", hair="
				+ hair + ", gender=" + gender + ", age=" + age + ", height=" + Arrays.toString(height) + ", background="
				+ background + ", ideal=" + ideal + ", bond=" + bond + ", flaw=" + flaw + ", charaClass=" + charaClass
				+ ", skills=" + Arrays.toString(skills) + ", feature=" + feature + ", cantrips=" + cantrips
				+ ", spells=" + spells + ", weapon=" + weapon + ", armor=" + armor + ", bonusWeapon=" + bonusWeapon
				+ ", pack=" + pack + ", additional=" + additional + "]";
	}

}
