package model.lorannWorld.element;

import contract.IElement;
import contract.ILorannWorld;
import contract.ISprite;

public abstract class Element implements IElement{

	private ILorannWorld lorannWorld;
	private Permeability permeability;
	private ISprite sprite;
	private final char symbole;

	public Element(final ISprite sprite, final Permeability permeability, final char symbole){
		this.sprite = sprite;
		this.permeability = permeability;
		this.symbole = symbole;
	}

	public ILorannWorld getLorannWorld(){

		return this.lorannWorld;

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

	public ILorannWorld setLorannWorld(final ILorannWorld lorannWorld){
		return this.lorannWorld = lorannWorld;

	}

	public Permeability setPermeability(final Permeability permeability){
		return this.permeability=permeability;
	}

	public ISprite setSprite(final ISprite sprite){

		return this.sprite = sprite;
	}

	public Boolean executeMoveIfPossible(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}


}
