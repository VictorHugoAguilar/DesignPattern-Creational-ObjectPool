package objectPoolGeneric;

public class Principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Obtenemos el Reusable del pool
		Reusable reusable = (Reusable) ReusablePool.getInstance().acquire();

		// Se usa
		reusable.doSomeWork();

		// Se libera
		ReusablePool.getInstance().release(reusable);

	}
}