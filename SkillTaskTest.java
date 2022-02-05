import static org.junit.Assert.*;
import org.junit.*;

public class SkillTaskTest {
	
	@Test
	public void subtractTest() {
		assertEquals(0, SkillTask.subtract(1,2));
	}
}