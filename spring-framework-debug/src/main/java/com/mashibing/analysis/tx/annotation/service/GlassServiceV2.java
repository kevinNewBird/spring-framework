package com.mashibing.analysis.tx.annotation.service;

import com.mashibing.analysis.tx.annotation.dao.GlassDaoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description  GlassService <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:44  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Service
public class GlassServiceV2 {

	@Autowired
	GlassDaoV2 glassDaoV2;

	/**
	 * 结账：传入哪个用户买了哪本书
	 *
	 * @param username
	 * @param id
	 */
	public void checkout(String username, int id) {

		try {
			glassDaoV2.updateStock(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
//        for (int i = 1 ;i>=0 ;i--)
//            System.out.println(10/i);
//        int price = bookDao.getPrice(id);
//        bookDao.updateBalance(username,price);
	}
}
