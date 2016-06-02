<%@ page  import="main.guitar.connection.*,java.util.*,main.guitar.model.*,main.guitar.DAOImpl.*,main.guitar.IDAO.*"  language="java"  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%									//?????????????
HttpServletRequest req = (HttpServletRequest) request; 
	 %> 

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
		
		<h3 class="text-center">
				吉他销售系统
			</h3>
		</div>
	</div>
	<!-- <div class="row-fluid">
		<div class="span12">
			<form class="form-search">
				<input class="input-medium search-query" type="text" /> <button type="submit" class="btn">查找</button>
			</form>
		</div>
	</div> -->
	<div class="row-fluid">
		<div class="span4">
		
		<form  action="SearchGuitar" method="post">
					<fieldset>
					 <legend>吉他分类</legend> 
					  <label>类型&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>	
					  <select name="type">
	 			<option value=""></option>
	 			<option value="ACOUSTIC">Acoustic</option>
	 			<option value="ELECTRIC">Electric</option>
	 		  </select>
	 		<label>Builder:</label>
	 		<select name="builder">
	 			<option value=""></option>
	 			<option value="FENDER">Fender</option>
	 			<option value="MARTIN">Martin</option>
	 			<option value="GIBSON">Gibson</option>
	 			<option value="COLLINGS">Collings</option>
	 			<option value="OLSON">Olson</option>
	 			<option value="RYAN">Ryan</option>
	 			<option value="PRS">Prs</option>
	 		</select>
					  <label>尺寸&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="model" value="<%=request.getAttribute("model") %>"/>
 			
					 <br>
	 		 			  <label>numStrings</label><input type="text" name="numStrings" value="<%=request.getAttribute("numStrings") %>"/>
		<!--  <label>价格&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" name="price"/> -->	
					 
					 <label>背面材质</label><select name="backwood">
	 			<option value=""></option>
	 			<option value="INDIAN_ROSEWOOD">Indian_Rosewood</option>
				<option value="BRAZILIAN_ROSEWOOD">Brazilian_Rosewood</option>
				<option value="MAHOGANY">Mahogany</option>
				<option value="MAPLE">Maple</option>
				<option value="COCOBOLO">Cocobolo</option>
				<option value="CEDAR">Cedar</option>
				<option value="ADIRONDACK">Adirondack</option>
				<option value="ALDER">Alder</option>
				<option value="SITKA">Sitka</option>
	 		</select>
					  <label>梢头材质</label><select name="topwood">
	 			<option value=""></option>
	 			<option value="INDIAN_ROSEWOOD">Indian_Rosewood</option>
				<option value="BRAZILIAN_ROSEWOOD">Brazilian_Rosewood</option>
				<option value="MAHOGANY">Mahogany</option>
				<option value="MAPLE">Maple</option>
				<option value="COCOBOLO">Cocobolo</option>
				<option value="CEDAR">Cedar</option>
				<option value="ADIRONDACK">Adirondack</option>
				<option value="ALDER">Alder</option>
				<option value="SITKA">Sitka</option>
	 		</select>
					  <br>
			            <button type="submit" class="btn">搜索</button>
				</fieldset>
			</form>
		</div>
		<div class="span4">
		</div>
		<div class="span4">
		</div>
	</div>
				<tbody>
				
	                                 <h1>您所需要的吉他，暂时无法找到！谢谢惠顾！<h1>
			<%-- 	<%
				List<Guitar> guitarInventory=(List)request.getAttribute("manages");
			//	for (Iterator<Guitar> i = guitarInventory.iterator();i.hasNext(); ) { 
			 //		Guitar bh =(Guitar) i.next();
			 
			 for (int i = 0; i < guitarInventory.size(); i++) { 
			 		Guitar bh = blahs.get(i);
				        %>
					<tr>
					<td>
							<input type="text" name="SerialNumble" value="<%=bh.getSerialNumble() %>"/>
						</td>
						<td>
							<input type="text" name="Type" value="<%=bh.getType() %>"/>
						</td>
						<td>
							<input type="text" name="Builder" value="<%=bh.getBuilder() %>"/>
						</td>
						<td>
							<input type="text" name="Model" value="<%=bh.getModel() %>"/>
						</td>
						
						<td>
							<input type="text" name="Price" value="<%=bh.getPrice() %>"/>
						</td>
						
						
					
						<td>
							<input type="text" name="backwood" value="<%=bh.getBackWood() %>"/>
						</td>
						
					<td>
							<input type="text" name="TopWood(" value="<%=bh.getTopWood() %>"/>
						</td>
						
					</tr>
					
						<% }
			 %>						
					<tr class="error">
						<td>
							
						</td>
						<td>
							
						</td>
						<td>
							
						</td>
						<td>
							
						</td>
					</tr>
					<tr class="warning">
						<td>
						
						</td>
						<td>
							
						</td>
						<td>
						
						</td>
						<td>
						
						</td>
					</tr>
					<tr class="info">
						<td>
							
						</td>
						<td>
							
						</td>
						<td>
							
						</td>
						<td>
							
						</td>
					</tr>
				</tbody>
			</table> --%>
		<!--  <div class="pagination">
				<ul>
					<li>
						<a href="#">上一页</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#">下一页</a>
					</li>
				</ul>
			</div>
-->	
		
</body>
</html>