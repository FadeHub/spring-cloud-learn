package com.sl.learn.cloud;

import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import com.github.crab2died.sheet.wrapper.NoTemplateSheetWrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shuliangzhao
 * @Title: TestExcel
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/12 19:29
 */
public class TestExcel {

    public static void main(String[] args) throws Excel4JException, IOException {
        List<NoTemplateSheetWrapper> sheets = new ArrayList<>();

        for (int s = 0; s < 3; s++) {
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                list.add(new Student(10000L + i, "学生" + i, new Date(), 201, false));
            }
            sheets.add(new NoTemplateSheetWrapper(list, Student.class, true, "sheet_" + s));
        }
        ExcelUtils.getInstance().noTemplateSheet2Excel(sheets, "D:\\aplus\\EE.xlsx");
    }
}
