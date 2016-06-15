package contract;

import java.util.Observable;

/**
 * The Interface IModel.
 *
 * @author
 */
public interface IModel {

	public ILorannWorld getLorannWorld();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
