/*
    **Dynamic Memory Allocation**

    Dynamic memory allocation in arrays involves allocating memory at runtime from the heap, 
    allowing the array's size to be determined and modified during program execution, 
    rather than being fixed at compile time.
*/

class Demo
{
    public static void main(String[] args)
    {
        int arr[] = new int[4];         // [0, 0, 0, 0]

        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 4;
        arr[3] = 1;

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);       
        }
        
    }
}