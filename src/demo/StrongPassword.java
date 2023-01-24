package demo;

import java.util.Scanner;

public class StrongPassword {
	/*
	 considers a password to be strong if it satisfies the following criteria:

      Its length is at least .
      It contains at least one digit.
      It contains at least one lowercase English character.
      It contains at least one uppercase English character.
      It contains at least one special character. The special characters are: !@#$%^&*()-+
      She typed a random string of length  in the password field but wasn't sure if it was strong. 
      Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

     Note: Here's the set of types of characters in a form you can paste in your solution:

      numbers = "0123456789"
      lower_case = "abcdefghijklmnopqrstuvwxyz"
      upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
      special_characters = "!@#$%^&*()-+"
      
      Example 
      Password : "2bbbb"

   This password is 5 characters long and is missing an uppercase and a special character. 
   The minimum number of characters to add is 2 .
    Password : "2bb#A"
   This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is 1 .
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length for string :");
		int n = sc.nextInt();
		System.out.println("Enter the password :");
		String password = sc.next();
		System.out.println("Validate Password :"+ValidatePassword(n,password));
		
		
		
		

	}

	public static int ValidatePassword(int n, String password) {
		int result =0;
		final String specialCharacters = "!@#$%^&*()-+";
		boolean uperCase = false;
		boolean lowerCase = false;
		boolean SpecialChar = false;
		boolean digit = false;
		for(char c : password.toCharArray() )
		{
			if(Character.isUpperCase(c))
			{
				uperCase = true;
			}
			if(Character.isLowerCase(c))
			{
				lowerCase = true;
			}
			if(Character.isDigit(c))
			{
				digit = true;
			}
			if(specialCharacters.contains(String.valueOf(c)))
			{
				SpecialChar = true;
			}
		}
			if(!uperCase) result++;
			if(!lowerCase) result++;
			if(!digit) result++;
			if(!SpecialChar) result++;
			if(n<6)
			{
				return Math.max(result,n-6);
			}
			
		
		
		
		
		
		return result;
	}

	
}


















