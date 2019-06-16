package domain.calcul;

public enum Operator {
	
	ADDITION("+"),
	SUBSTRACTION("-"),
	MULTIPLICATION("x"),
	DIVISION("/");
	
	private String operator;
	
	private Operator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}
	
	
}
