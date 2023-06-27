class StudentApp{
	public static void main(String[] args){
		Student s1 = new Student("abc",23,'f');
		
		s1.eat();
		s1.sleep();
		s1. study();
		System.out.println("Roll Number = " + s1.rollNumber);
		System.out.println("Name = " + s1.name);
		System.out.println("Age = " + s1.age);
		System.out.println("Gender = " + s1.gender);
	}
}