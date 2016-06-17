package main;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method .
	 *
	 * @param args
	 *          the arguments
	 * @throws Exception
	 */
	public static void main(final String[] args) throws Exception {

		/*
		 * try { new LoadTextFile().loadFile("level/lvl3.txt"); } catch (final IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// JADIET : Ceci est un test fait depuis eclipse pour voir quel est le souci avec GitHub
		System.out.println("Test JADT depuis eclipse.");

		final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
	}
}