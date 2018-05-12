package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		Position<Integer> right = t.addChild(t.root(), 9);
		t.addChild(right, 7);
		t.addChild(right, 10);
		Position<Integer> left = t.addChild(t.root(), 20);
		right = t.addChild(left, 15);
		t.addChild(right, 12);
		right = t.addChild(right, 17);
		t.addChild(right, 19);
		left = t.addChild(left, 21);
		left = t.addChild(left, 40);
		t.addChild(left, 30);
		t.addChild(left, 45);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		Position<Integer> right = t.addLeft(t.root(), 9);
		t.addRight(right, 10);
		t.addLeft(right, 7);
		Position<Integer> left = t.addRight(t.root(), 20);
		right = t.addLeft(left, 15);
		t.addLeft(right, 12);
		right = t.addRight(right, 17);
		t.addLeft(right, 19);
		left = t.addRight(left, 21);
		left = t.addRight(left, 40);
		t.addLeft(left, 30);
		t.addRight(left, 45);
		
		return t; 
	}


}
