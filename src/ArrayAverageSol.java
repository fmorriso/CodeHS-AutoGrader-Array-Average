public class ArrayAverageSol
{
    private int[] values;

    public ArrayAverageSol(int[] theValues)
    {
        values = theValues;
    }

    public double getAverage()
    {
        double total = 0;
        for (int val : values)
        {
            total  = total + val;
        }
        return total / values.length;
    }
}
