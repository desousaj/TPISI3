package graph;

import java.io.Console;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;

public class NodeIteratorProfondeur extends AbstractIterator {

    public NodeIteratorProfondeur(Graph g, Node noeudDeDepart) {
    	super(g, noeudDeDepart);
    	liste = new Stack<Node>(); //2 Create new stack
    	liste.add(noeudDeDepart);
    }

    @Override
    public Node next() {
        Node n = ((Stack<Node>) liste).pop();
        return super.parcoursAdj(n);
    }


}
