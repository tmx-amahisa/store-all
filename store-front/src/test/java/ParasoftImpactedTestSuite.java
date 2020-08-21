import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ParasoftImpactedTestSuiteRunner.class)
@SuiteClasses({ jp.co.techmatrix.faces.bean.CartViewTest.class })
@SuiteDescription("store-front から実行された Parasoft CBT テスト")
public class ParasoftImpactedTestSuite {
	public static Map<String, Set<String>> getMethods() {
		return new HashMap<String, Set<String>>() {
			{
				put("jp.co.techmatrix.faces.bean.CartViewTest",
						new TreeSet<String>(Arrays.asList(new String[] { "testShopping" })));
			}
		};
	}
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SuiteDescription {
	String value();
}