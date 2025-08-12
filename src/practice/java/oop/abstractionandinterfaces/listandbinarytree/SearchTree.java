package practice.java.oop.abstractionandinterfaces.listandbinarytree;

public class SearchTree implements NodeList{
	
	private ListItem root;
	
	public SearchTree(ListItem root) {
		this.root=root;
		
	}

	@Override
	public ListItem getRoot() {
		return root;
		
	}

	public boolean addItem(ListItem listItem) {
		return false;
		
		
	}
	
	public boolean removeItem(ListItem listItem) {
		return false;
		
		
	}


	public void performRemoval(ListItem item,ListItem parent) {
		
		
	}
	
	public void  traverse(ListItem root) {
		if(root==null) {
			System.out.println("The list is empty!");
		}
		else {
			
		}
		
		
	}

	

}
