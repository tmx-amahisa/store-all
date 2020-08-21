/**
 * 
 */
package jp.co.techmatrix.servlet;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

/**
 * Parasoft Jtest UTA: 次のテストクラス Personal
 *
 * @see jp.co.techmatrix.servlet.Personal
 * @author amahisa
 */
public class PersonalTest {

	/**
	 * Parasoft Jtest UTA: generateCustomer() のテスト
	 *
	 * @see jp.co.techmatrix.servlet.Personal#generateCustomer()
	 * @author amahisa
	 */
	@Test
	public void testGenerateCustomer() throws Throwable {
		// UTA: 1 つまたはそれ以上の必要な値が自動でセットされませんでした。
		// 下の必要な修正に関する情報を参照し、不足している値を手動で更新してください。
		// 
		// コードをカバーするには、次の変更を行います。
		//  - 'this.customerList.isEmpty()' メソッドの戻り値を変更する必要があります (たとえば 'false' などに)
		//  - 'this.customerList.size()' メソッドの戻り値を変更する必要があります (たとえば '1' などに)
		//  - 'this.hashMap.get(java.lang.Object).intValue()' メソッドの戻り値を変更する必要があります (たとえば '0' などに)
		//  - '"M".equals(java.lang.Object)' メソッドの戻り値を変更する必要があります (たとえば 'false' などに)

		// Given
		Personal underTest = new Personal();
		List<String> customerListValue2 = new ArrayList<String>(); // UTA: デフォルト値
		String item = ""; // UTA: デフォルト値
		customerListValue2.add(item);
		Whitebox.setInternalState(underTest, "customerList", customerListValue2);

		// When
		underTest.generateCustomer();

	}
}