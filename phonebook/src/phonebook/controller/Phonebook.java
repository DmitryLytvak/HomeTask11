package phonebook.controller;

import java.util.ArrayList;
import phonebook.model.Entry;


public class Phonebook {
	
	ArrayList<Entry> phoneBook = new ArrayList<>();
	
	public void add(String name, String phone) {
		this.phoneBook.add(new Entry(name, phone));
	}
	
	public void findAll(String name) {
		for (Entry e : this.phoneBook) {
			if (e.getName() == name) {
				System.out.println(e.getName() + " " + e.getPhone());
			}
		}
	}
}
