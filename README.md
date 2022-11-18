# Average Temperature Task for the ALG1 course:

The average daily temperature is calculated as the average of the temperature values measured at 6, 12 and 18 hours, with the value measured at 18 hours having twice the weight. Add a program that reads the measured daily temperatures and prints the corresponding average temperature. Read the inputs (three numbers) from the standard input. Write the result (one real number) on the standard output as a number with two decimal numbers. 

The decimal separator of numbers read from the input and the number output should be the character "dot". The necessary input settings for this purpose are provided by setting the appropriate instance of the Scanner class on line 8 of the provided program fragment, i.e. the command: 
sc.useLocale(Locale.US); 
After listing the numeric values, we then use the format() method of the output stream System.out with an extended number of parameters, where we use the Locale.US value as the first parameter, only as the second parameter of the method follows the text string template and then other parameters that we want to format into the text string.

In the case of the calculated average temperature, the statement in the required format is provided by the command: System.out.format(Locale.US, "%1.2f", averageTemperature); Sample input 8.0 20.0 16.0 Sample output 15.0
