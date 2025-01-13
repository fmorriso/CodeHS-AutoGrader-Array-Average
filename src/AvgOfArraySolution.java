public class AvgOfArraySolution
{
    private int[] values;

    public AvgOfArraySolution(int[] theValues)
    {
        values = theValues;
    }

    public double getAvg()
    {
        double total = 0;
        for (int val : values)
        {
            total  = total + val;
        }
        return total / values.length;
    }
}
