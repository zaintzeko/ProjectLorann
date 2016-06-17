package main;


import controller.Controller;
import model.Model;
import saveInBDDByMapText.SaveMap;
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
	 * @throws Exception
	 */
	public static void main(final  String[] args) throws Exception {

		SaveMap.saveAllMap();
		final int LEVEL = 1;

		final Model model = new Model(LEVEL);
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
	}
}