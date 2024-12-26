import java.util.Scanner;

	public class BMICalculator {
      public static void main( String args[])
      {
    	 Scanner sc =new Scanner(System.in); 
    	 System.out.println("Enter weight in kilogram");
    	 double weight=sc.nextDouble();
    	 System.out.println("Enter height in  meter");
    	 double height=sc.nextDouble();
    	 double bmi=weight/(height*height);
    	 System.out.println("BMI is:" +bmi);
    	 String category;
    	 if(bmi<18.5)
    	 {
    		 category="underweight";
    	 }else if (bmi >= 18.5 && bmi < 24.9) {
             category = "Normal weight";
         } else if (bmi >= 25 && bmi < 29.9) {
             category = "Overweight";
         } else {
             category = "Obese";
         }
    	 System.out.println("Classified as:"+category);
      }
	}
