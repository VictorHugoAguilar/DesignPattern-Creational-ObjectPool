package objectpool.impl.factory;

import objectpool.impl.poolable.IPooledObject;

public interface IPoolableObjectFactory<T extends IPooledObject> {
	public T createNew();
}
