import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test 
	public void testFilter() {
    String[] str = {"abc","abcd","edcba","a"};
    List<String> lst = Arrays.asList(str);
    String[] str2 ={"abcd","edcba"};
    List<String> exp = Arrays.asList(str2);
    assertEquals(exp, ListExamples.filter(lst,new LongerThan3()));
	}
    @Test 
	public void testFilterFixed() {
    String[] str = {"abc","abcd","edcba","a"};
    List<String> lst = Arrays.asList(str);
    String[] str2 ={"abcd","edcba"};
    List<String> exp = Arrays.asList(str2);
    assertEquals(exp, ListExamples.filterFixed(lst,new LongerThan3()));
	}
}
