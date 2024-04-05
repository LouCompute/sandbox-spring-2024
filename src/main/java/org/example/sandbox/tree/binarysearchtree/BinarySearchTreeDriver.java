package org.example.sandbox.tree.binarysearchtree;

import org.example.sandbox.tree.ElementNotFoundException;
import org.example.sandbox.tree.Tree;

import java.util.Iterator;

public class BinarySearchTreeDriver {

    public static void main(String[] args) {

        Tree<Integer> bst = new BinarySearchTree<>();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(15);
        bst.insert(12);
        bst.insert(9);

        try {
            System.out.println(bst.search(12));  // found
            System.out.println(bst.search(2));   // not found
        } catch (ElementNotFoundException e) {
            System.out.println("Element not found");
        }

        System.out.println("In Order traversal of binary tree will be:");
        printTraversal(bst.iteratorInOrder());

        System.out.println("\nPost Order traversal of binary tree will be:");
        printTraversal(bst.iteratorPostOrder());

        System.out.println("\nPre Order traversal of binary tree will be:");
        printTraversal(bst.iteratorPreOrder());

        System.out.println("\nLevel Order traversal of binary tree will be:");
        printTraversal(bst.iteratorLevelOrder());

        System.out.println();
        ((BinarySearchTree<Integer>) bst).printTopDownTree();

        bst.delete(8);

        System.out.println();
        ((BinarySearchTree<Integer>) bst).printTopDownTree();

    }

    private static void printTraversal(Iterator iterator) {

        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj != null) {
                System.out.print(obj + " ");
            }
        }
    }
}