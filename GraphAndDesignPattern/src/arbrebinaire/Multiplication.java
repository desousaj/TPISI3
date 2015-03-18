package arbrebinaire;

public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}

	public void accept(IVisitor v){
		v.visitConcreteMultiplication(this);
	}

}
