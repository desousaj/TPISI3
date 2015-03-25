package arbrebinaire;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostfixe(){
		racine.accept(new VisiteurAffichePostfixe());
	}
	
	public int calcule(){
		VisiteurCalcul v = new VisiteurCalcul();
		racine.accept(v);
		return v.getTotal();
	}
	
	
	public int calculeHauteur(){
		VisiteurCalcul v = new VisiteurCalcul();
		racine.accept(v);
		return v.getTotal();
	}
	
	
	
}
