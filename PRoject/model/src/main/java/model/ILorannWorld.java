package model;

public interface ILorannWorld {

	int getWidth();

	int getHeight();

	Element getElement(int x, int y);

	void addElement(Element element, int x, int y);

}