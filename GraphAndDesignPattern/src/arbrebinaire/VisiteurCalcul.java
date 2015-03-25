package arbrebinaire;

public class VisiteurCalcul implements IVisitor {
	private int total;
	
	public VisiteurCalcul(){
		total = 0;
	}

	@Override
	public void visitConcreteAddition(Addition a) {
		a.getOpG().accept(this);
		int inter = total;
		a.getOpD().accept(this);
		total = inter + total;
		
	}

	@Override
	public void visitConcreteMultiplication(Multiplication a) {
		a.getOpG().accept(this);
		int inter = total;
		a.getOpD().accept(this);
		total = inter * total;
	}

	@Override
	public void visitConcreteNegation(Negation a) {
		a.getOpG().accept(this);
		total= -total;
	}

	@Override
	public void visitConcreteConstante(Constante a) {
		total = a.getValeur();
	}

	public int getTotal() {
		return total;
	}

	private void setTotal(int total) {
		this.total = total;
	}

}
