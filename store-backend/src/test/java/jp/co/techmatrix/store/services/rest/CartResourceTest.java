/**
 * 
 */
package jp.co.techmatrix.store.services.rest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import jp.co.techmatrix.store.model.Author;
import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.model.Publisher;
import jp.co.techmatrix.store.services.AbstractCart;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Parasoft Jtest UTA: 次のテストクラス CartResource
 *
 * @see jp.co.techmatrix.store.services.rest.CartResource
 * @author amahisa
 */
public class CartResourceTest {

	/**
	 * Parasoft Jtest UTA: addNewBook(Book) のテスト
	 *
	 * @see jp.co.techmatrix.store.services.rest.CartResource#addNewBook(Book)
	 * @author amahisa
	 */
	@Test
	public void testAddNewBook() throws Throwable {
		// Given
		CartResource underTest = new CartResource();
		EntityManager emValue = mockEntityManager();
		Field emField = FieldUtils.getField(AbstractCart.class, "em", true);
		FieldUtils.writeField(emField, underTest, emValue);

		// When
		Book book = mockBook();
		underTest.addNewBook(book);

	}

	/**
	 * Parasoft Jtest UTA: EntityManager のモックを生成・設定するためのヘルパー メソッド
	 */
	private static EntityManager mockEntityManager() throws Throwable {
		EntityManager emValue = mock(EntityManager.class);
		Object findResult = new Object(); // UTA: デフォルト値
		doReturn(findResult).when(emValue).find((Class) any(), nullable(Object.class));

		Object mergeResult = new Object(); // UTA: デフォルト値
		doReturn(mergeResult).when(emValue).merge((Object) any());

		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object entity = (Object) invocation.getArguments()[0];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(emValue).persist(nullable(Object.class));
		return emValue;
	}

	/**
	 * Parasoft Jtest UTA: Publisher のモックを生成・設定するためのヘルパー メソッド
	 */
	private static Publisher mockPublisher() throws Throwable {
		Publisher getPublisherResult = mock(Publisher.class);
		int getIdResult = 0; // UTA: デフォルト値
		when(getPublisherResult.getId()).thenReturn(getIdResult);
		return getPublisherResult;
	}

	/**
	 * Parasoft Jtest UTA: Book のモックを生成・設定するためのヘルパー メソッド
	 */
	private static Book mockBook() throws Throwable {
		Book book = mock(Book.class);
		List<Author> getAuthorsResult = new ArrayList<Author>(); // UTA: デフォルト値
		Author item = mock(Author.class);
		getAuthorsResult.add(item);
		doReturn(getAuthorsResult).when(book).getAuthors();

		Publisher getPublisherResult = mockPublisher();
		when(book.getPublisher()).thenReturn(getPublisherResult);
		return book;
	}
}