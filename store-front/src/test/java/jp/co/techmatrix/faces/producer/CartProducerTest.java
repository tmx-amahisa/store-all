/**
 * 
 */
package jp.co.techmatrix.faces.producer;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.co.techmatrix.store.services.soap.Cart;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Parasoft Jtest UTA: 次のテストクラス CartProducer
 *
 * @see jp.co.techmatrix.faces.producer.CartProducer
 * @author amahisa
 */
public class CartProducerTest {

	/**
	 * Parasoft Jtest UTA: getProxy() のテスト
	 *
	 * @see jp.co.techmatrix.faces.producer.CartProducer#getProxy()
	 * @author amahisa
	 */
	@Test
	public void testGetProxy() throws Throwable {
		// Given
		CartProducer underTest = new CartProducer();
		Logger loggerValue = mockLogger();
		setPrivateField(underTest, CartProducer.class, "logger", loggerValue);

		// When
		Cart result = underTest.getProxy();

		// Then
		// assertNotNull(result);
	}

	/**
	 * Parasoft Jtest UTA: Logger のモックを生成・設定するためのヘルパー メソッド
	 */
	private static Logger mockLogger() throws Throwable {
		Logger loggerValue = mock(Logger.class);
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				String arg0 = (String) invocation.getArguments()[0];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(loggerValue).info(nullable(String.class));

		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Level arg0 = (Level) invocation.getArguments()[0];
				String arg1 = (String) invocation.getArguments()[1];
				Object arg2 = (Object) invocation.getArguments()[2];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(loggerValue).log(nullable(Level.class), nullable(String.class), nullable(Object.class));

		String toStringResult = ""; // UTA: デフォルト値
		when(loggerValue.toString()).thenReturn(toStringResult);
		return loggerValue;
	}

	/**
	 * Parasoft Jtest UTA: private フィールド logger を設定するヘルパー メソッド
	 */
	private static <T> void setPrivateField(Object object, Class<?> fieldClass, String fieldName, T value) {
		try {
			Field field = fieldClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);
		} catch (NoSuchFieldException e) {
			throw (AssertionError) new AssertionError("No such field found").initCause(e);
		} catch (IllegalAccessException e) {
			throw (AssertionError) new AssertionError("Unable to access the specified private field").initCause(e);
		} catch (SecurityException e) {
			throw (AssertionError) new AssertionError(
					"There was a security exception when attempting to access a private field").initCause(e);
		}
	}

	// Parasoft Jtest UTA: テスト対象オブジェクト
	@InjectMocks
	CartProducer underTest;

	// Parasoft Jtest UTA: CartProducer のフィールド logger に対して生成された依存関係
	@Mock
	Logger logger;

	// Parasoft Jtest UTA: テスト対象オブジェクトをモック化された依存関係で初期化
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Parasoft Jtest UTA: getProxy() のテスト
	 *
	 * @see jp.co.techmatrix.faces.producer.CartProducer#getProxy()
	 * @author amahisa
	 */
	@Test
	public void testGetProxy2() throws Throwable {
		// Given
		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				String arg0 = (String) invocation.getArguments()[0];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(logger).info(nullable(String.class));

		doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Level arg0 = (Level) invocation.getArguments()[0];
				String arg1 = (String) invocation.getArguments()[1];
				Object arg2 = (Object) invocation.getArguments()[2];
				// UTA: 自動生成された answer メソッド
				return null;
			}
		}).when(logger).log(nullable(Level.class), nullable(String.class), nullable(Object.class));

		String toStringResult = ""; // UTA: デフォルト値
		when(logger.toString()).thenReturn(toStringResult);

		// When
		Cart result = underTest.getProxy();

		// Then
		// assertNotNull(result);
	}
}