/* 2D ARRAY */

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
                System.out.print(arr[i][j] + " ");       
            }
            System.out.println();
        }
    }
}


/*
    **OUTPUT**
    
    0 0 0 0 
    0 0 0 0
    0 0 0 0

*/