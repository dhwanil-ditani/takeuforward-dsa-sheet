import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Map.Entry<TreeNode, Integer>> q = new LinkedList<Map.Entry<TreeNode, Integer>>();
        q.add(Map.entry(root, 0));
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        while (!q.isEmpty()) {
            Map.Entry<TreeNode, Integer> entry = q.poll();
            TreeNode curr = entry.getKey();
            Integer level = entry.getValue();
            if (curr.left != null) {
                q.add(Map.entry(curr.left, level+1));
            }
            if (curr.right != null) {
                q.add(Map.entry(curr.right, level+1));
            }
            if (result.size() == level+1) {
                result.add(new ArrayList<>());
            }
            result.get(level).add(curr.data);
        }
        return result;
    }
}

public class LevelOrderTraversal {
    
}
