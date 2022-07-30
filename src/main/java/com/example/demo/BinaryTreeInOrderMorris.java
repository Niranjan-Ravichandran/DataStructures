package com.example.demo;


class Node {
		int data;
		Node left, right;

		Node(int item)
		{
			data = item;
			left = right = null;
		}
	}

	class BinaryTreeInOrderMorris {
		Node root;
		void MorrisTraversal(Node root)
		{
			if (root == null)
				return;

			Node current, prev;
			current = root;
			while(current!=null) {
				//left-> root -> right
				if(current.left == null) {
					System.out.println(current.data);
					current = current.right;
				}else {
					prev = current.left;
					while(prev.right!=null && prev.right !=current) {
						prev = prev.right;
					}
					if(prev.right == null) {
						prev.right = current;
						current = current.left;
					}else {
						prev.right = null;
						System.out.println(current.data);
						current = current.right;
					}
				}
			}
			
		}

		// Driver Code
		public static void main(String args[])
		{
			/* Constructed binary tree is
				1
				/ \
				2	 3
			/ \
			4	 5
			*/
			BinaryTreeInOrderMorris binaryTree = new BinaryTreeInOrderMorris();
			binaryTree.insert(10);
			binaryTree.insert(5);
			binaryTree.insert(18);
			
			binaryTree.insert(3);
			binaryTree.insert(7);
			
			binaryTree.insert(20);
			binaryTree.insert(15);

			binaryTree.MorrisTraversal(binaryTree.root);
		}
		void insert(int data) {
			root = insert(root, data);
		}

		public Node insert(Node current, int data) {
			if (null == current) {
				current = new Node(data);
			} else {
				if (data <= current.data  ) {
					if (null == current.left) {
						current.left = new Node(data);
					} else {
						current.left = insert(current.left, data);
					}
				} else {
					if (null == current.right) {
						current.right = new Node(data);
					} else {
						current.right = insert(current.right, data);
					}

				}
			}
			return current;
		}
	}


