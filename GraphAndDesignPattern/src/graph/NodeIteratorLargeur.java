package graph;

import java.util.LinkedList;

public class NodeIteratorLargeur extends AbstractIterator {

	    public NodeIteratorLargeur(Graph g, Node noeudDeDepart) {
	    	super(g, noeudDeDepart);
	    	liste = new LinkedList<>();
	        liste.add(noeudDeDepart);
	    }


	    @Override
	    public Node next() {
	        Node n = super.liste.remove(0);
	        return super.parcoursAdj(n);
	    }


	}


