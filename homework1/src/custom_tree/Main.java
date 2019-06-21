package custom_tree;

public class Main {
    public static void main(String[] args) {
        CustomTree customTree = new CustomTree();

        customTree.add(15);
        customTree.add(16);
        customTree.add(17);
        customTree.add(18);
        customTree.add(19);
        customTree.add(20);

        customTree.inOrden();
        customTree.postOrden();
        customTree.preOrden();
    }
}
