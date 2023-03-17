import java.util.Arrays;

public class StatsCalculator {
    double[] values;
    double[] sortedValues;

    /**
     * default constructor that makes an array of size 20 full os 0s
     */
    public StatsCalculator(){
        values = new double[20];
        sortedValues = new double[20];

    }

    /**
     * overloaded constructor that sets instance variable equal to the parameter
     * @param values desired array for values
     */
    public StatsCalculator(double[] values){
        this.values = values;
        this.sortedValues = values;
    }

    /**
     * sorts the values array and assigns it to a new array
     */
    public void sortData(){
        Arrays.sort(sortedValues);
    }

    /**
     * calculates the max of the values array
     * @return the max
     */
    public  double calculateMax(){
        double max = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
        }
        return max;
    }

    /**
     * calculates the min of the values array
     * @return the min
     */
    public double calculateMin(){
        double min = values[0];
        for(int j = 0; j < values.length; j++){
            if (values[j] < min){
                min = values[j];
            }
        }
        return min;
    }

    /**
     * calculates the value of the first quartile in values array
     * @return returns the first quartile
     */

    public double calculateFirstQuartile(){
        sortData();
        if(sortedValues.length%2 == 0){
            if(sortedValues.length/2 %2 == 0){
                return (sortedValues[sortedValues.length/4-1]+sortedValues[sortedValues.length/4])/2.0;
            }
            else if((sortedValues.length/2 %2) == 1){
                return sortedValues[sortedValues.length/4];
            }
        }
        else if(sortedValues.length%2 == 1){
            if((sortedValues.length-1)/2 %2 == 0){
                return (sortedValues[(sortedValues.length-1)/4] + sortedValues[((sortedValues.length-1)/4) - 1])/2.0;
            }
            else if((sortedValues.length-1)/2 %2 == 1){
                return sortedValues[(sortedValues.length-1)/4];
            }
        }
        return 0;
    }

    /**
     * calculates the value of the third quartile in values array
     * @return return the third quartile
     */
    public double calculateThirdQuartile(){
        sortData();
        if(sortedValues.length%2 == 0){
            if(sortedValues.length/2 %2 == 0){
                return (sortedValues[3*sortedValues.length/4-1]+sortedValues[3 * sortedValues.length/4])/2.0;
            }
            else if((sortedValues.length/2 %2) == 1){
                return sortedValues[(int)sortedValues.length* 3/4];
            }
        }
        else if(sortedValues.length%2 == 1){
            if((sortedValues.length-1)/2 %2 == 0){
                return (sortedValues[(sortedValues.length-1) * 3/4] + sortedValues[((sortedValues.length-1) * 3/4) - 1])/2.0;
            }
            else if((sortedValues.length-1)/2 %2 == 1){
                return sortedValues[((sortedValues.length-1) * 3) /4];
            }
        }
        return 0;
    }

    /**
     * calculates the value of the median in values array
     * @return returns the median
     */
    public double calculateMedian(){
        sortData();
        if(sortedValues.length%2 == 0){
            return (sortedValues[sortedValues.length/2]+sortedValues[sortedValues.length/2-1])/2;
        }
        else if(sortedValues.length%2 == 1){
            return sortedValues[sortedValues.length/2];
        }
        return 0;
    }

    /**
     * calculates the sum of all the values in the values array
     * @return returns the sum
     */
    public double calculateSum(){
        double sum = 0;
        for(int k = 0; k < values.length; k++){
            sum += values[k];
        }
        return sum;
    }

    /**
     * calculates the mean of the values array
     * @return returns the mean
     */
    public double calculateMean(){
        return calculateSum()/values.length;
    }

    /**
     * Prints all the values in the values array in a single line
     */
    public void print(){
        System.out.println();
        System.out.print("Your data is: ");
        for(double value: values){
            System.out.print(value + " ");
        }
    }

    /**
     * Prints all the sorted values in the sortedValues array in a single line
     */
    public void printSorted(){
        System.out.println();
        System.out.print("Your sorted data is: ");
        for(double sortedValue: sortedValues){
            System.out.print(sortedValue + " ");
        }
    }

    /**
     * prints the min, first quartile, median. third quartile and the maximum
     */
    public void printFiveNumberSummary(){
        System.out.println();
        System.out.println("The five number summary is:");
        System.out.println("\tMinimum: "+ calculateMin());
        System.out.println("\tFirst Quartile: "+ calculateFirstQuartile());
        System.out.println("\tMedian: " + calculateMedian());
        System.out.println("\tThird Quartile: " +calculateThirdQuartile());
        System.out.println("\tMaximum: "+ calculateMax());

    }

}
