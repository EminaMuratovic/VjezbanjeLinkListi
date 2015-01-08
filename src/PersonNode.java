public class PersonNode {
	private PersonNode next;
	private Person person;

	/**
	 * creates a person node
	 * @param person Person
	 */
	public PersonNode(Person person) {
		this.person = person;
	}

	/**
	 * gets the next person node
	 * @return next person node
	 */
	public PersonNode getNext() {
		return next;
	}

	/**
	 * sets the next person node
	 * @param next PersonNode
	 */
	public void setNext(PersonNode next) {
		this.next = next;
	}

	/**
	 * gets the person from the person node
	 * @return person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * sets the person from the person node
	 * @param person Person
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
