/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第K大元素
 */

// @lc code=start
class KthLargest {

    TreeNode root;
    int nodeCount = 0;
    int maxCount;

    public KthLargest(int k, int[] nums) {
        maxCount = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        TreeNode node;
        int minValue;
        if (nodeCount < maxCount) {
            // System.out.println("insert" + val);
            root = insert(root, val);
            nodeCount++;
        } else {
            node = findMin(root);
            minValue = node.val;
            if (minValue <= val) {
                // System.out.println("insert" + val);
                root = removeMin(root);
                root = insert(root, val);
            } else {
                // System.out.println("skip" + val);
            }
        }
        node = findMin(root);
        minValue = node.val;
        return minValue;
    }

    public TreeNode findMin(TreeNode node) {
        TreeNode head = node;
        while (head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }

    public TreeNode removeMin(TreeNode node) {
        TreeNode head = node;
        TreeNode parentNode = node;
        while (head.left != null) {
            parentNode = head;
            head = head.left;
        }
        // System.out.println("remove" + head.val);
        if (head != node) {
            if (head.right != null) {
                parentNode.left = head.right;
            } else {
                parentNode.left = null;
            }
        } else {
            node = node.right;
        }
        return node;
    }

    public TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            node = new TreeNode(val);
        } else {
            // System.out.println("insert detail" + node.val + " " + val);
            if (node.val < val) {
                if (node.right != null) {
                    node.right = insert(node.right, val);
                } else {
                    // System.out.println("insert detail right" + node.val + " " + val);
                    node.right = new TreeNode(val);
                }
            } else {
                if (node.left != null) {
                    node.left = insert(node.left, val);
                } else {
                    // System.out.println("insert detail left" + node.val + " " + val);
                    node.left = new TreeNode(val);
                }
            }
        }
        return node;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */
// @lc code=end
