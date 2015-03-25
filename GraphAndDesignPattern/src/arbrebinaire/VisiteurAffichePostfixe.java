package arbrebinaire;

public class VisiteurAffichePostfixe implements IVisitor {
	
	public VisiteurAffichePostfixe(){
		
	}

	@Override
	public void visitConcreteAddition(Addition a) {
		Noeud gauche = a.getOpG();
		gauche.accept(this);
		Noeud droite = a.getOpD();
		droite.accept(this);
		System.out.print(a.getOp());
	}

	@Override
	public void visitConcreteMultiplication(Multiplication a) {
		Noeud gauche = a.getOpG();
		gauche.accept(this);
		Noeud droite = a.getOpD();
		droite.accept(this);
		System.out.print(a.getOp());
	}

	@Override
	public void visitConcreteNegation(Negation a) {
		Noeud gauche = a.getOpG();
		gauche.accept(this);
		System.out.print(a.getOp());
	}

	@Override
	public void visitConcreteConstante(Constante a) {
		System.out.print(a.getValeur());
	}

}
