/**
 * 
 */
package jp.co.techmatrix.store.services.soap;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import jp.co.techmatrix.store.model.Author;
import jp.co.techmatrix.store.model.Book;
import jp.co.techmatrix.store.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Parasoft Jtest UTA: 次のテストクラス Cart
 *
 * @see jp.co.techmatrix.store.services.soap.Cart
 * @author amahisa
 */
public class CartTest {

	// Parasoft Jtest UTA: テスト対象オブジェクト
	@InjectMocks
	Cart underTest;

	// Parasoft Jtest UTA: Cart のフィールド em に対して生成された依存関係
	@Mock
	EntityManager em;

	// Parasoft Jtest UTA: テスト対象オブジェクトをモック化された依存関係で初期化
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Parasoft Jtest UTA: getItemById(int) のテスト
	 *
	 * @see jp.co.techmatrix.store.services.soap.Cart#getItemById(int)
	 * @author amahisa
	 */
	@Test
	public void testGetItemById() throws Throwable {
		// Given
		Book findResult = mock(Book.class);
		doReturn(findResult).when(em).find((Class) any(), nullable(Object.class));

		// When
		int id = 0; // UTA: デフォルト値
		Book result = underTest.getItemById(id);

		// Then
		// assertNotNull(result);
	}

	/**
	 * Parasoft Jtest UTA: addNewBook(Book) のテスト
	 *
	 * @see jp.co.techmatrix.store.services.soap.Cart#addNewBook(Book)
	 * @author amahisa
	 */
	@Test
	public void testAddNewBook() throws Throwable {
		// Given
		Book findResult = mock(Book.class);
		doReturn(findResult).when(em).find((Class) any(), nullable(Object.class));

		Object mergeResult = new Object(); // UTA: デフォルト値
		doReturn(mergeResult).when(em).merge((Object) any());

		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object entity = (Object) invocation.getArguments()[0];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(em).persist(nullable(Object.class));

		// When
		Book book = mockBook();
		underTest.addNewBook(book);

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

	/**
	 * Parasoft Jtest UTA: getItemById(int) のテスト
	 *
	 * @see jp.co.techmatrix.store.services.soap.Cart#getItemById(int)
	 * @author amahisa
	 */
	@Test
	public void testGetItemById2() throws Throwable {
		// Given
		Object findResult = new Object(); // UTA: デフォルト値
		doReturn(findResult).when(em).find((Class) any(), nullable(Object.class));

		// When
		int id = 0; // UTA: デフォルト値
		Book result = underTest.getItemById(id);

		// Then
		// assertNotNull(result);
	}
}