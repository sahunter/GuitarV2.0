package main.guitar.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import main.guitar.IDAO.InventoryIDAO;

public class Inventory {
	private  List guitars;
	private InventoryIDAO   inventoryIDAO ;
	  public Inventory() {
	    guitars = new LinkedList();
}
	  public void addGuitar(String serialNumber, double price,
              GuitarSpec spec) {
Guitar guitar = new Guitar(serialNumber, price, spec);
guitars.add(guitar);
}

public Guitar getGuitar(String serialNumber) {
for (Iterator i = guitars.iterator(); i.hasNext(); ) {
Guitar guitar = (Guitar)i.next();
if (guitar.getSerialNumber().equals(serialNumber)) {
return guitar;
}
}
return null;
}

public  List search(GuitarSpec searchSpec) {
List matchingGuitars = new LinkedList();
for (Iterator i = guitars.iterator(); i.hasNext(); ) {
Guitar guitar = (Guitar)i.next();
if (guitar.getSpec().matches(searchSpec))
matchingGuitars.add(guitar);
}
return matchingGuitars;
}
}
