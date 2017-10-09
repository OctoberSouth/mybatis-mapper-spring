package com.box.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.box.dao.TestMapper;
import com.box.po.Test;
import com.box.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(value = "testService")
public class TestServiceImpl implements TestService {

	@Resource(name = "testMapper")
	TestMapper testMapper;

	@Override
	public PageInfo<Test> insert(Integer id) throws Exception {
		PageHelper.startPage(1, 10);
		List<Test> list = this.testMapper.selectAll();
		PageInfo<Test> page = new PageInfo<Test>(list);
		this.testMapper.insert(new Test());
		return page;
	}

}
