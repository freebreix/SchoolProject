package me.engine.Utils.Event;

import java.lang.annotation.*;

/**
 * @author Christian
 * Event Target Annotation
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventTarget {
	
	/**
	 * Priority controls which Method gets called first
	 * @return
	 */
	priority p() default priority.MIDDLE; 
	public enum priority{
		LOWEST((byte)4),
		LOW((byte)3),
		MIDDLE((byte)2),
		HIGH((byte)1),
		SYSTEM((byte)0),
		LAST((byte)5);
		byte p;
		priority(byte p) {
			this.p=p;
		}
		public byte getpri() {
			return p;
		}
	}
}
