package com.leetcode.sworFingerOffer;

/**
 * 重建二叉树
 */
public class offer07重建二叉树 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) return null;

        // 前序遍历的第一个节点为根节点
        TreeNode treeNode = new TreeNode(preorder[preLeft]);

        // 上边的根节点将中序遍历的左右两边分成左子树和右子树，找到中序遍历中根节点的位置
        int index = inLeft;
        while (preorder[preLeft] != inorder[index]) {
            index++;
        }

        // 计算左子树在数组中的长度
        int leftSize = index - inLeft;

        // 递归
        treeNode.left = build(preorder, preLeft + 1, preLeft + leftSize, inorder, inLeft, index - 1);
        treeNode.right = build(preorder, preLeft + leftSize + 1, preRight, inorder, index + 1, inRight);

        return treeNode;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
