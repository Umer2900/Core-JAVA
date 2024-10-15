/*Nested for loop */
// A loop inside another loop, where the inner loop runs completely for each iteration of the outer loop.


class Demo
{
    public static void main(String[] args)
    {
        for(int i=1; i<4; i++)
        {
            System.out.println("Day " + i);

            for(int j=1; j<10; j++)
            {
                System.out.println("  " + (j+8) + " - " + (j+9) );
            }
        }
    }
}


//OUTPUT
/*
Day 1
  9 - 10
  10 - 11
  11 - 12
  12 - 13
  13 - 14
  14 - 15
  15 - 16
  16 - 17
  17 - 18
Day 2
  9 - 10
  10 - 11
  11 - 12
  12 - 13
  13 - 14
  14 - 15
  15 - 16
  16 - 17
  17 - 18
Day 3
  9 - 10
  10 - 11
  11 - 12
  12 - 13
  13 - 14
  14 - 15
  15 - 16
  16 - 17
  17 - 18
*/