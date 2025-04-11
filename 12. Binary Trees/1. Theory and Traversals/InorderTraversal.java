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
        traverse(root.left);
        result.add(root.data);
        traverse(root.right);
    }

    public List<Integer> inorder(TreeNode root) {
        traverse(root);
        return result;
    }
}


public class InorderTraversal {

    
}