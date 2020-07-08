import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class BSTIterator {
  int nextCount = 0;
  ArrayList<Integer> list = new ArrayList<>();

  public BSTIterator(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode currentNode = root;
    while (!stack.isEmpty() || currentNode != null) {
      while (currentNode != null) {
        stack.push(currentNode);
        currentNode = currentNode.left;
      }
      currentNode = stack.pop();
      list.add(currentNode.val);
      currentNode = currentNode.right;
    }
  }

  /** @return the next smallest number */
  public int next() {
    return list.get(nextCount++);
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !list.isEmpty();
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    BSTIterator obj = new BSTIterator(root);
    int param_1 = obj.next();
    boolean param_2 = obj.hasNext();
    System.out.println(param_1);
    System.out.println(param_2);
  }
}