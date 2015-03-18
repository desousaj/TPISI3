package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Graph implements IDirectedGraph {

    private Set<Node> nodes;
    private Set<Arc> arcs;
    
    public Graph(){
        this.nodes = new HashSet();
        this.arcs = new HashSet();
    }

    public boolean hasArc(Node _n1, Node _n2) {
        for (Arc a : arcs) {
            if (a.getSource().equals(_n1) && a.getDestination().equals(_n2)) {
                return true;
            }
        }
        return false;
    }

    
    public void addArc(Arc _edge) {
        this.arcs.add(_edge);
    }

    
    public List<Arc> getArc(Node _n) {
        List<Arc> res = new ArrayList<>();
        for (Arc a : arcs){
            if (a.getSource().equals(_n)){
                res.add(a);
            }
        }
        return res;
    }

    
    public void addNode(Node _node) {
        this.nodes.add(_node);
    }

    
    public Set<Node> getAllNodes() {
        return nodes;
    }

    
    public int getNbNodes() {
        if (nodes != null) {
            return nodes.size();
        } else {
            return 0;
        }
    }

    @Override
    public List<Node> getAdjNodes(Node _n) {
        List<Node> res = new ArrayList<>();
        for (Arc a : arcs){
            if (a.getSource().equals(_n)){
                res.add(a.getDestination());
            }
        }
        return res;
    }

    @Override
    public Iterator<Node> createIteratorProfodeur(Node noeudDeDepart) {
        return new NodeIteratorProfondeur(this, noeudDeDepart);
    }

	@Override
	public Iterator<Node> createIteratorLargeur(Node noeudDeDepart) {
		return new NodeIteratorLargeur(this, noeudDeDepart);
	}

}
