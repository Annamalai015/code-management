

import java.io.*;

import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int i, j, n = 5, k = 4, num = 2, s;
    int[] c = new int[]{ 1, 2, 3, 5, 8 };
    for (i = 0; i < n; i++)
     {

	    for (j = 0; j < k; j++)
	    {
	        System.out.print (" ");
	    }
	    k = k - 1;
	    s=c[i];
	    if(s==5){
	        for (j = 2; j < s; j++)
	    {

	        System.out.print (j);

	       }
	    }
	    if(s==8){
	        for (j = 4; j < s; j++)
	    {

	        System.out.print (j);

	       }
	    }
	    if(s==1||s==2||s==3){
    for (j = 1; j < s; j++)
	    {

	        System.out.print (j);

	       }
	    }
	    
	    for (j = 0; j <= i; j++)
	    {

	        
	    
	        System.out.print (s);

	        s--;

        }

    System.out.println ("");
  }
  }

}

