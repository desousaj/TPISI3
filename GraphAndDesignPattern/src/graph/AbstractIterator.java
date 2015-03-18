package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractIterator implements Iterator<Node>{
	
	protected Graph g;
	protected List<Node> liste;
	protected List<Node> noeudsMarqees;
	
	public AbstractIterator(Graph g, Node noeudDeDepart){
		this.g = g;        
        noeudsMarqees = new LinkedList<>();
        noeudsMarqees.add(noeudDeDepart);
	}
	
    @Override
    public boolean hasNext() {
    	return(liste!=null && !liste.isEmpty());
    }

	 
	 public abstract Node next();
	 
		protected Node parcoursAdj(Node n) {
			System.out.println(n.toString());
	        List<Node> noeudsAdj = g.getAdjNodes(n);
	        for(Node node : noeudsAdj){
	        	if(!noeudsMarqees.contains(node)){	        		
		        	liste.add(node);
		        	noeudsMarqees.add(node);
	        	}
	        }
	        return n;
		}

}
