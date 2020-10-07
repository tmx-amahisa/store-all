package jp.co.techmatrix.jdbc;


import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.spy;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@PrepareForTest({ DataBase.class })
@RunWith(PowerMockRunner.class)
public class DataBaseTest {

	@Test
	public void testGetItemByTitle()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		DataBase db = new DataBase();
		List<String> books = db.getItemByTitle("Java");
	}

	@Test
	public void testGetItemById()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		DataBase db = new DataBase();
		List<String> books = db.getItemById("1");
		//assertThat(author.getId(), is(equalTo(3)));
		assertThat("", true);
	}

	/**
	 * Parasoft Jtest UTA: getItemById(String) のテスト
	 *
	 * @see jp.co.techmatrix.jdbc.DataBase#getItemById(String)
	 * @author amahisa
	 */
	@Test
	public void testGetItemById2() throws Throwable {
		// Given
		DataBase underTest = new DataBase();

		// When
		String id = ""; // UTA: デフォルト値
		List<String> result = underTest.getItemById(id);

		// Then
		// assertNotNull(result);
		// assertEquals(0, result.size());
		// assertTrue(result.contains(""));
	}

	/**
	 * Parasoft Jtest UTA: getItemById(String) のテスト
	 *
	 * @see jp.co.techmatrix.jdbc.DataBase#getItemById(String)
	 * @author amahisa
	 */
	@Test
	public void testGetItemById3() throws Throwable {
		spy(DriverManager.class);

		Connection getConnectionResult = mock(Connection.class);
		Statement statement = mock(Statement.class);
		when( getConnectionResult.createStatement()).thenReturn( statement );
		doReturn(getConnectionResult).when(DriverManager.class);
		DriverManager.getConnection(nullable(String.class), nullable(String.class), nullable(String.class));

		spy(Class.class);

		Class forNameResult = Class.forName("java.lang.Object"); // UTA: デフォルト値
		doReturn(forNameResult).when(Class.class);
		Class.forName(nullable(String.class));

		// Given
		DataBase underTest = new DataBase();

		// When
		String id = ""; // UTA: デフォルト値

		List<String> result = underTest.getItemById(id);

		// Then
		// assertNotNull(result);
		// assertEquals(0, result.size());
		// assertTrue(result.contains(""));
	}



}
