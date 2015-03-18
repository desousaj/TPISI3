package arbrebinaire;

public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}
	
	public void accept(IVisitor v){
		v.visitConcreteNegation(this);
	}



}
