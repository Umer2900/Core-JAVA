class Demo
{
    public static void main(String[] args)
    {
        int rows = 3;
        int cols = 4;
        int arr[][] = new int[rows][cols];

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j] = (int) (Math.random() * 10);      
            }
        }

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(arr[i][j] + " ");       
            }
            System.out.println();
        }
    }
}


/*
    **Random OUTPUT**

    1 5 1 0
    1 9 2 6
    8 8 2 4
*/