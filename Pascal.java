//Pascal Project 5
class Pascal 
{
    public static int[] triangle(int n) 
    {
        int[] row = new int[n];
        row[0] = 1;  // It always starts with a 1

        for (int i = 1; i < n; i++) 
        {
            row[i] = 1;  //always end with a 1
            for (int j = i - 1; j > 0; j--) 
            {
                row[j] = row[j] + row[j - 1];
            }
        }

        return row;
    }
}
