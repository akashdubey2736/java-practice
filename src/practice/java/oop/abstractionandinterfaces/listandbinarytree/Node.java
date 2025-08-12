package practice.java.oop.abstractionandinterfaces.listandbinarytree;

public class Node extends ListItem{

	public Node(Object value) {
		super(value);
	}

	@Override
	public ListItem next() {
		return rightLink;
		
	}

	@Override
	public ListItem setNext(ListItem listItem) {
		rightLink=listItem;
		return rightLink;
		
	}

	@Override
	public ListItem previous() {
		return leftLink;
		
	}

	@Override
	public ListItem setPrevious(ListItem listItem) {
		leftLink=listItem;
		return leftLink;
		
	}

	@Override
	public int  compareTo(ListItem listItem) {
		if(listItem.value.equals(this.getValue())) {
			return 0;
		}
		else {
			return 1;
		}
		
		
	}
	
	

}
