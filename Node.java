public class Node {
    private String element;
    private Node left;
    private Node right;

    public Node(String element) {
        this.element = element;
        left = null;
        right = null;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String min() {
        if(left == null){
            return element;
        }else{
            return left.min();
        }
    }

    public String max() {
        if(right == null){
            return element;
        }else{
            return right.min();
        }
    }

}
