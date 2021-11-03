public class CalculateAverage{

    public double calculateAverage(int[] numbers){
        double average =0.0;
        CalculateSum sumClass = new CalculateSum();
        
        average = (double)sumClass.calculateSum(numbers)/(double)numbers.length;
        
        return average;
    }
    
    

}