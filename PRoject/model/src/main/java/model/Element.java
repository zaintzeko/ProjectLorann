package model;

import java.awt.Image;

public abstract class Element {
	
	private ILorannWorld lorannWorld;
	private Permeability permeability;
	private ISprite sprite;
	
	public Element(){
		
	}
	
	public ISprite getSprite(){
		return this.sprite;
	}
	
	public ISprite setSprite(final ISprite sprite){
		
		return this.sprite = sprite;
	}
	
	public Permeability getPermeability(){
		return this.permeability;
	}
	
	public Permeability setPermeability(final Permeability permeability){
		return this.permeability=permeability;
	}
	
	public ILorannWorld getLorannWorld(){
		
		return this.lorannWorld;
		
	}
	
	public ILorannWorld setLorannWorld(final ILorannWorld lorannWorld){
		return this.lorannWorld = lorannWorld;
		
	}
	
	public Image getImage() {
		return this.getSprite().getImage();
	}
	
	
}
