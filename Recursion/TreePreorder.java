class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class TreePreorder {  
    public static void main(String [] args) {  
        // 1. Create and connect nodes
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(30);
        preorder(root);
        System.out.println();
        postorder(root);
    }
    
    static void preorder(TreeNode curr){
        if(curr==null)
            return;
            
        System.out.print(curr.data+",");
        preorder(curr.left);
        preorder(curr.right);
    }
}
