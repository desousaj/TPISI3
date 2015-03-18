package arbrebinaire;

public interface IVisitor {
	public void visitConcreteAddition(Addition a);
	public void visitConcreteMultiplication(Multiplication a);
	public void visitConcreteNegation(Negation a);
	public void visitConcreteConstante(Constante a);

}
