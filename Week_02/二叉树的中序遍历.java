package tree;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历
 * @version v1.0
 * @Author: mxk
 * @Description:
 * @Date: 7:22 上午 2020/11/13
 */
public class inOrder {

    /**
     * 时间复杂度：O(n)O(n)，其中 nn 是二叉树的节点数。每一个节点恰好被遍历一次。
     *
     * 空间复杂度：O(n)O(n)，为递归过程中栈的开销，平均情况下为 O(\log n)O(logn)，最坏情况下树呈现链状，为 O(n)O(n)。
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return new ArrayList();
        }
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root!=null || !stack.empty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode top = stack.pop();
            res.add(top.val);
            root = top.right;
        }
        return res;
    }

    public static List<Integer> inorder(TreeNode root){
        if(root == null){
            return null;
        }
        List<Integer> res = new ArrayList();
        inorderTraversal(root, res);
        return res;
    }
    public static void inorderTraversal(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
    }

    public static List<Integer> inorderTraversal6(TreeNode root){
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root!=null ||!stack.empty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode top = stack.pop();
            res.add(top.val);
            root = top.right;
        }
        return res;
    }

    public static List<Integer> res = new ArrayList();
    public static List<Integer> inorderTraversal5(TreeNode root){
        if(root == null) {
            return null;
        }
        inorderTraversal1(root.left);
        res.add(root.val);
        inorderTraversal1(root.right);
        return res;
    }


    public static List<Integer> inorderTraversal2(TreeNode root){
        if(root==null){
            return new ArrayList();
        }
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root!=null || !stack.empty()){
            while(root!=null){
                stack.add(root);
                root = root.left;
            }
            TreeNode left = stack.pop();
            res.add(left.val);
            root = root.right;
        }
        return res;
    }

    public static List<Integer> inorderTraversal1(TreeNode root){
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(root!=null || !stack.empty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode end = stack.pop();
            res.add(end.val);
            root = root.right;
        }
        return res;
    }

    public static List<Integer> inorderTraversal0(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();

        while(root != null || !stack.empty()) {
            while(root !=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode head = stack.pop();
            res.add(head.val);
            root = head.right;
        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(2, left1, null);
        TreeNode root = new TreeNode(1, null, right1);

        List<Integer> res = inorderTraversal(root);
        System.out.println(res);
    }
}
