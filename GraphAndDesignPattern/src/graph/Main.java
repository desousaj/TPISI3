package graph;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(new IntegerLabel(1));
		Node n2 = new Node(new IntegerLabel(2));
		Node n3 = new Node(new IntegerLabel(3));
		Node n4 = new Node(new StringLabel("A"));
		Node n5 = new Node(new IntegerLabel(5));
		Node n6 = new Node(new IntegerLabel(6));
		Node n7 = new Node(new IntegerLabel(7));
		Node n8 = new Node(new IntegerLabel(8));

		Arc a1 = new Arc(n1,n2, new DoubleLabel(0.1));
		Arc a1reversed = new Arc(n2,n1, new IntegerLabel(2));
		Arc a2 = new Arc(n2,n3, null);
		Arc a2reversed = new Arc(n3,n2, null);
		Arc a3 = new Arc(n1,n3, null);
		
		Arc a5 = new Arc(n3,n5, null);
		Arc a6 = new Arc(n5,n7, null);
		Arc a7 = new Arc(n5,n6, null);
		Arc a8 = new Arc(n7,n6, null);
		Arc a9 = new Arc(n3,n8, null);

		IDirectedGraph g = new Graph();
		g.addNode(n1);g.addNode(n2);g.addNode(n3);g.addNode(n4);
		g.addNode(n5);g.addNode(n6);g.addNode(n7);g.addNode(n8);
		g.addArc(a1);g.addArc(a1reversed);g.addArc(a2);g.addArc(a2reversed);g.addArc(a3);
		g.addArc(a5);g.addArc(a6);g.addArc(a7);g.addArc(a8);g.addArc(a9);
		System.out.println(g);
		System.out.println(g.hasArc(n1, n2)+" "+g.hasArc(n2, n4));
		System.out.println(g.getAdjNodes(n3));
		
		System.out.println("Parcours largeur :");
		Iterator<Node> i = g.createIteratorLargeur(n1);
		while(i.hasNext()){
			i.next();
		}	
		System.out.println("Parcours profondeur :");
		Iterator<Node> i2 = g.createIteratorProfodeur(n1);
		while(i2.hasNext()){
			i2.next();
		}	
	}

}
