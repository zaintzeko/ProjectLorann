package main;


import controller.Controller;
import model.Model;
import view.View;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(final  String[] args) throws Exception {

		//SaveMap.saveAllMap();
		final int LEVEL = 5;

		final Model model = new Model(LEVEL);
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
		model.getLorannWorld().play();
	}
}