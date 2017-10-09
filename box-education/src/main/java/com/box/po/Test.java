package com.box.po;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test")
public class Test {
	/**
	 * id
	 */
	@Id
	private Integer id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 获取id
	 *
	 * @return id - id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置id
	 *
	 * @param id
	 *            id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取用户名
	 *
	 * @return name - 用户名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置用户名
	 *
	 * @param name
	 *            用户名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取手机号
	 *
	 * @return phone - 手机号
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置手机号
	 *
	 * @param phone
	 *            手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}