public class NodeArray {
    private Node[] nodeArray;

    public NodeArray(int l) {
        nodeArray = new Node[l];
//        Fill node array with default nodes
        for (int i = 0; i < nodeArray.length; i++) {
            nodeArray[i] = new Node();
        }
    }




//    Access methods
    public Node get(int i) {
        return nodeArray[i];
    }
    public void set(int i, Node n) {
        nodeArray[i] = n;
    }
    public int getLength() {return nodeArray.length;}
}