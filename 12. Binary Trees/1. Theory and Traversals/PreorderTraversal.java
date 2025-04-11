import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { 
        data = val; 
        left = null;
        right = null; 
    }
}

class Solution {

    List<Integer> result = new ArrayList<>();
    
    public void traverse(TreeNode root) {
        if (root == null) { return; }
        result.add(root.data);
        traverse(root.left);
        traverse(root.right);
    }

    public List<Integer> preorder(TreeNode root) {
        traverse(root);
        return result;
    }
}

public class PreorderTraversal {
    
}
