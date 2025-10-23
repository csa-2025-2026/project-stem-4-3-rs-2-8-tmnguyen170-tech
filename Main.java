import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    for (int count = 1; count <= 25; count += 2)
    {
      System.out.println(count);
    }

    int tenCount = 1;
    for (int Q2count = 17; Q2count <= 73; Q2count++)
    {
      System.out.print(Q2count + " ");
      if (tenCount == 10)
      {
        System.out.println();
        tenCount = 1;
      }
      tenCount++;
    }

    int Num = 23;
    int fivecounter = 1;
    for (int Q3counter = Num; Q3counter <= 50; Q3counter++)
    {
      System.out.print(Q3counter + " ");
      if (fivecounter == 5)
      {
        System.out.println();
        fivecounter = 1;
      }
      fivecounter++;
    }
  }
}
