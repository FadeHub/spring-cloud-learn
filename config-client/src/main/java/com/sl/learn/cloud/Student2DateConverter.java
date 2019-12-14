package com.sl.learn.cloud;

import com.github.crab2died.converter.WriteConvertible;
import com.github.crab2died.utils.DateUtils;

import java.util.Date;

/**
 * @author shuliangzhao
 * @Title: Student2DateConverter
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/12 19:32
 */
public class Student2DateConverter implements WriteConvertible {
    @Override
    public Object execWrite(Object object) {
        Date date = (Date) object;
        return DateUtils.date2Str(date, DateUtils.DATE_FORMAT_MSEC_T_Z);
    }
}
