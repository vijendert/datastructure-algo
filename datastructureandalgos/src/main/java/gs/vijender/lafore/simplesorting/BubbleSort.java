package gs.vijender.lafore.simplesorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,5,3,6,7,4,8,1};
		doBubbleSortMyWay(input);
	}

	private static void doBubbleSortMyWay(int[] input) {
		/**
		 * Let the outer loop go till the end 
		 * this outer loop tells that the swapping is going
		 * to occur for all the elements
		 */
		for(int i=0;i<input.length;i++)
		{
			/**
			 * This loop picks each element
			 * and swap with the next element if 
			 * the element is greater than the element to its right
			 * The catch in the loop is
			 * we compare first with the second and at the end of the loop
			 * the last element is sorted . So we want this loop to reduce by one from the 
			 * last. So we do length - i But the comparison happens with the last and the second last element
			 * So we need to stop at one element before than the last element.
			 * Hence the loop is length -i-1.
			 */
			for(int j = 0;j<input.length-i-1;j++)
			{
				if(input[j] > input[j+1]) {
					swap(j,j+1,input);
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}

	private static void swap(int i, int j,int[] input) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
