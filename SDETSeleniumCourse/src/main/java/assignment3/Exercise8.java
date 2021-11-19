package assignment3;

public class Exercise8 {

	public static void main(String[] args) {
		int num1 = 20, num2 = 0, res;
        try {
            res = num1/num2; //20/2
            System.out.println("Result of division is: " + res);
        }
        catch(ArithmeticException ex) {
        	throw new ArithmeticException("Cannot divide by zero");
        }
        catch(Exception ex2) {
            ex2.printStackTrace();
        }
	}

}
