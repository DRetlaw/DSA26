class BTTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode('a');
        root.left= new TreeNode('b');
        root.right= new TreeNode('c');
        root.left.left= new TreeNode('d');
        root.left.right= new TreeNode('e');
        root.right.left= new TreeNode('f');
        root.right.right= new TreeNode('g');
        traverse(root, new StringBuilder(""));
        System.out.println("Completed.");
    }
    
    static void traverse(TreeNode node, StringBuilder s){
        if(node==null)
            return;
        s.append(node.value);
        if(node.left==null && node.right==null)
            System.out.println(""+s);
        traverse(node.left,s);
        traverse(node.right,s);
        s.delete(s.toString().length()-1,s.toString().length());
    }
}

class TreeNode {
    char value;
    TreeNode right;
    TreeNode left;
    TreeNode(char value){
        this.value = value;
    }
    
}
