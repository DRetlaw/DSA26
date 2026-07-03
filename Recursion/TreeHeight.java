class TreeHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode('a');
        root.left = new TreeNode('b');
        root.right = new TreeNode('c');
        root.right.right = new TreeNode('d');
        
        System.out.println(getHeight(root));
    }
    
    static int getHeight(TreeNode node)
    {
        if(node == null)
            return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}

class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    TreeNode(char value){
        this.value= value;
    }
    
}
