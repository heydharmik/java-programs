package practicals.sem4.sessionPracticals;

public class TenNumberPlatesGeneration {
	public static void main(String[] args) {
		System.out.println("Ten Number plates are:");
		for(int i = 0; i < 10;) {
			int ran;
			ran = (int) Math.round(Math.abs(Math.random()*10000)); 
			if(ran >= 1000 && ran <= 10000) {
				System.out.println("AGM-" + ran);
				i++;
			}
		}
	}
}
