package com.miao.test.service.impl;

import com.miao.test.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by 10048 on 2017/9/2.
 */
@Service
public class TestServiceImpl implements TestService {

    public String test() {
        return "test";
    }
}
