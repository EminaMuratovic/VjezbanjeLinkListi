public class Test {
	public static void main(String[] args) {
		String name;
		PersonList test = new PersonList();
		System.out
				.println("Enter the names you want in the list. After you enter word 'end' list will be completed!");
		do {
			name = TextIO.getlnString();
			Person person = new Person(name);
			if (name.toLowerCase().equals("end"))
				break;
			test.add(person);

		} while (!name.toLowerCase().equals("end"));
		System.out.println("Number of persons: " + test.getSize());
		System.out.println("Names of persons: ");
		test.printList();
		String[] array = test.toArray();
		System.out.println("List in the array: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

	}

}
