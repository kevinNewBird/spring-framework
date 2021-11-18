package com.mashibing.analysis.annotationconfig.importion;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description  ColorImportSelector <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:51  2021/11/12
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class ColorImportSelector implements ImportSelector {


	/**
	 * Select and return the names of which class(es) should be imported based on
	 * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
	 *
	 * @param importingClassMetadata
	 * @return the class names, or an empty array if none
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{White.class.getName()};
	}
}
