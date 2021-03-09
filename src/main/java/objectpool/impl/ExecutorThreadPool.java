package objectpool.impl;

import objectpool.impl.factory.IPoolableObjectFactory;
import objectpool.impl.poolable.ExecutorTask;

public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask> {
	
	public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime, IPoolableObjectFactory<ExecutorTask> poolableObjectFactory) {
		super(minInstances, maxInstances, waitTime, poolableObjectFactory);
	}

	@Override
	public void relaceOBject(ExecutorTask pooledObject) {
		
	}

}
