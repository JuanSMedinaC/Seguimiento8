package model;
import java.util.Comparator;
public class SortComparator implements Comparator<Country>  {
	public int compare(Country c1, Country c2) {
		
		if(c2.getMaleGoldMedals()-c1.getMaleGoldMedals()>0) {
			return 1;
		}
		else if(c2.getMaleGoldMedals()-c1.getMaleGoldMedals()<0) {
			return -1;
		}
		else if(c2.getMaleGoldMedals()-c1.getMaleGoldMedals()==0) {
			
			if(c2.getMaleSilverMedals()-c1.getMaleSilverMedals()>0) {
				return 1;
			}
			else if(c2.getMaleSilverMedals()-c1.getMaleSilverMedals()<0) {
				return -1;
			}
			else if(c2.getMaleSilverMedals()-c1.getMaleSilverMedals()==0) {
				
				if(c2.getMaleBronzeMedals()-c1.getMaleBronzeMedals()>0) {
					return 1;
				}
				else if(c2.getMaleBronzeMedals()-c1.getMaleBronzeMedals()<0) {
					return -1;
				}
				else if(c2.getMaleBronzeMedals()-c1.getMaleBronzeMedals()==0) {
					
					if(c2.getName().compareTo(c1.getName())>0) {
						return 1;
					}
					else if(c2.getName().compareTo(c1.getName())<0) {
						return -1;
					}
					else if(c2.getName().compareTo(c1.getName())==0) {
						return 0;
					}
				}
			}
		}
		return 0;
		
	}
}
