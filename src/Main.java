public class Main {

	/*
	 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. 
	 * Print the decimal value of each fraction on a new line.
	 * 
	 * Complexity:
	 * Time = O(N)
	 * Space = O(1)
	 */
	
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 0, -2, 3, -5, 10, 0, -2, 120};
		
		float numberOfPositives = 0;
		float numberOfNegatives = 0;
		float numberOfZeroes = 0;
		int numberOfElements = array.length;
		
		for (int i = 0; i < numberOfElements; i++) 
		{
			if(array[i] > 0) 
			{
				numberOfPositives++;
			}else if(array[i] < 0) 
			{
				numberOfNegatives++;
			}else 
			{
				numberOfZeroes++;
			}
		}
		
		System.out.println("Fraction of positives: " + numberOfPositives/numberOfElements);
		System.out.println("Fraction of negatives: " + numberOfNegatives/numberOfElements);
		System.out.println("Fraction of zeros: " + numberOfZeroes/numberOfElements);
		
	}

}
