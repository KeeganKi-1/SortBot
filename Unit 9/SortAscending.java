import java.lang.Math;
public class SortAscending
{
    public int[] sortAscending(int[] numbers){
        int[] sortedNumbers = numbers;
        int greatestIndex = 0;
        int storage;
        for(int index =0; index<sortedNumbers.length; index++){

            for(int i =0; i<sortedNumbers.length-index; i++){

                if(sortedNumbers[i]>sortedNumbers[greatestIndex]){
                    greatestIndex = i;
                }

            }
            storage = sortedNumbers[sortedNumbers.length-index-1]; 
            sortedNumbers[sortedNumbers.length-index-1] = sortedNumbers[greatestIndex];
            sortedNumbers[greatestIndex] = storage;
            greatestIndex = 0;

        }

        return sortedNumbers;
    }

    public int[] bogoSort(int[] numbers){
        boolean isSorted = false;
        int randomPlaceValue;
        int storage;
        while(!isSorted){
            for(int i =0; i<numbers.length; i++){
                randomPlaceValue = (int)(Math.random()*numbers.length);
                storage = numbers[i];
                numbers[i] = numbers[randomPlaceValue];
                numbers[randomPlaceValue] = storage;
            }
            for(int x = 0; x<numbers.length-1; x++){
                if(numbers[x]<numbers[x+1]){
                    isSorted=true;
                }
                else{
                    isSorted = false;
                    break;
                }
            }

        
        }

    
        return numbers;
    }
    
    public int[] newSort(int[] numbers){
    int[] sortedNumbers = numbers;
        int greatestIndex = 0;
        int storage;
        int[] groupOfGreatestValues = new int[numbers.length];
        int counter = 0;
        for(int index =0; index<sortedNumbers.length; index++){

            for(int i =0; i<sortedNumbers.length-index; i++){

                if(sortedNumbers[i]>=sortedNumbers[greatestIndex]){
                    if(sortedNumbers[i] == sortedNumbers[greatestIndex]){
                    groupOfGreatestValues[counter] = i;
                    counter++;
                    }
                    else{
                    groupOfGreatestValues = new int[numbers.length];
                    groupOfGreatestValues[0] = i;
                    greatestIndex = i;
                    counter=1;
                    }
                }

            }
            storage = sortedNumbers[sortedNumbers.length-index-1]; 
            sortedNumbers[sortedNumbers.length-index-1] = sortedNumbers[greatestIndex];
            sortedNumbers[greatestIndex] = storage;
            greatestIndex = 0;

        }

        return sortedNumbers;
    }
}
