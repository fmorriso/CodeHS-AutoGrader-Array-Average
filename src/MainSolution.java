public class MainSolution extends ConsoleProgram
{
    public void run()
    {
        int[] numArray =  {12, 17, 65, 7, 30, 88};

        ArrayAverageSol myArray = new ArrayAverageSol(numArray);

        System.out.println("The average of the array is " + myArray.getAverage());
    }
}
