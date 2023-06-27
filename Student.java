class Student{
	int rollNumber;
	String name;
	int age;
	char gender;

	Student(String name, int age, char gender){
		name = name;
		age = age;
		gender = gender;
	}
	void eat(){
		System.out.println("Eating Dosa");
	}
	void sleep(){
		System.out.println("Sleeping 5 Hrs");
	}
	void study(){
		System.out.println("Studying 6 Hrs");
	}
}