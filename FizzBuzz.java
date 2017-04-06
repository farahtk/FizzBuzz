import java.util.*;
public class FizzBuzz {
	public static void main(String args[]){
		FizzBuzz fb = new FizzBuzz();
		fb.testFizzBuzz();
	}
	// testing the function Fizz Buzz; unit tests
	void testFizzBuzz(){
    System.out.print("Input 0 |");
		System.out.println(fizzBuzz(0));
		System.out.println("expected null");
    
		System.out.print("Input 1 |");
		System.out.println(fizzBuzz(1));
		System.out.println("expected [1]");
		
		System.out.print("Input 2 |");
		System.out.println(fizzBuzz(2));
		System.out.println("expected [1, 2]");
		
		System.out.print("Input 3 |");
		System.out.println(fizzBuzz(3));
		System.out.println("expected [1, 2, Fizz]");
		
		System.out.print("Input 4 |");
		System.out.println(fizzBuzz(4));
		System.out.println("expected [1, 2, Fizz, 4]");
		
		System.out.print("Input 5 |");
		System.out.println(fizzBuzz(5));
		System.out.println("expected [1, 2, Fizz, 4, Buzz]");
		
		System.out.print("Input 6 |");
		System.out.println(fizzBuzz(6));
		System.out.println("expected [1, 2, Fizz, 4, Buzz, Fizz]");
		
		System.out.print("Input 10|");
		System.out.println(fizzBuzz(10));
		System.out.println("expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]");
		
		System.out.print("Input 15|");
		System.out.println(fizzBuzz(15));
		System.out.println("expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]");
		
		System.out.print("Input 20|");
		System.out.println(fizzBuzz(20));
		System.out.println("expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz]");
	}
	// prints Fizz for multiples of 3, Buzz for multiples of 5 and FizzBuzz for multiples of 15 
	List<String> fizzBuzz(int n) {
        if (n==0) return null;
        String[] str = new String[n];
        for (int i=0, j=1; i<n; i++, j++){
        	if (j%15==0) 
            str[i]= "FizzBuzz";
        	else if (j%3==0) 
            str[i] = "Fizz";
        	else if (j%5==0) 
            str[i] = "Buzz";
        	else 
            str[i]= String.valueOf(j);
        }
        //List uses more memory to operate so used the array and converted in the end to save time and memory
        return Arrays.asList(str);
    }
}
