package week1.day1.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumberInArray {
	
	public static void main (String [] args) {
			int [] arr = {11,12,13,14,17,16,18};
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
			for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i]+1==arr[i+1]) {}
				else {
					int temp = arr[i]+1;
					System.out.println("missing number is "+temp);
				}
			}
}

}