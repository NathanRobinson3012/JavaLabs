package lab7;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab7 {
	
	private int Sum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum+=num;
		}
		return sum;
	}
	
	private double Mean(int[] array) {
		return Sum(array)/array.length;
	}
	
	private int Min(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int num : array) {
			if (num<min) min=num;
		}
		return min;
	}
	
	private int Max(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int num : array) {
			if (num>max) max=num;
		}
		return max;
	}
	
	private ArrayList<Integer> FindAll(int[] array,int item){
		ArrayList<Integer> answers = new ArrayList<Integer>();
		for(int i=0; i<array.length;i++) {
			if (array[i]==item) answers.add(i);
		}
		return answers;
	}
	
	private int[] BubbleSort(int[] array) {
		//Itorator:
		for (int i = 0;i<array.length;i++) {
			for (int j = 0; j<array.length-(i+1);j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	private int[] QuickSortArray(int[] array) {
		ArrayList<Integer> temp = new ArrayList<Integer>(); //Arrays.asList(array);
		//temp.addAll(array);
		
		/*for (int num : array) {
			temp.add(num);
		}*/
		
		for(int i = 0; i<array.length;i++)temp.add(array[i]);
		
		temp=QuickSort(temp);
		int[] ans = new int[temp.size()];
		for (int i = 0; i<temp.size();i++) ans[0]=temp.get(i);
		return ans;
		
	}
	
	private ArrayList<Integer> QuickSort(ArrayList<Integer> array){
		if (array.size()<=1) {
			return array;
		}
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		int pivot = array.get(0);
		for (int i = 1; i < array.size();i++) {
			if (array.get(i)>pivot) right.add(array.get(i));
			else left.add(array.get(i));
		}
		array=QuickSort(left);
		array.add(pivot);
		array.addAll(QuickSort(right));
		for (int num :array) System.out.println(num);
		return array;
	}
	
	public void Part1() {
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		//int FirstCase = FindAll(numbers,0).g
		System.out.printf("The sum of this is %d and the mean is %f. The min is %d and max is %d while the number you wanted to find can be found in places %d \n", Sum(numbers),Mean(numbers),Min(numbers),Max(numbers),FindAll(numbers,0).get(0));
		
		numbers=BubbleSort(numbers);
		//numbers=QuickSortArray(numbers); THIS QUICKSORT DOES NOT WORK!!!
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}
	
	

}
