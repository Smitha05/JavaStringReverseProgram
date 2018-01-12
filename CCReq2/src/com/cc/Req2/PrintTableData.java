package com.cc.Req2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class PrintTableData {
	
	public ArrayList<Employee> getEmpData(){
		 ArrayList<Employee> al=new ArrayList<Employee>();
			try{  
				
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","username","passsword");  
				  
				PreparedStatement ps=con.prepareStatement("select * from Employee");  
				ResultSet rs=ps.executeQuery();  
				ResultSetMetaData rsmd=rs.getMetaData();   
				System.out.println(rsmd.getColumnName(1)+" "+rsmd.getColumnName(2)+" "+rsmd.getColumnName(3)+" "+rsmd.getColumnName(4));
				while(rs.next()){
					
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setPhonenum(rs.getString("phonenum"));
				e.setAddress(rs.getString("address"));
				al.add(e);
				}		  
				con.close(); 
				System.out.println(al);
				}catch(Exception e){ System.out.println(e);}  
		return al;
	}

	public static void main(String[] args) {
  

	}
	 
}
