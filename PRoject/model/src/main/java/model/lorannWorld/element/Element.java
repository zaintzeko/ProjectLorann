package model.lorannWorld.element;

import contract.IElement;
import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 */
public abstract class Element implements IElement{

	/** The sprite. */
	private ISprite sprite;
	
	/** The symbole. */
	private final char symbole;

	/**
	 * Instantiates a new element.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 */
	public Element(final ISprite sprite, final char symbole){
		this.sprite = sprite;
		this.symbole = symbole;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#getSprite()
	 */
	public ISprite getSprite(){
		return this.sprite;
	}

	/* (non-Javadoc)
	 * @see contract.IElement#getSymbole()
	 */
	public char getSymbole() {
		return this.symbole;
	}

	/**
	 * Sets the sprite.
	 *
	 * @param sprite the sprite
	 * @return the i sprite
	 */
	public ISprite setSprite(final ISprite sprite){

		return this.sprite = sprite;
	}


}
