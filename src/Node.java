public class Node {
    private Node next; //The next node in linked list
    private Particle particle; //The contents of this node

    public Node(Node n, Particle c) {
        this.next = n;
        this.particle = c;
    }



//    Access methods
    public Node getNext() {
        return next;
    }

    public Particle getParticle() {
        return particle;
    }

    public void setContent (Particle c) {
        this.particle = c;
    }



//    Adds a node in front of this one
    public void add(Node n) {
        Node temp = next;
        next = n;
        n.next = temp;
    }


//    Removes the node in front of this one
    public void remove() {
        if (next == null) { return; } //Null pointer check

        next = next.next;
    }
}
