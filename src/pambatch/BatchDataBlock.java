package pambatch;

import PamguardMVC.PamDataBlock;
import PamguardMVC.PamObserver;

public class BatchDataBlock extends PamDataBlock<BatchDataUnit> {

	public BatchDataBlock(BatchProcess parentProcess) {
		super(BatchDataUnit.class, "Batch Jobs", parentProcess, 0);
	}

	@Override
	public void clearAll() {
//		super.clearAll();
	}

	@Override
	protected int removeOldUnitsT(long currentTimeMS) {
		return 0;
	}

	@Override
	protected int removeOldUnitsS(long mastrClockSample) {
		return 0;
	}

	@Override
	public void addObserver(PamObserver o, boolean reThread) {
		super.addObserver(o, reThread);
	}

	@Override
	public void addObserver(PamObserver o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

}
