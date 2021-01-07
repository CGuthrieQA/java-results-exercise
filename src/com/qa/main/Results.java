package com.qa.main;

public class Results {
	
	// methods
	
	public String displayResults(int bio, int chem, int phys) {
		String results = "SCORES\r\n";
		results += "Biology: " + bio + "/150\r\n";
		results += "Chemistry: " + chem + "/150\r\n";
		results += "Physics: " + phys + "/150\r\n";
		results += "Total: " + (bio+chem+phys) + "/450\r\n";
		return results;
	}
	
	public double percentageResults(int bio, int chem, int phys) {
		double percentage = ( 100 * ( bio + chem + phys ) ) / 450;
		return percentage;
	}
	

}