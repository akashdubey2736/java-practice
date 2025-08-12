package practice.java.oop.abstractionandinterfaces.listandbinarytree;

public class TestListAndTree {

	public static void main(String[] args) {
		
		Node node=new Node(Integer.valueOf(10));
		node.setNext(null);
		node.setPrevious(null);
		
		MyLinkedList linkedList=new MyLinkedList(node);
		

	}

}
