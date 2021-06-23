
public class YearsDays {

	public static void main(String[] args) {
		// TO Convert Minutes into Years and Days.
		int mins=3456789;
		int yrs;
		float day;
		yrs= minToyear(mins);
		day= minTodays(mins,yrs);
		int days=(int)day;
		System.out.println(mins+" minutes is approximately "+yrs+" years and "+days+" days.");
		
	}
	public static int minToyear(int min) {
		int yr= min/525600;
		return yr;
		
	}
	public static float minTodays(int mins,int yr) {
		float d= (float) mins/525600;
		d=d-yr;
		float days = d*365;
		return days;
		
	}


}
