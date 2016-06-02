package main.guitar.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.apache.catalina.session.JDBCStore;

import main.guitar.connection.JDBCsqlite;

import main.guitar.IDAO.InventoryIDAO;
import main.guitar.model.Builder;
import main.guitar.model.Guitar;
import main.guitar.model.GuitarSpec;
import main.guitar.model.Inventory;
import main.guitar.model.Type;
import main.guitar.model.Wood;
public class InventoryDAOImpl implements InventoryIDAO{
	public Inventory getInventorys() throws Exception {
		JDBCsqlite jdbc =  new JDBCsqlite();
		Connection connection = jdbc.connection;
		PreparedStatement stmt1=null;
		SQLException ex=null;	
			stmt1=connection.prepareStatement("SELECT * FROM Guitar");
			ResultSet rs=stmt1.executeQuery();
			
			while (rs.next()) {
				Inventory inventory = new Inventory();
				inventory.addGuitar(rs.getString("serialNumble"),rs.getDouble("price"), 
					      new GuitarSpec(Builder.valueOf(rs.getString("builder")),
					    		  rs.getString("model"),
					    		  Type.valueOf(rs.getString("type")),
					    		  rs.getInt("numStrings"),
					    		  Wood.valueOf(rs.getString("backwood")),
					    		  Wood.valueOf(rs.getString("topwood"))));
			}
			
			stmt1.close();
			Inventory guitars = null;
			return guitars;
			
	

	}


	

}