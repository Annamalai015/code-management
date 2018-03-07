

import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int i, j, n = 5, k = 2 * n - 2;
    for (i = 0; i < n; i++)
      {

	for (j = 0; j < k; j++)
	  {
	    System.out.print (" ");
	  }
	k = k - 1;
	for (j = 0; j <= i; j++)
	  {
	    System.out.print ("* ");
	  }
	System.out.println ("");
      }
  }
}
