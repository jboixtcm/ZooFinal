package view;

import application.Controller;
import utilities.ConstantUtilities;

public class Main {

	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();

		controller.createAnimal(ConstantUtilities.EAGLE);
		controller.createAnimal(ConstantUtilities.DOLPHIN);
		System.out.println(controller.feedAllAnimals());
	}
}
