package com.qa.main;

public class Runner {


	public static void main(String[] args) {
		
		Results res = new Results();
		
		int biologyScore = 100;
		int chemistryScore = 112;
		int physicsScore = 137;
		
		System.out.println(res.displayResults(biologyScore, chemistryScore, physicsScore));

		System.out.println("PERCENTAGE\r\n" + res.percentageResults(biologyScore, chemistryScore, physicsScore) + "%");
		
	}

}
