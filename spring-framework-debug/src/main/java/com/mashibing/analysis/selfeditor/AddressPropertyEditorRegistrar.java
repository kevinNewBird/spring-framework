package com.mashibing.analysis.selfeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.validation.DataBinder;

import java.beans.PropertyEditor;

/**
 * description  AddresPropertyEditorRegistrar <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:43  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressPropertyEditor());
	}
}
