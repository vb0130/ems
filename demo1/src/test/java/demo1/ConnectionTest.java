package demo1;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

import com.example.ems.common.ConnectionFactory;



public class ConnectionTest {
	
	@Test
	public void testCheckDbConnection()
	{
		
		Connection conn = ConnectionFactory.getConnection();
		Assert.assertNotNull(conn);
	}

}
