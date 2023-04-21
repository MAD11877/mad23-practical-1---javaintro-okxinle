import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of integers: ");
    int n = in.nextInt();

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
        System.out.printf("Enter integer %d: ", i + 1);
        int num = in.nextInt();

        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int mode = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    System.out.printf("The mode is: %d", mode);
    
  }
}
