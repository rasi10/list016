package list016;

public class OtherGender extends Person{
	private static final String CLASS_NAME = "Other Gender";
	
	public OtherGender(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printClassName() {
		System.out.println("The person "+ name +" who is "+ age+" years old belongs to class: "+ CLASS_NAME);
	}
}
