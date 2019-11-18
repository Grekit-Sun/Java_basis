package com.ujs.mianshi6;
/**
 * 重建二叉树
 * @author SUN
 * 题目：
 * 输入二叉树的前序和中序遍历的结果，重建出改二叉树。
 * 假设前序和中序遍历中都不包含重复的数字。
 * 例如输入前序{1，2，4，7，3，5，6,8}，中序{4，7，2，1，5，3，8，6}重建出二叉树
 * 先序遍历：NLR;中序遍历：LNR;后序遍历：LRN;
 */
public class BinaryTreeNode {
	
	public int val;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;

}
