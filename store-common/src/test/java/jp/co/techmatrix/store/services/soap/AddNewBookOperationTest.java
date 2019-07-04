package jp.co.techmatrix.store.services.soap;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNewBookOperationTest {

	@Test
	public void testGetBook() {
		AddNewBookOperation addNew = new AddNewBookOperation();
		addNew.getBook();
	}

	@Test
	public void testSetBook() {
		AddNewBookOperation addNew = new AddNewBookOperation();
		addNew.setBook( new Book() );
	}

}
