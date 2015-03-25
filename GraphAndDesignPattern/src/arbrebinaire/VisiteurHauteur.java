package arbrebinaire;

public class VisiteurHauteur implements IVisitor {
	
	private int hauteurMax;
	
	public VisiteurHauteur(){
		hauteurMax=0;
	}

	@Override
	public void visitConcreteAddition(Addition a) {
		hauteurMax += 1;
		a.getOpG().accept(this); 
		int inter = hauteurMax;
		a.getOpD().accept(this); 
		if(hauteurMax<inter){
			hauteurMax = inter;
		}
	}

	@Override
	public void visitConcreteMultiplication(Multiplication a) {
		hauteurMax += 1;
		a.getOpG().accept(this); 
		int inter = hauteurMax;
		a.getOpD().accept(this); 
		if(hauteurMax<inter){
			hauteurMax = inter;
		}
	}

	@Override
	public void visitConcreteNegation(Negation a) {
		hauteurMax += 1;
		a.getOpG().accept(this); 
		
	}

	@Override
	public void visitConcreteConstante(Constante a) {
		hauteurMax = 1;
	}

}
