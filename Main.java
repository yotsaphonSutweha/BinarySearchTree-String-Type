public class Main {
    public static void main(String args[]){
        Tree tree = new Tree();

        Node node = new Node("B");
        Node node1 = new Node("A");
        Node node2 = new Node("C");
        Node node3 = new Node("D");
        Node node5 = new Node("J");
        Node node6 = new Node("L");
        Node node7 = new Node("Z");

        tree.insert(tree.root,node);
        tree.insert(tree.root,node1);
        tree.insert(tree.root,node2);
        tree.insert(tree.root,node3);
        tree.insert(tree.root,node5);
        tree.insert(tree.root,node6);
        tree.insert(tree.root,node7);



        tree.inOrderTraversal(tree.root);
//        tree.preOrderTraversal(tree.root);
//        tree.postOrderTraversal(tree.root);
//        System.out.println(tree.isEmpty());

        System.out.println(tree.get(tree.getRoot(),"L").getElement() + " is found");
        System.out.println(tree.min(tree.getRoot()).getElement() + " is the minimum value of this tree");
        System.out.println(tree.max(tree.getRoot()).getElement() + " is the maximum value of this tree");
        System.out.println(tree.countNodes(tree.getRoot()));

        tree.delete(tree.getRoot(), "Z");
        tree.inOrderTraversal(tree.root);
        tree.delete(tree.getRoot(),"C");
        tree.inOrderTraversal(tree.root);
    }
}
