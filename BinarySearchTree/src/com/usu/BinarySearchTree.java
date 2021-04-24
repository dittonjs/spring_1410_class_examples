package com.usu;

public class BinarySearchTree {
    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    private TreeNode root;

    public boolean search(int value) {
        TreeNode current = root;
        while(current != null) {
            if (current.value == value) {
                return true;
            } else if (current.value < value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        return false;
    }

    public boolean remove(int value) {
        // find the node that contains the value
        TreeNode parent = null;
        TreeNode current = root;
        boolean found = false;
        while(!found && current != null) {
            if (current.value == value) {
                found = true;
            } else if (current.value < value) {
                parent = current;
                current = current.right;
            } else {
                parent = current;
                current = current.left;
            }
        }

        if (!found) return false;

        if (current.left == null) {
             if (parent == null) {
                 root = current.right;
             } else if (value < parent.value) {
                 parent.left = current.right;
             } else {
                 parent.right = current.right;
             }
        } else {
            TreeNode rightMostParent = current;
            TreeNode rightMost = current.left;
            while(rightMost.right != null) {
                rightMostParent = rightMost;
                rightMost = rightMost.right;
            }
            current.value = rightMost.value;
            if (rightMostParent.right == rightMost) {
                rightMostParent.right = rightMost.left;
            } else {
                rightMostParent.left = rightMost.left;
            }
        }

        return true;
        // p arent
        // node (the one we want to remove)
        // if node has no left sub tree
            // set parents left or right = node.right
        // else
            // find the right most child node of the node we want to remove
            // find the parent of the right most child
            // copy the right most nodes value into node we want to delete
            // if right most parent.right == right most
                // right most parent.right = right most.left
            // else
                // right most parent.left = right most.left
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            TreeNode parent = null;
            TreeNode current = root;

            while(current != null) {
               parent = current;
               if (current.value < value) { // go right
                   current = current.right;
               } else { // go left
                   current = current.left;
               }
            }

            // parent points to node where we need to insert the value
            if (parent.value < value) { // insert as right node
                parent.right = new TreeNode(value);
            } else { // insert as left left
                parent.left = new TreeNode(value);
            }
        }
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public void displayInOrder() {
        displayInOrder(root);
    }

    private void displayInOrder(TreeNode node) {
        if (node == null) return;
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
    }

    public int numLeafNodes() {
        return numLeafNodes(root);
    }

    private int numLeafNodes(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return numLeafNodes(node.left) + numLeafNodes(node.right);
    }




}
