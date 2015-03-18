package graph;

public class UnidrectedGraph  extends Graph implements IUndirectedGraph {
    //implémentation de l'interface IUndirectedGraph en utilisant le pattern Adapter

    @Override
    public void addEdge(Node _node1, Node _node2) {
        super.addArc(new Arc(_node1, _node2, null));
        super.addArc(new Arc(_node2, _node1, null));
    }

    @Override
    public boolean hasEdge(Node _node1, Node _node2) {
        return super.hasArc(_node1, _node2) && super.hasArc(_node2, _node1);
    }
    
}
