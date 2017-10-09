package com.box.service;

import com.box.po.Test;
import com.github.pagehelper.PageInfo;

public interface TestService {

	PageInfo<Test> insert(Integer id) throws Exception;
}
