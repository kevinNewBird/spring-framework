package com.mashibing.analysis.selfConverter;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;
import org.springframework.util.ConcurrentReferenceHashMap;

import javax.annotation.Resource;
import java.util.*;

/**
 * description  MyGenericConverter <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:30  2021/9/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyGenericConverter implements GenericConverter {


	/**
	 * Return the source and target types that this converter can convert between.
	 * <p>Each entry is a convertible source-to-target type pair.
	 * <p>For {@link ConditionalConverter conditional converters} this method may return
	 * {@code null} to indicate all source-to-target pairs should be considered.
	 */
	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		Set<ConvertiblePair> convertiblePairs = Collections.newSetFromMap(new ConcurrentReferenceHashMap<>());
		ConvertiblePair stringToArray = new ConvertiblePair(String.class, List.class);
		ConvertiblePair stringToMap = new ConvertiblePair(String.class, Map.class);
		convertiblePairs.add(stringToArray);
		convertiblePairs.add(stringToMap);
		return convertiblePairs;
	}

	/**
	 * Convert the source object to the targetType described by the {@code TypeDescriptor}.
	 *
	 * @param source     the source object to convert (may be {@code null})
	 * @param sourceType the type descriptor of the field we are converting from
	 * @param targetType the type descriptor of the field we are converting to
	 * @return the converted object
	 */
	@Override
	public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
		Resource annotation = sourceType.getAnnotation(Resource.class);
		if (annotation != null) {
			if (targetType.getType() == List.class) {
				return Arrays.asList(source.toString().split(":"));
			}
			if (targetType.getType() == Map.class) {
				Map<String, String> map = new HashMap<>();
				map.put("a", source.toString().split(":")[0]);
				map.put("b", source.toString().split(":")[1]);
				return map;
			}
		}
		return null;
	}
}
