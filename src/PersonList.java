public class PersonList {
	private PersonNode head;
	private int size;

	/**
	 * creates a person list
	 */
	public PersonList() {
		head = null;
		size = 0;
	}

	/**
	 * gets the size of the person list
	 * @return size of the list
	 */
	public int getSize() {
		return size;
	}

	/**
	 * adds a person in the list
	 * @param person Person
	 */
	public void add(Person person) {
		PersonNode newPerson = new PersonNode(person);
		if (head == null) {
			head = newPerson;
			size++;
			return;
		}
		PersonNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newPerson);
		size++;

	}

	/**
	 * adds a person to the specific place on the list
	 * @param person Person 
	 * @param index int place in the list
	 */
	public void add(Person person, int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("nema");
		PersonNode newPerson = new PersonNode(person);
		if (index == 0) {
			newPerson.setNext(head);
			head = newPerson;
			size++;
			return;
		}
		if (index == size) {
			add(person);
			return;
		}
		PersonNode current = head;
		int counter = 1;
		while (counter < index) {
			current = current.getNext();
			counter++;
		}
		newPerson.setNext(current.getNext());
		current.setNext(newPerson);
		size++;
	}
	
	
	public void addAlphabetically(Person person) {
		PersonNode current = head;
		PersonNode newPerson = new PersonNode(person);

		if (current.getPerson().name.charAt(0) > person.name.charAt(0)) {
			newPerson.setNext(current.getNext());
			current.setNext(newPerson);
			size++;
		}
		

	}

	/**
	 * creates an array of the list
	 * @return array
	 */
	public String[] toArray() {
		PersonNode current = head;
		String[] array = new String[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = current.getPerson().name;
			current = current.getNext();
		}
		return array;
	}

	/**
	 * prints the list
	 */
	public void printList() {
		PersonNode current = head;
		while (current != null) {
			System.out.println(current.getPerson().name);
			current = current.getNext();
		}
	}

}
