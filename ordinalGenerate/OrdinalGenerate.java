package ordinalGenerate;

public class OrdinalGenerate {
	public static String ordinal(int i) {
	    String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
	        return i + sufixes[i % 10];
	}
}
