class DogRoboApp{
	public static void main(String[] args){
		DogRobo dr = new DogRobo("Pug", "Scooby", "Black");
		System.out.println(dr.breed + ", " + dr.name +", " +dr.color);
		dr.bark();
		dr.play();
	}
}