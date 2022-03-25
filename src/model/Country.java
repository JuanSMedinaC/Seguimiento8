package model;

public class Country implements Comparable<Country>{
	private String name;
	private int maleGoldMedals;
	private int maleSilverMedals;
	private int maleBronzeMedals;
	private int femaleGoldMedals;
	private int femaleSilverMedals;
	private int femaleBronzeMedals;
	private int combinedGold;
	private int combinedSilver;
	private int combinedBronze;
	
	
	public Country(String name, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals, int femaleGoldMedals,
			int femaleSilverMedals, int femaleBronzeMedals) {
		super();
		this.name = name;
		this.maleGoldMedals = maleGoldMedals;
		this.maleSilverMedals = maleSilverMedals;
		this.maleBronzeMedals = maleBronzeMedals;
		this.femaleGoldMedals = femaleGoldMedals;
		this.femaleSilverMedals = femaleSilverMedals;
		this.femaleBronzeMedals = femaleBronzeMedals;
		combinedGold=maleGoldMedals+femaleGoldMedals;
		combinedSilver=maleSilverMedals+femaleSilverMedals;
		combinedBronze=maleBronzeMedals+femaleBronzeMedals;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaleGoldMedals() {
		return maleGoldMedals;
	}


	public void setMaleGoldMedals(int maleGoldMedals) {
		this.maleGoldMedals = maleGoldMedals;
	}


	public int getMaleSilverMedals() {
		return maleSilverMedals;
	}


	public void setMaleSilverMedals(int maleSilverMedals) {
		this.maleSilverMedals = maleSilverMedals;
	}


	public int getMaleBronzeMedals() {
		return maleBronzeMedals;
	}


	public void setMaleBronzeMedals(int maleBronzeMedals) {
		this.maleBronzeMedals = maleBronzeMedals;
	}


	public int getFemaleGoldMedals() {
		return femaleGoldMedals;
	}


	public void setFemaleGoldMedals(int femaleGoldMedals) {
		this.femaleGoldMedals = femaleGoldMedals;
	}


	public int getFemaleSilverMedals() {
		return femaleSilverMedals;
	}


	public void setFemaleSilverMedals(int femaleSilverMedals) {
		this.femaleSilverMedals = femaleSilverMedals;
	}


	public int getFemaleBronzeMedals() {
		return femaleBronzeMedals;
	}


	public void setFemaleBronzeMedals(int femaleBronzeMedals) {
		this.femaleBronzeMedals = femaleBronzeMedals;
	}
	
	public int getCombinedGold() {
		return combinedGold;
	}


	public void setCombinedGold(int combinedGold) {
		this.combinedGold = combinedGold;
	}


	public int getCombinedSilver() {
		return combinedSilver;
	}


	public void setCombinedSilver(int combinedSilver) {
		this.combinedSilver = combinedSilver;
	}


	public int getCombinedBronze() {
		return combinedBronze;
	}


	public void setCombinedBronze(int combinedBronze) {
		this.combinedBronze = combinedBronze;
	}


	@Override
	public int compareTo(Country c1) {
		if(this.getFemaleGoldMedals()-c1.getFemaleGoldMedals()>0) {
			return 1;
		}
		else if(this.getFemaleGoldMedals()-c1.getFemaleGoldMedals()<0) {
			return -1;
		}
		else if(this.getFemaleGoldMedals()-c1.getFemaleGoldMedals()==0) {
			
			if(this.getFemaleSilverMedals()-c1.getFemaleSilverMedals()>0) {
				return 1;
			}
			else if(this.getFemaleSilverMedals()-c1.getFemaleSilverMedals()<0) {
				return -1;
			}
			else if(this.getFemaleSilverMedals()-c1.getFemaleSilverMedals()==0) {
				
				if(this.getFemaleBronzeMedals()-c1.getFemaleBronzeMedals()>0) {
					return 1;
				}
				else if(this.getFemaleBronzeMedals()-c1.getFemaleBronzeMedals()<0) {
					return -1;
				}
				else if(this.getFemaleBronzeMedals()-c1.getFemaleBronzeMedals()==0) {
					
					if(this.getName().compareTo(c1.getName())>0) {
						return 1;
					}
					else if(this.getName().compareTo(c1.getName())<0) {
						return -1;
					}
					else if(this.getName().compareTo(c1.getName())==0) {
						return 0;
					}
				}
			}
		}
		return 0;
	}
	
	public String toStringMale() {
		return name+" "+maleGoldMedals+" "+maleSilverMedals+" "+maleBronzeMedals;
	}
	public String toStringFemale() {
		return name+" "+femaleGoldMedals+" "+femaleSilverMedals+" "+femaleBronzeMedals;
	}
	public String toStringCombined() {
		return name+ " "+combinedGold+" "+combinedSilver+" "+combinedBronze;
	}


	
	
	
}
