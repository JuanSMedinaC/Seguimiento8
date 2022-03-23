package ui;
import java.util.ArrayList;

import model.*;
public class Main {
	public static CountryList cList=new CountryList();
	
	public static void main(String[] args) {
			cList.loadCountries();
			cList.sort1();
			ArrayList<Country> countries=cList.getCountries();
			System.out.println("Masculino");
			for (int i=0;i<countries.size();i++) {
				System.out.println(countries.get(i).toStringMale());
			}
			System.out.println("----------");
			cList.sort2();
			countries=cList.getCountries();
			System.out.println("Femenino");
			for (int i=0;i<countries.size();i++) {
				System.out.println(countries.get(i).toStringFemale());
			}
			System.out.println("----------");
			countries=cList.getCountries();
			System.out.println("Combinado");

	}
}
