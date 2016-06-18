package model.lorannWorld.element;

import contract.IElement;
import contract.ISprite;

public abstract class Element implements IElement{

	private Permeability permeability;
	private ISprite sprite;
	private final char symbole;

	public Element(final ISprite sprite, final Permeability permeability, final char symbole){
		this.sprite = sprite;
		this.permeability = permeability;
		this.symbole = symbole;
	}

	public Permeability getPermeability(){
		return this.permeability;
	}

	public ISprite getSprite(){
		return this.sprite;
	}

	public char getSymbole() {
		return this.symbole;
	}

	public Permeability setPermeability(final Permeability permeability){
		return this.permeability=permeability;
	}

	public ISprite setSprite(final ISprite sprite){

		return this.sprite = sprite;
	}


}
