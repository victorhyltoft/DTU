package uge9.exercises.exercise5;

public class Zoo {

	private Animal[] animals = new Animal[MAX_ANIMALS];
	
	private static final int MAX_ANIMALS = 20;
	private int count = 0;
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Reptile[] reptiles = new Reptile[] { new Snake(), new Turtle() };
		Mammal[] mammals = new Mammal[] { new Elephant(), new Giraffe(), new Zebra() };
		Insect insect = new BullAnt();
		
		zoo.addAnimals(reptiles);
		zoo.addAnimals(mammals);
		zoo.addAnimal(insect);
		
		Animal[] animals = zoo.getAnimals();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			System.out.println(animal + " is an animal with " + animal.getLegs() + " legs that " + 
				(animal.laysEggs() ? "lays eggs." : "gives birth."));
		}		
	}
	
	public void addAnimal(Animal animal) {
		if (count == MAX_ANIMALS) {
			System.out.println("Cannot add " + animal + " as the zoo is full.");
			return;
		}
		animals[count++] = animal; 
	}
	
	public void addAnimals(Animal[] animals) {
		for (Animal animal : animals) {
			addAnimal(animal);
		}
	}
	
	public Animal[] getAnimals() {
		Animal[] animals = new Animal[count];
		for (int i = 0; i < count; i++) {
			animals[i] = this.animals[i];
		}
		return animals;
	}
	
	public int size() {
		return count;
	}
	
}