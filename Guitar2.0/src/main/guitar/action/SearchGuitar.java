package main.guitar.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import main.guitar.DAOImpl.InventoryDAOImpl;
import main.guitar.IDAO.InventoryIDAO;
import main.guitar.connection.*;
import main.guitar.model.Builder;
import main.guitar.model.Guitar;
import main.guitar.model.GuitarSpec;
import main.guitar.model.Inventory;
import main.guitar.model.Wood;
import main.guitar.model.Type;
/**
 * Servlet implementation class SearchGuitar
 */
@WebServlet("/SearchGuitar")
public class SearchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String  builder=request.getParameter("builder");
		String  model=request.getParameter("model");
		String  type=request.getParameter("type");
		String  numStrings=request.getParameter("numStrings");
		String  backwood=request.getParameter("backwood");
		String  topwood=request.getParameter("topwood");
	//	WebService webService = (WebService) getServletContext().getAttribute("webService");
		
		/*GuitarSpec whatErinLikes = 	new GuitarSpec(Builder.valueOf(builder), model, 
			    Type.valueOf(type), Integer.parseInt(numStrings), Wood.valueOf(backwood), Wood.valueOf(topwood));*/
		Builder buider1=Builder.valueOf(builder);
		Type type1=Type.valueOf(type);
		Wood backwood1=Wood.valueOf(backwood);
		Wood topwood1=Wood.valueOf(topwood);
		GuitarSpec whatErinLikes = 	new GuitarSpec(buider1, model, 
				type1, Integer.parseInt(numStrings),backwood1,topwood1);
	     InventoryIDAO inventoryIDAO=new InventoryDAOImpl();
		 Inventory inventory1 = null;
		try {
			inventory1 = inventoryIDAO.getInventorys();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    List matchingGuitars = inventory1.search(whatErinLikes);
	    PrintWriter out=response.getWriter();
	    if (!matchingGuitars.isEmpty()) {
		      System.out.println("Erin, you might like these guitars:");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        GuitarSpec spec = guitar.getSpec();
		        out.println("  We have a " +
		          spec.getBuilder() + " " + spec.getModel() + " " +
		          spec.getType() + " guitar:\n     " +
		          spec.getBackWood() + " back and sides,\n     " +
		          spec.getTopWood() + " top.\n  You can have it for only $" +
		          guitar.getPrice() + "!\n  -------------------------------------");
		      }
		    } else {
		     out.println("Sorry, Erin, we have nothing for you.");
		    }
		  }
	    
	    
	    
	  /*  request.setAttribute("model", model);
	    request.setAttribute("numStrings", numStrings);
	    if(match.size()!=0){
	    request.setAttribute("matchingGuitars", matchingGuitars);
		request.getRequestDispatcher("/guitar.jsp").forward(request,response);	*/


	/*private void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		
	}*/

	/*private void initializeInventory() {
		// TODO Auto-generated method stub
		
	}
*/








			
		
		


}
	/*private static void initializeInventory(Inventory inventory) {
		    inventory.addGuitar("11277", 3999.95, 
		      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
		                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		    inventory.addGuitar("V95693", 1499.95, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("V9512", 1549.95, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("122784", 5495.95, 
		      new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
		                     Wood.MAHOGANY, Wood.ADIRONDACK));
		    inventory.addGuitar("76531", 6295.95, 
		      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("70108276", 2295.95, 
		      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("82765501", 1890.95, 
		      new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("77023", 6275.95, 
		      new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("1092", 12995.95, 
		      new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
		                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		    inventory.addGuitar("566-62", 8999.95, 
		      new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
		                     Wood.COCOBOLO, Wood.CEDAR));
		    inventory.addGuitar("629584", 2100.95, 
		      new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 
		                     6, Wood.MAHOGANY, Wood.MAPLE));
		  }

	*/

/*private static void initializeInventory() {

	try{		
		
		//and password=?
		Connection conn=null;
		PreparedStatement stmt1=conn.prepareStatement("SELECT * FROM Guitar");
		ResultSet rs=stmt1.executeQuery();
		
		while (rs.next()) {
			Inventory inventory =new Inventory();
			inventory.addGuitar(rs.getString("serialNumble"),rs.getDouble("price"), 
				      new GuitarSpec(Builder.valueOf(rs.getString("builder")),
				    		  rs.getString("model"),
				    		  Type.valueOf(rs.getString("type")),
				    		  rs.getInt("numStrings"),
				    		  Wood.valueOf(rs.getString("backwood")),
				    		  Wood.valueOf(rs.getString("topwood"))));
		}
		}catch(SQLException e){
			SQLException ex = e;
		}finally{
			Object conn;
			Object ex;
			if(conn!=null){
				try{
					((Connection) conn).close();
				}catch(SQLException e){
					if(ex==null){
						ex=e;
					}
				}
			}
		if(ex!=null){
			throw new RuntimeException();
		}
		}
*/



