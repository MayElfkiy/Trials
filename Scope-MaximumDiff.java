import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    public Difference(int[] elements){
    this.elements=elements;
    this.maximumDifference= maximumDifference;

}


public void computeDifference() {
    int min= Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for (int i=0; i<elements.length;i++) {
        min=Math.min(min,elements[i]);
        max=Math.max(max,elements[i]);
    }


    maximumDifference = max-min;
}
}
/////////////////////////////////////////////////////////////////////////////
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
