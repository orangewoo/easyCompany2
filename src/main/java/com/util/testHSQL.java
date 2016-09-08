/**
 * hsql connection 테스트. 
 */
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 * @author
 * @since 
 * @version 1.0
 * @see <pre>
 * </pre>
 */
public class testHSQL {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args)  throws Exception
	{
		// TODO Auto-generated method stub
		  
		 Connection con = null;
		    try
		    {
		         Class.forName("org.hsqldb.jdbcDriver");            
		         con = DriverManager.getConnection("jdbc:hsqldb:D:\\eGovFrameDev-2.6.0-FullVer\\workspace\\easyCompany2\\data\\test", "sa","");

		         Statement st = con.createStatement();
		         ResultSet rs = st.executeQuery("SELECT * FROM IDS");
		         while(rs.next())
		         {
		             System.out.println(rs.getString(1));
		         }

		         con.close();

		    }
		    catch(Exception ex )
		    {
		        ex.printStackTrace();
		    }
		    finally
		    {
		        if(con!=null)
		        {
		          con.close();
		        }
		    }
	}

}
