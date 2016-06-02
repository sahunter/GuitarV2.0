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
import main.guitar.model.CompareResult;
import main.guitar.model.Guitar;
import main.guitar.model.GuitarSpec;
import main.guitar.model.Inventory;
import main.guitar.model.Type;
import main.guitar.model.Wood;
public class InventoryDAOImpl implements InventoryIDAO{
	public Inventory getInventorys() throws Exception {
		JDBCsqlite jdbcsqlite =  new JDBCsqlite();
		Connection connection = jdbcsqlite.connection;
		PreparedStatement stmt1=null;
		Inventory inventory = new Inventory();
	
		SQLException ex=null;	
			stmt1=connection.prepareStatement("SELECT * FROM Guitar");
			ResultSet rs=stmt1.executeQuery();
			
			while (rs.next()) {
				
				CompareResult compareResult=new CompareResult();
				Builder builder1=compareResult.compareBuilder(rs.getString("builder"));
				Type type1=compareResult.compareType(rs.getString("type"));
				Wood backwood1=compareResult.compareWood(rs.getString("backWood"));
				Wood topwood1=compareResult.compareWood(rs.getString("topWood"));
			inventory.addGuitar(rs.getString("serialNumble"),rs.getDouble("price"), 
					      new GuitarSpec(builder1,
					    		  rs.getString("model"),
					    		  type1,
					    		  rs.getInt("numStrings"),
					    		  backwood1,
					    		  topwood1));
			}if(rs != null){
				rs.close();
			}
			
			stmt1.close();
			connection.close();
			return inventory;
			
	

	}


	

}