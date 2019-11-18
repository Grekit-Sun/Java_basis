package com.ujs.mianshi6;

import java.util.Arrays;

public class ReBuildBinaryTree {
	public static void main(String[] args) {
		int[] preSort = {1,2,4,7,3,5,6,8};
		int[] inSort = {4,7,2,1,5,3,8,6};
		try {
			rebuildCore(preSort,inSort);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static BinaryTreeNode rebuildCore(int[] preorder,
			int[] inorder) throws Exception{
		if (preorder == null || inorder == null) {
			return null;
		}
		if (preorder.length != inorder.length) {
			throw new Exception("���Ȳ�һ�������볤�Ȳ�һ����");
		}
		BinaryTreeNode root = new BinaryTreeNode();
		for(int i = 0;i < inorder.length;i++) {
			if (inorder[i] == preorder[0]) {
				root.val = inorder[i];
				System.out.println(root.val);
				root.leftNode = rebuildCore(Arrays.copyOfRange(preorder, 1, i+1)
						, Arrays.copyOfRange(inorder, 0, i));
				root.rightNode = rebuildCore(Arrays.copyOfRange(preorder, i+1, preorder.length)
						, Arrays.copyOfRange(inorder, i+1, inorder.length));
			}
		}
		return root;
	}
}
