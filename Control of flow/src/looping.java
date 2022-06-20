import java.util.Scanner;

public class looping {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int count = 0;
		int numOfLoops;
		
		System.out.println("what number are we counting to?");
		numOfLoops = userInput.nextInt();
		
		while (count != numOfLoops) {
			count++;
			System.out.println(count);
			
		}
		System.out.println("we are done counting we made it to " + numOfLoops);
	}

}
