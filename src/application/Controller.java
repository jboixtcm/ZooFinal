package application;

import java.util.ArrayList;
import java.util.List;

import domain.animals.AbsAnimal;
import domain.animals.Fish;
import domain.animals.Mammal;
import domain.nutrition.Carnivorous;
import domain.nutrition.Herbivore;
import domain.nutrition.Omnivore;

public class Controller {

	protected List<AbsAnimal> animals = new ArrayList<>();

	private void addAnimal(AbsAnimal animal) {
		this.animals.add(animal);
	}

	List<AbsAnimal> getAnimals() {
		return animals;
	}

	public String printAllAnimals() {
		String result = "";
		for (AbsAnimal animal : animals) {
			result += animal.getName();
		}
		return result;
	}

	public String feedAllAnimals() {
		String text = "";
		for (AbsAnimal animal : animals) {
			text += animal.getName() + " " + animal.feed() + "\n";
		}
		return text;
	}

	public void createAnimal(int animalId) throws Exception {
		AbsAnimal animal = AnimalFactory.createAnimal(animalId);
		addAnimal(animal);
	}

}
