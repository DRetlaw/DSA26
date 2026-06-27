public class TreePostorder {  
    public static void main(String [] args) {  
        // 1. Create and connect nodes
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(30);
        postorder(root);
    }
    
    static void postorder(TreeNode curr){
        if(curr==null)
            return;
            
        postorder(curr.left);
        postorder(curr.right);
        System.out.print(curr.data+",");
    }
}


class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
}
