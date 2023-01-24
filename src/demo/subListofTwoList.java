package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class subListofTwoList {
	/*
	 a list all distinct Integers In nums2 which are not present in numsI.
    Note that the integers in the lists may be returned in any order.
    Example I:
    Input: nums I = [1,2,3], nums2 = [2,4,6 ]
    Output: [1,3],[4,6]
    Explanation:
    For nums1. nums1[1] = 2 is present at index 0 of nums2, 
    whereas nums1 [0] = 1 and nums1[2] = 3 are not present in nums2. 
    Therefore, answer [0] = [1,3]. For nums2, nums 2[0] = 2 is present at index i of nums1. 
    whereas nums2 [1] =6 and nums2[2] 6 are not present In nums2. Therefore, answer [1], [4,6]

.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Etner the number of n:");
		int n = sc.nextInt();
		int[] arr1 = new int[n]; 
		int[] arr2 = new int[n]; 
		System.out.println("Etner array1 :");
		for(int i = 0; i<n; i++)
		{
		 arr1[i] = sc.nextInt();
		
	}
		System.out.println("Etner array2 :");
		for(int i = 0; i<n; i++)
		{
		 arr2[i] = sc.nextInt();
		
	}
		System.out.println("The prefix character" + findDifference (arr1,arr2));
	}

	public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
		List<List<Integer>> list = new ArrayList<> ();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
			set1.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(set.contains(arr2[j]));
			{
				set2.add(arr2[j]);
			}
		 
			{
				set1.remove(arr2[j]);
			
		}
		}
		List<Integer> l = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		
		return list;
	}
}
