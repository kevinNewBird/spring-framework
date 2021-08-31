package com.mashibing.analysis.selfaware;

import org.springframework.beans.factory.Aware;

/**
 * description  MyAware <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:13  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public interface MyAware extends Aware {
	void setMyAware(String name);
}
