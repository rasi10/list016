package list016;

public class Female extends Person{
	private static final String CLASS_NAME = "Female";
	
	public Female(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printClassName() {
		System.out.println("The person "+ name +"belongs to class: "+ CLASS_NAME);
	}
}
