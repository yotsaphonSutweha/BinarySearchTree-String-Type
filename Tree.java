public class Tree implements TreeInterface{
    public Node root;

    public Tree() {
        root = null;
    }

    public Node getRoot(){
        return root;
    }

    @Override
    public void insert(Node startNode, Node newNode) {
        if(root == null){
            root = newNode;
        }else{
            if(newNode.getElement().compareTo(startNode.getElement()) < 0){
                if(startNode.getLeft() == null){
                    startNode.setLeft(newNode);
                }else{
                    insert(startNode.getLeft(),newNode);
                }
            }else if(newNode.getElement().compareTo(startNode.getElement()) > 0){
                if(startNode.getRight() == null){
                    startNode.setRight(newNode);
                }else{
                    insert(startNode.getRight(),newNode);
                }
            }else{
                System.out.println("You have already inserted the node");
            }
        }
    }


    @Override
    public boolean isEmpty() {
        if(root == null){
            return true;
        }
        return false;
    }

    @Override
    public void inOrderTraversal(Node startNode) {
        if(startNode == null){
            return;
        }
        inOrderTraversal(startNode.getLeft());
        System.out.println(startNode.getElement());
        inOrderTraversal(startNode.getRight());
    }

    @Override
    public void preOrderTraversal(Node startNode) {
        if(startNode == null){
            return;
        }
        System.out.println(startNode.getElement());
        preOrderTraversal(startNode.getLeft());
        preOrderTraversal(startNode.getRight());
    }

    @Override
    public void postOrderTraversal(Node startNode) {
        if(startNode == null){
            return;
        }
        postOrderTraversal(startNode.getLeft());
        postOrderTraversal(startNode.getRight());
        System.out.println(startNode.getElement());
    }

    @Override
    public Node get(Node startNode,String element) {
        if(startNode == null){
            return null;
        }
        else{
            if (startNode.getElement().compareTo(element) == 0) {
                return startNode;
            }
            else if(startNode.getElement().compareTo(element) > 0){
                return get(startNode.getLeft(),element);
            }else if(startNode.getElement().compareTo(element) < 0){
                return get(startNode.getRight(),element);
            }else{
                return null;
            }

        }
    }

    @Override
    public Node min(Node startNode) {
        if(startNode == null){
            return null;
        }else{
            if(startNode.getLeft() == null){
                return startNode;
            }else{
                return min(startNode.getLeft());
            }
        }
    }

    @Override
    public Node max(Node startNode) {
        if(startNode == null){
            return null;
        }else{
            if(startNode.getRight() == null){
                return startNode;
            }else{
                return max(startNode.getRight());
            }
        }
    }

    @Override
    public int countNodes(Node startNode) {
        if(startNode == null){
            return 0;
        }else{
            if(startNode.getLeft() == null && startNode.getRight() == null){
                return 1;
            }else{
                int left = countNodes(startNode.getLeft());
                int right = countNodes(startNode.getRight());
                return 1+left+right;
            }
        }
    }

    @Override
    public Node delete(Node startNode, String element) {
        if(startNode == null){
            return null;
        }
        if(startNode.getElement().compareTo(element) > 0){
            startNode.setLeft(delete(startNode.getLeft(), element));
        }else if(startNode.getElement().compareTo(element) < 0){
            startNode.setRight(delete(startNode.getRight(), element));
        }else{
            if(startNode.getLeft() == null){
                return startNode.getRight();
            }else if(startNode.getRight() == null){
                return startNode.getLeft();
            }
            startNode.setElement(startNode.getRight().min());
            startNode.setRight(delete(startNode.getRight(), startNode.getElement()));
        }
        return startNode;
    }
}
