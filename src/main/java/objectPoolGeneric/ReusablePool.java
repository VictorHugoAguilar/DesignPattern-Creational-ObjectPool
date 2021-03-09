package objectPoolGeneric;

@SuppressWarnings("rawtypes")
public class ReusablePool extends ObjectPool {

	private static ReusablePool instance = new ReusablePool();

	private ReusablePool() {
		// Parametros de inicializacion
		System.out.println("Iniciando pool");
	}

	public static ReusablePool getInstance() {
		return instance;
	}

	protected Reusable create() {
		// Logica para crear objetos Reusable
		return new Reusable();
	}

	public boolean validate(Reusable o) {
		// Validaciones especificas sobre Reusable
		return true;
	}

	public void expire(Reusable o) {
		// Destruir el objeto reusable
		// Ej: cerrar si fuera una conexion
	}

	@Override
	public boolean validate(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void expire(Object o) {
		// TODO Auto-generated method stub

	}
}