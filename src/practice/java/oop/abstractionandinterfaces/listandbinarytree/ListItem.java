package practice.java.oop.abstractionandinterfaces.listandbinarytree;

public abstract class ListItem {
	
	protected ListItem rightLink;
	protected ListItem leftLink;
	protected Object value;
	
	public ListItem(Object value) {
		this.value=value;
	} 
	abstract ListItem next();
	abstract ListItem setNext(ListItem listitem);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem listitem);
	abstract int compareTo(ListItem listitem);
	
	public  Object getValue() {
		return value;
	}
	public  void setValue(Object value) {
		this.value=value;
	}
	

}
