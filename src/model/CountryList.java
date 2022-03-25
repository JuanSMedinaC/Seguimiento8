package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CountryList {
	private ArrayList<Country> countries;
	
	public CountryList() {
		countries=new ArrayList<Country>();
	}
	
	public void loadCountries() {		
		try {
			File file = new File(".\\pruebas.txt");
			
			FileReader fr = new FileReader(file);
			
			BufferedReader input = new BufferedReader(fr);
			int n=Integer.parseInt(input.readLine());
			
			while (input.ready()) {
				
				String line = input.readLine();
				String [] data = line.split(";");
				
				String name=data[0];
				int maleGoldMedals=Integer.parseInt(data[1]);
				int maleSilverMedals=Integer.parseInt(data[2]);
				int maleBronzeMedals=Integer.parseInt(data[3]);
				int femaleGoldMedals=Integer.parseInt(data[4]);
				int femaleSilverMedals=Integer.parseInt(data[5]);
				int femaleBronzeMedals=Integer.parseInt(data[6]);
				addCountry(name, maleGoldMedals, maleSilverMedals, maleBronzeMedals, femaleGoldMedals, femaleSilverMedals, femaleBronzeMedals);
			}
			input.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void addCountry(String name, int maleGoldMedals, int maleSilverMedals, int maleBronzeMedals, int femaleGoldMedals,
			int femaleSilverMedals, int femaleBronzeMedals) {
		countries.add(new Country(name, maleGoldMedals, maleSilverMedals, maleBronzeMedals, femaleGoldMedals, femaleSilverMedals, femaleBronzeMedals));
	}
	
	public void sort1() {
		Collections.sort(countries,new SortComparator());
	}
	public void sort2() {
		Collections.sort(countries);
	}
	public void combinedSort() {
		int n = countries.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if(countries.get(j).getCombinedGold()-countries.get(j-1).getCombinedGold()>0) {
	    			Country temp = countries.get(j);
	    			countries.set(j, countries.get(j-1));
	    	        countries.set(j-1, temp);
	    			inversion = true;
	    		}
	    		else if(countries.get(j-1).getCombinedGold()-countries.get(j).getCombinedGold()==0) {
	    			
	    			if(countries.get(j).getCombinedSilver()-countries.get(j-1).getCombinedSilver()>0) {
	    				Country temp = countries.get(j);
		    			countries.set(j, countries.get(j-1));
		    	        countries.set(j-1, temp);
		    			inversion = true;
	    			}
	    			else if(countries.get(j-1).getCombinedSilver()-countries.get(j).getCombinedSilver()==0) {
	    				
	    				if(countries.get(j).getCombinedBronze()-countries.get(j-1).getCombinedBronze()>0) {
	    					Country temp = countries.get(j);
	    	    			countries.set(j, countries.get(j-1));
	    	    	        countries.set(j-1, temp);
	    	    			inversion = true;
	    				}
	    				else if(countries.get(j-1).getCombinedBronze()-countries.get(j).getCombinedBronze()==0) {
	    					
	    					if(countries.get(j).getName().compareTo(countries.get(j-1).getName())>0) {
	    						Country temp = countries.get(j);
	    		    			countries.set(j, countries.get(j-1));
	    		    	        countries.set(j-1, temp);
	    		    			inversion = true;
	    					}
	    				}
	    			}
	    		}    		
	    	}
	    }
	}
	
	
	
	public ArrayList<Country> getCountries(){
		return countries;
	}
	
}
