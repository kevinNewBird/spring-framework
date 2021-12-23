package com.mashibing.analysis.tx.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * description  GlassDao <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:44  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class GlassDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

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
	public int getPrice(int id) {
		String sql = "select price from glass where id=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, id);
	}

	/**
	 * 减库存，减去某本书的库存
	 *
	 * @param id
	 */
	public void updateStock(int id) {
		String sql = "update glass_stock set stock=stock-1 where id=?";
		jdbcTemplate.update(sql, id);
//        for (int i = 1 ;i>=0 ;i--)
//            System.out.println(10/i);
	}
}
