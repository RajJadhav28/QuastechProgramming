package Arrays1;

import java.util.HashSet;
import java.util.Scanner;

public class Pro14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Use a HashSet to store unique elements and count duplicates
        HashSet<Integer> uniqueElements = new HashSet<>();
        int duplicateCount = 0;

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueElements.add(arr[i])) { // add returns false if element is already in the set
                duplicateCount++;
                System.out.println(arr[i]);
            }
        }
        
        System.out.println("Number of duplicate elements: " + duplicateCount);

        // Output array without duplicates
        System.out.println("Array after removing the duplicate elements:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }

        sc.close();

	}

}
