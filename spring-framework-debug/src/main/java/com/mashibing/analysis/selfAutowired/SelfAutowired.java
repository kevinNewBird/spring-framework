package com.mashibing.analysis.selfAutowired;

import java.lang.annotation.*;

/**
 * description  SelfAutowired <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:58  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SelfAutowired {

	/**
	 * Declares whether the annotated dependency is required.
	 * <p>Defaults to {@code true}.
	 */
	boolean required() default true;
}
