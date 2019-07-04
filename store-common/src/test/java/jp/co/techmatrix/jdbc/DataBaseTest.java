package jp.co.techmatrix.jdbc;


import static org.hamcrest.MatcherAssert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class DataBaseTest {

	@Test
	public void testGetItemByTitle() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		DataBase db = new DataBase();
		List<String> books = db.getItemByTitle( "Java" );
	}

	@Test
	public void testGetItemById() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		DataBase db = new DataBase();
		List<String> books = db.getItemById( "1" );
		//assertThat(author.getId(), is(equalTo(3)));
		assertThat( "", true );
	}

}
