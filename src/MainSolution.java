public class MainSolution extends ConsoleProgram
{
    public void run()
    {
        int[] numArray =  {12, 17, 65, 7, 30, 88};

        AvgOfArraySolution myArray = new AvgOfArraySolution(numArray);

        System.out.println("The average of the array is " + myArray.getAvg());
    }
}
