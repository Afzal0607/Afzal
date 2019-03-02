package main;

import java.util.Arrays;

public class MinIntergerArray {

	public static void main(String[] args) {
     int array [] = {10, 52, 3, 78, 1, 45};
     int min = Arrays.stream(array).min().getAsInt();
     System.out.println("Minimum Value in the given array"+min);
	
	}

}
