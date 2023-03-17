public class StatsCalculatorTester {
    public static void main(String[] args){


        double[ ] datab = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
//create a StatsCalculator object
        StatsCalculator myCalculatorD = new StatsCalculator(datab);

        myCalculatorD.print();
        myCalculatorD.sortData();
        myCalculatorD.printSorted();
        myCalculatorD.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalculatorD.calculateMean());

    }
}
