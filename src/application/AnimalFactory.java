package application;

import domain.animals.AbsAnimal;
import domain.animals.Bird;
import domain.animals.Fish;
import domain.animals.Mammal;
import domain.animals.Reptil;
import domain.nutrition.Carnivorous;
import domain.nutrition.Herbivore;
import domain.nutrition.Omnivore;
import utilities.ConstantUtilities;

public class AnimalFactory {

	public static AbsAnimal createAnimal(int animalId) throws Exception {
		if (animalId == ConstantUtilities.DOLPHIN) {
			return new Mammal("Dolphin", new Carnivorous());
		}

		if (animalId == ConstantUtilities.ELEPHAN) {
			return new Mammal("Elephan", new Herbivore());
		}

		if (animalId == ConstantUtilities.EAGLE) {
			return new Bird("Eagle", new Carnivorous());
		}

		if (animalId == ConstantUtilities.TUNA) {
			return new Fish("Tuna", new Omnivore());
		}

		if (animalId == ConstantUtilities.CROCODILE) {
			return new Reptil("Crocodile", new Carnivorous());
		}

		throw new Exception("Invalid id");
	}

}
