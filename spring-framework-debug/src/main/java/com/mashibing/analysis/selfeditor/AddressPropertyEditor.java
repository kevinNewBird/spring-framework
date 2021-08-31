package com.mashibing.analysis.selfeditor;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * description  AddressPropertyEditor <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:40  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (!StringUtils.hasText(text)) {
			setValue(null);
			return;
		}
		String[] source = text.split("_");
		Address address = new Address();
		address.setProvince(source[0]);
		address.setCity(source[1]);
		address.setTown(source[2]);
		setValue(address);
	}
}
