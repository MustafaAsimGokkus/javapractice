package atm_project_hashset_linkedhashset;

public class DoubleStand {

	public static void main(String avs[])
    {
        int[][] print = haiArray(4);
        for (int[] element : print)
        {
            for (int l = 0; l < element.length; l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    static int[][] haiArray(int size)
    {
        int[][] printArray = new int[size][];
        int val = 1;
        for (int i = 0; i < printArray.length; i++)
        {
            printArray[i] = new int[i + 1];
            for (int j = 0; j < printArray[i].length; j++)
            {
                printArray[i][j] = val++;
            }
        }
        return printArray;
    }
}