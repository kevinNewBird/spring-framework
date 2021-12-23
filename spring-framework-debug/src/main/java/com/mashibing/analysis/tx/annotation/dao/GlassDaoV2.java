package com.mashibing.analysis.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * description  GlassDao <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:44  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Repository
public class GlassDaoV2 {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 减去某个用户的余额
	 *
	 * @param userName
	 * @param price
	 */
	public void updateBalance(String userName, int price) {
		String sql = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql, price, userName);
	}

	/**
	 * 按照图书的id来获取图书的价格
	 *
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public int getPrice(int id) {
		String sql = "select price from glass where id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, id);
	}

	/**
	 * 减库存，减去某本书的库存
	 *
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateStock(int id) {
		String sql = "update glass_stock set stock=stock-1 where id=?";
		jdbcTemplate.update(sql, id);
//        for (int i = 1 ;i>=0 ;i--)
//            System.out.println(10/i);
	}
}
