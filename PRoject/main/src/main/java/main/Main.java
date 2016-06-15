package main;

import java.io.IOException;

import controller.Controller;
import model.Model;
import saveInBDDByMapText.LoadTextFile;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method    .
	 *
	 * @param args
	 *          the arguments
	 */
	public static void main(final  String[] args) {
		/*final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		controller.control();*/
		try {
			new LoadTextFile().loadFile("lvl1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}