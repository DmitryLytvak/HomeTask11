package phonebook;

import phonebook.controller.Phonebook;

public class Main {
	
	public static void main(String[] args) {
		
		Phonebook myPhoneBook = new Phonebook();
		myPhoneBook.add("Kravchuk", "+380677778855");
		myPhoneBook.add("Kuchma", "+380668889988");
		myPhoneBook.add("Yushenko", "+380975558877");
		myPhoneBook.add("Yanukovich", "+380666666666");
		myPhoneBook.add("Poroshenko", "+380988587744");
		myPhoneBook.add("Zelenskiy", "+380677777777");
		myPhoneBook.add("Zelenskiy", "+380505587744");
		
		System.out.println();
		myPhoneBook.findAll("Zelenskiy");
	}
	
}
