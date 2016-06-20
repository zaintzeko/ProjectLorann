package contract;

public interface ISpell {

	Boolean executeMoveIfPossible(int x, int y);

	public void setSpellFired(boolean spellFired);
}