package contract;

import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Interface IModel.
 */
public interface IModel {

	/**
	 * Gets the lorann world.
	 *
	 * @return the lorann world
	 */
	public ILorannWorld getLorannWorld();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
