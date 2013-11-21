public class Dog {

	private String dogBreed;
	private String dogName;

	public Dog(String name, String breed) {
		dogName = name;
		dogBreed = breed;
	}

	void sayName() {
		System.out.print(dogName);
	}

	void sayBreed() {
		System.out.print(dogBreed);
	}

	void bark() {
		System.out.print("Wooff ");
	}

	void dig() {
		System.out.print("Waaah ");
	}

	void cry() {
		// TODO Auto-generated method stub
		System.out.print("cainnn ");
	}

}
