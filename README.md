# Results

A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.

1. Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
	* Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
	* Method 2 - which finds and displays the percentage that the person received for the exams overall.

```java
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
```

```java
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

```