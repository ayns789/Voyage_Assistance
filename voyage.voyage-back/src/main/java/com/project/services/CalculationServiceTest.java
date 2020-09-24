package com.project.services;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceTest {
	
	// method that return cube of the giver number
	public static int cube(int n) {
		return n*n*n;
	}
    
	// method that returns the maximum number
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i=1;i<arr.length;i++) {
			if (max<arr[i])
				max=arr[i];
		}
		return max;
	}
    

}
