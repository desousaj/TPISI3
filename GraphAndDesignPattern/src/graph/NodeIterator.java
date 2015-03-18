package graph;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class NodeIterator implements Iterator<Node> {

    private Graph g;
    private Node posCourante;
    private List<Node> liste;
    private List<Node> noeudsMarqees;

    public NodeIterator(Graph g, Node noeudDeDepart) {
        this.g = g;
        posCourante = noeudDeDepart;
        liste = new LinkedList<>();
        liste.add(posCourante);
        noeudsMarqees = new LinkedList<>();
        noeudsMarqees.add(posCourante);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    // a revoir
    @Override
    public boolean hasNext() {
        for (Node n : g.getAdjNodes(posCourante)) {
            if (!noeudsMarqees.contains(n)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Node next() {
        for (Node n : g.getAdjNodes(posCourante)) {
            if (!noeudsMarqees.contains(n)) {
            	noeudsMarqees.add(n);
                return n;
            }
        }
        return null;
    }
}
