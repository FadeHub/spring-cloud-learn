package com.sl.learn.cloud;

import com.github.crab2died.converter.ReadConvertible;

/**
 * @author shuliangzhao
 * @Title: Student2ExpelConverter
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/12 19:31
 */
public class Student2ExpelConverter implements ReadConvertible {
    @Override
    public Object execRead(String object) {
        return object.equals("是");
    }
}
