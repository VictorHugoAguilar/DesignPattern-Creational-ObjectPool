package objectpool.impl.factory;

import objectpool.impl.poolable.ExecutorTask;

public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask> {

	@Override
	public ExecutorTask createNew() {
		return new ExecutorTask();
	}

}
