package Basics;

public class PrimeNumber1 {
	    public static void main(String[] args) {
	        int n = 10; // Define the range from 1 to n
	        
	        System.out.println("Prime numbers between 1 to " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



