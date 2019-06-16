import domain.calcul.Calculation;

public class App {

	public static void main(String[] args) {
		
		Calculation test = new Calculation();
		
		System.out.println(test.getNbOperations());
		
		System.out.println(test.getOperands());
		System.out.println(test.getOperators());
		System.out.println(test.getResult());
		
		System.out.println(test.toString());


	}

}
