package Strategy;

public class OperationMultiply implements Strategy {

	@Override
	public void doOperation(int num1, int num2) {
		System.out.println(num1 * num2);	
	}

}
