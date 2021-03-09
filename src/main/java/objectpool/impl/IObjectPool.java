package objectpool.impl;

import objectpool.impl.poolable.IPooledObject;

public interface IObjectPool<T extends IPooledObject> {

	public T getObject() throws PoolException;
	public void relaceOBject(T pooledObject);
	
}
