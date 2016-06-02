package main.guitar.IDAO;

import java.sql.SQLException;
import java.util.List;

import main.guitar.model.Guitar;
import main.guitar.model.Inventory;

public interface InventoryIDAO {
	 public Inventory getInventorys() throws Exception;
}
