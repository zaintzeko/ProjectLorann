package model.lorannWorld.element;

import contract.IElement;
import contract.ISprite;

public abstract class Element implements IElement{

	private ISprite sprite;
	private final char symbole;

	public Element(final ISprite sprite, final char symbole){
		this.sprite = sprite;
		this.symbole = symbole;
	}

	public ISprite getSprite(){
		return this.sprite;
	}

	public char getSymbole() {
		return this.symbole;
	}

	public ISprite setSprite(final ISprite sprite){

		return this.sprite = sprite;
	}


}
