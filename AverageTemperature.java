import java.util.Scanner;
import java.util.Locale;

public class AverageTemperature {

    public static void main(String[] args) {
    	
    	    Scanner input = new Scanner(System.in).useLocale(Locale.US); 
      
			float averageTemperature;
			System.out.println("Input the temperature at 6, 12 a 18");
			    double temp6 = input.nextDouble();
	        double temp12 = input.nextDouble();
	        double temp18 = input.nextDouble();
			
			prumernaTeplota = (float)(temp6 + temp12 + temp18*2)/4;
			
			System.out.format(Locale.US, "%1.2f", averageTemperature);
		}
        
    }

    

