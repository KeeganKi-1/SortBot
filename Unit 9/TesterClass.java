import java.lang.Math;
public class TesterClass
{
    public static int[] getRandomInt(int size){
        int[] randomArray = new int[size];
        int randomNumber;
        for(int x = 0; x<size; x++){
        randomNumber = (int)(Math.random()*100);
        randomArray[x] = randomNumber;
        }
        
        
        return  randomArray;
    }
   
    public static void main(String[] args){
    
        int[] testerArray = {9,3,5,1,2,2,3,4};
        
        CalculateSum s = new CalculateSum();
        CalculateProduct p = new CalculateProduct();
        CalculateAverage a = new CalculateAverage();
        SortAscending sa = new SortAscending();
        
        System.out.println(s.calculateSum(testerArray));
        System.out.println(p.calculateProduct(testerArray));
        System.out.println(a.calculateAverage(testerArray));
        int[] arrayToCheck = sa.sortAscending(getRandomInt(20));
        for(int i = 0; i<arrayToCheck.length; i++){
        System.out.println(arrayToCheck[i]);}
        System.out.println("Bogo Sort:");
        int[] arrayToCheck2 = sa.bogoSort(getRandomInt(12));
        for(int i = 0; i<arrayToCheck2.length; i++){
        System.out.println(arrayToCheck[i]);}
    }
    
    
    
    
}
