import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	/**
	 * Return a list of prime numbers of n
	 * 
	 * @param n
	 * @return
	 */
	public List<Integer> primos(int n) throws EntradaInvalida {

		if (n < 2)
			throw new EntradaInvalida("Entrada menor que 2. Entrada: " + n);

		List<Integer> list = new ArrayList<Integer>();

		return primosAux(n, list);
	}

	private static List<Integer> primosAux(int n, List<Integer> list) {

		if (n == 1)
			return list;

		boolean find = false;
		int i = 1;
		while (i < n && !find) {
			i++;
			if (n % i == 0) {
				list.add(i);
				find = true;
			}
		}

		return primosAux(n / i, list);
	}

}
