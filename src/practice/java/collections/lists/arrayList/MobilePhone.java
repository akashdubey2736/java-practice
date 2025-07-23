package practice.java.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> myContact;
	
	public MobilePhone(String myNumber,Contact myContacts) {
		this.myNumber=myNumber;
		this.myContact=new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName())>0) {
			System.out.println("Contact is already here!");
			return false;
		}
		myContact.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact newContact, Contact oldContact) {
		
		int foundPosition=findContact(oldContact);
		
		if(foundPosition<0) {
			System.out.println(oldContact.getName() + " , was not found!");
			return false;
		}
		else if(findContact(newContact.getName())!=-1) {
			System.out.println("Contact with name "+ newContact.getName() + " already exists. Update was not successfull. ");
			return false;
		}
		
		this.myContact.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+ " , was replaced with "+ newContact.getName());
		return true;
	}
	
	public boolean removeContact(Contact contact) {
		
		int foundPosition=findContact(contact);
		
		if(foundPosition<0) {
			System.out.println(contact.getName() + " , was not found.");
			return false;
		}
		this.myContact.remove(foundPosition);
		System.out.println(contact.getName() + " , was deleted.");
		return true;
		
	}
	
	private int findContact(Contact contact) {
		
		return myContact.indexOf(contact);
		
	}
	
	private int findContact(String contactName) {
		
		for (int i=0;i<myContact.size();i++) {
			Contact contact=myContact.get(i);
			if(contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public Contact queryContact(String name) {
		
		int position=findContact(name);
		if(position>=0) {
			return this.myContact.get(position);
		}
		return null;
		
	}
	
	public void printContacts() {
		
		System.out.println("Contact List : ");
		for(int i=0;i<myContact.size();i++) {
			System.out.println((i+1)+". "+this.myContact.get(i).getName()+ " -> " + this.myContact.get(i).getPhoneNumber());
		}
		
		
	}

}
