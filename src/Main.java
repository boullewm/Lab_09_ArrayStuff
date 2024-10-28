import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int num = SafeInput.getRangedInt(in, "Please enter a number [1-100]", 1, 100);
        int val = SafeInput.getRangedInt(in, "Please enter another number [1-100]", 1, 100);

        int[] dataPoints = new int[100];
        for (int i=0;i<dataPoints.length;i++){
            dataPoints[i]=rnd.nextInt(100) + 1;
        }
        for (int i=0;i<dataPoints.length;i++){
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;
        for (int i=0;i<dataPoints.length;i++){
            sum = sum+dataPoints[i];
        }
        System.out.println();
        System.out.println("The total sum is " + sum);
        double avg = (double)sum/dataPoints.length;
        System.out.println("The average is " + avg);
        boolean foundNum = false;
        int count = 0;
        for (int i=0; i<dataPoints.length;i++){
            if (dataPoints[i]==num){
                count ++;
                foundNum = true;
            }
        }
        if (!foundNum) {
            System.out.println("Sorry, your number: " + num + " was not found");
        }
        else  {
            System.out.println("Your number: " + num + " was found " + count + " time(s)");
        }
        boolean foundVal = false;
        for (int i=0; i<dataPoints.length;i++){
            if (dataPoints[i]==val){
                System.out.println("Your number: " + val + " was found at index: " + i);
                foundVal = true;
                break;
            }
        }
        if (!foundVal){
            System.out.println("Sorry, your number: " + val + " was not found");
        }
        int min = dataPoints [0];
        int max = dataPoints [0];
        for (int i=0; i<dataPoints.length; i++){
            if (dataPoints[i]<min) {
                min = dataPoints[i];
            }
            if (dataPoints[i]>max){
                max=dataPoints[i];
            }
        }
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]){
        int sum = 0;
        for (int i=0;i<values.length;i++){
            sum = sum+values[i];
        }
        return (double)sum/values.length;

    }

}