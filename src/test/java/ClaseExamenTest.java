import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {

	private ClaseExamen c = new ClaseExamen();

	// Test invalido 1
//	@Test(expected = EntradaInvalida.class)
//	public void testInvalido() throws EntradaInvalida {
//		c.primos(1);
//	}

	// Test correcto 6
	@Test
	public void testCorrecto6() throws EntradaInvalida {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(list, c.primos(6));
	}

	// Test correcto 13
	@Test
	public void testCorrecto13() throws EntradaInvalida {
		List<Integer> list = new ArrayList<Integer>();
		list.add(13);
		assertEquals(list, c.primos(13));
	}

	// Test correcto 25
	@Test
	public void testCorrecto25() throws EntradaInvalida {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		assertEquals(list, c.primos(25));
	}

}
