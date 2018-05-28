public interface TreeInterface {
    public void insert(Node startNode, Node newNode);
    public boolean isEmpty();
    public void inOrderTraversal(Node startNode);
    public void preOrderTraversal(Node startNode);
    public void postOrderTraversal(Node startNode);
    public Node get(Node startNode,String element);
    public Node min(Node startNode);
    public Node max(Node startNode);
    public int countNodes(Node startNode);
    public Node delete(Node startNode, String element);

}
