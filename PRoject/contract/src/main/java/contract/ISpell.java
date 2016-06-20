package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface ISpell.
 */
public interface ISpell {

	/**
	 * Execute move if possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the boolean
	 */
	Boolean executeMoveIfPossible(int x, int y);

	/**
	 * Sets the spell fired.
	 *
	 * @param spellFired the new spell fired
	 */
	public void setSpellFired(boolean spellFired);
}