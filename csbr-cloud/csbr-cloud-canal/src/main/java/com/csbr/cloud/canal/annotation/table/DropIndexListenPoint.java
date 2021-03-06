package com.csbr.cloud.canal.annotation.table;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.csbr.cloud.canal.annotation.ListenPoint;
import org.springframework.core.annotation.AliasFor;
import java.lang.annotation.*;

/**
 * 刪除索引操作
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ListenPoint(eventType = CanalEntry.EventType.DINDEX)
public @interface DropIndexListenPoint {
	/**
	 * canal 指令
	 * default for all
	 */
	@AliasFor(annotation = ListenPoint.class)
	String destination() default "";
	
	/**
	 * 数据库实例
	 */
	@AliasFor(annotation = ListenPoint.class)
	String[] schema() default {};
	
	/**
	 * 监听的表
	 * default for all
	 */
	@AliasFor(annotation = ListenPoint.class)
	String[] table() default {};
}
