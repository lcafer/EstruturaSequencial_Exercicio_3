package EstruturaSequencial_Exercicio_3;
import java.util.Scanner; 

public class SumNumber {
	public static void main (String[] args) {
        int[] numbers = new int[2];
		Scanner getInput = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Me fale um número");
			int getNumber = getInput.nextInt();
			numbers[i] = getNumber;
        }
		System.out.print(numbers[0]+numbers[1]);
		getInput.close();
    }
}

