package domain.calcul;

import java.util.ArrayList;

public class Calculation {

	private int nbOperations;
	private ArrayList<Integer> operands;
	private ArrayList<Operator> operators;
	private int result;

	public Calculation() {
		operands = new ArrayList<>();
		operators = new ArrayList<>();
		this.generateOperation();
		this.generateResult();
	}

	public ArrayList<Integer> getOperands() {
		return operands;
	}

	public int getNbOperator() {
		return nbOperations;
	}

	public ArrayList<Operator> getOperators() {
		return operators;
	}
	
	public int getNbOperations() {
		return nbOperations;
	}

	public int getResult() {
		return result;
	}

	public void generateOperation() {
		this.nbOperations = (int) (Math.random() * 4 + 1);

		for (int i = 0; i < nbOperations; i++) {
			switch ((int)(Math.random()*4)) {
			case 0:
				operators.add(Operator.ADDITION);
				for (int j = 0; j < 2; j++)
					operands.add((int) (Math.random() * 10000)); // Deux chiffres choisis au hasard entre 0 et 9999
				break;
			case 1:
				operators.add(Operator.SUBSTRACTION);
				for (int j = 0; j < 2; j++)
					operands.add((int) (Math.random() * 10000));
				break;
			case 2:
				operators.add(Operator.MULTIPLICATION);
				for (int j = 0; j < 2; j++)
					operands.add((int) (Math.random() * 21)); // Deux chiffres choisis au hasard entre 0 et 20
				break;
			case 3:
				operators.add(Operator.DIVISION); // Pour avoir des résultats entiers lors des divisions, on crée une
													// multiplication puis on inverse l'opération.
				ArrayList<Integer> temp = new ArrayList<>();
				for (int j = 0; j < 2; j++)
					temp.add((int) (Math.random() * 13 + 1)); // Deux chiffres choisis au hasard entre 1 et 10
				int resTemp = temp.get(0) * temp.get(1);
				operands.add(resTemp);
				operands.add(temp.get(0));
				break;
			}
		}
	}

	public void generateResult() {
		int j = 0;
		for (int i = 0; i < nbOperations; i++) {
			switch (operators.get(i).getOperator()) {
			case ("+"):
				this.result += operands.get(j) + operands.get(j + 1);
				break;
			case ("-"):
				this.result += operands.get(j) - operands.get(j + 1);
				break;
			case ("x"):
				this.result += operands.get(j) * operands.get(j + 1);
				break;
			case ("/"):
				this.result += operands.get(j) / operands.get(j + 1);
				break;
			}
			j += 2;
		}
	}
	
	@Override
	public String toString() {
		if (this.nbOperations == 1) {
			return this.operands.get(0) + " " + this.operators.get(0).getOperator() + " " + this.operands.get(1) + " = ";
		}
		else {
			String str = new String();
			int j = 0;
			for (int i = 0; i < this.nbOperations; i++) {
				str = str + "(" + this.operands.get(j) + " " + this.operators.get(i).getOperator() + " " + this.operands.get(j+1) + ")";
				if (i != this.nbOperations -1)
					str = str + " + ";
				j += 2;
			}
			str = str + " = ";
			
			return str;
		}
	}


}
