/**
 * 
 */
package jp.co.techmatrix.servlet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Parasoft Jtest UTA: 次のテストクラス ComplexClass
 *
 * @see jp.co.techmatrix.servlet.ComplexClass
 * @author amahisa
 */
public class ComplexClassTest {

	/**
	 * Parasoft Jtest UTA: getAutnMode(String) のテスト
	 *
	 * @see jp.co.techmatrix.servlet.ComplexClass#getAutnMode(String)
	 * @author amahisa
	 */
	@Test
	public void testGetAutnMode() throws Throwable {
		// UTA: 1 つまたはそれ以上の必要な値が自動でセットされませんでした。
		// 下の必要な修正に関する情報を参照し、不足している値を手動で更新してください。
		// 
		// コードをカバーするには、次の変更を行います。
		//  - '"".equals(java.lang.Object)' メソッドの戻り値を変更する必要があります (たとえば 'false' などに)
		//  - 'userID.length()'  メソッドの 最初の 呼び出しの戻り値を変更する必要があります (たとえば '5' などに)
		//  - 'userID.length()'  メソッドの 2 番目の 呼び出しの戻り値を変更する必要があります (たとえば '1' などに)
		//  - 'userID.charAt(int)'  メソッドの 最初の 呼び出しの戻り値を変更する必要があります (たとえば '@' などに)
		//  - 'userID.charAt(int)'  メソッドの 2 番目の 呼び出しの戻り値を変更する必要があります (たとえば '\u0000' などに)

		// Given
		ComplexClass underTest = new ComplexClass();

		// When
		String userID = ""; // UTA: デフォルト値
		String result = underTest.getAutnMode(userID);

		// Then
		// assertEquals("", result);
	}

	/**
	 * Parasoft Jtest UTA: 次からテストを複製
	 * jp.co.techmatrix.servlet.ComplexClassTest#testGetAutnMode()
	 * Hint: コードをカバーするには、""".equals(userID)" メソッドが 'false' を返す必要があります。
	 *
	 * @see jp.co.techmatrix.servlet.ComplexClass#getAutnMode(String)
	 * @author amahisa
	 */
	@Test
	public void testGetAutnMode2() throws Throwable {
		// UTA: 1 つまたはそれ以上の必要な値が自動でセットされませんでした。
		// 下の必要な修正に関する情報を参照し、不足している値を手動で更新してください。
		//
		// コードをカバーするには、次の変更を行います。
		//  - '"".equals(java.lang.Object)' メソッドの戻り値を変更する必要があります (たとえば 'false' などに)
		//  - 'userID.length()'  メソッドの 最初の 呼び出しの戻り値を変更する必要があります (たとえば '5' などに)
		//  - 'userID.length()'  メソッドの 2 番目の 呼び出しの戻り値を変更する必要があります (たとえば '1' などに)
		//  - 'userID.charAt(int)'  メソッドの 最初の 呼び出しの戻り値を変更する必要があります (たとえば '@' などに)
		//  - 'userID.charAt(int)'  メソッドの 2 番目の 呼び出しの戻り値を変更する必要があります (たとえば '\u0000' などに)

		// Given
		ComplexClass underTest = new ComplexClass();

		// When
		String userID = "@@@@@"; // UTA: デフォルト値
		String result = underTest.getAutnMode(userID);

		// Then
		// assertEquals("", result);
	}
}