package objectPoolGeneric;

import java.util.HashMap;
import java.util.Iterator;

public abstract class ObjectPool<T> {

	private long expirationTime;
	private HashMap<T, Long> locked, unlocked;

	public ObjectPool() {
		expirationTime = 60000; // 60 segundos
		locked = new HashMap<T, Long>();
		unlocked = new HashMap<T, Long>();
	}

	public synchronized T acquire() {
		long now = System.currentTimeMillis();
		T t;
		if (unlocked.size() > 0) {
			Iterator<T> it = unlocked.keySet().iterator();
			while (it.hasNext()) {
				t = (T) it.next();
				// Verifcamos tiempo de expiracion
				if ((now - unlocked.get(t)) > expirationTime) {
					// Expiró, removemos
					unlocked.remove(t);
					expire(t); // Delegamos expiracion a una subclase
					t = null;
				} else {
					if (validate(t)) {
						unlocked.remove(t);
						locked.put(t, now);
						return (t);
					} else {
						// Si falla vaidacion, removemos y expiramos
						unlocked.remove(t);
						expire(t);
						t = null;
					}
				}
			}
		}
		// Si llega aqui es que no hay disponible y creamos uno.
		t = create();
		locked.put(t, now);
		return (t);
	}

	public synchronized void release(T t) {
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}

	// Implementacaión especifica por una Subclase
	@SuppressWarnings("hiding")
	protected abstract <T> T create();

	@SuppressWarnings("hiding")
	public abstract <T> boolean validate(T o);

	@SuppressWarnings("hiding")
	public abstract <T> void expire(T o);

}
