package com.csbr.cloud.canal.client.abstracts.option.table;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.csbr.cloud.canal.client.abstracts.option.AbstractDBOption;

/**
 * 删除表操作
 */
public abstract class DropTableOption extends AbstractDBOption {
	
	/**
	 * 删除表操作
	 */
	@Override
	protected void setEventType() {
		this.eventType = CanalEntry.EventType.ERASE;
	}
}
