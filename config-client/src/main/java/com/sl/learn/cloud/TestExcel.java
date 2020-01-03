package com.sl.learn.cloud;

import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import com.github.crab2died.sheet.wrapper.NoTemplateSheetWrapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.github.crab2died.utils.Utils.getCellValue;

/**
 * @author shuliangzhao
 * @Title: TestExcel
 * @ProjectName spring-cloud-learn
 * @Description: TODO
 * @date 2019/12/12 19:29
 */
public class TestExcel {

    public static void main(String[] args) throws Exception {
        /*List<NoTemplateSheetWrapper> sheets = new ArrayList<>();

        for (int s = 0; s < 3; s++) {
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                list.add(new Student(10000L + i, "学生" + i, new Date(), 201, false));
            }
            sheets.add(new NoTemplateSheetWrapper(list, Student.class, true, "sheet_" + s));
        }
        ExcelUtils.getInstance().noTemplateSheet2Excel(sheets, "D:\\aplus\\EE.xlsx");*/
        megreSheet();
    }

    public static void megreSheet() throws Exception {
        Workbook megreWorkbook = null;
        try {
            megreWorkbook = new XSSFWorkbook();
            int k = 0;
            //循环读取每个excel文件
            List<Workbook> list = new ArrayList<>();
            InputStream inputStream = new FileInputStream(new File("D:\\aplus\\shuqian\\megre\\额度明细报表.xlsx"));
            Workbook workbook = new XSSFWorkbook(inputStream);
            list.add(workbook);
            InputStream inputStream1 = new FileInputStream(new File("D:\\aplus\\shuqian\\megre\\额度明细报表1.xlsx"));
            Workbook workbook1 = new XSSFWorkbook(inputStream1);
            list.add(workbook1);
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0;i < numberOfSheets; i++) {
                Sheet sheet = megreWorkbook.createSheet(workbook.getSheetName(i));
                for (Workbook book:list) {
                    Sheet sheetAt = book.getSheetAt(i);
                    for (int j = 0; j < sheetAt.getLastRowNum() + 1;j++) {
                        // 只针对第一个excel文件才读取表头，其余文件将不再读取表头
                        if (k > 0 && j ==0) {
                            continue;
                        }
                        Row megreRow = sheet.createRow(k);
                        Row row = sheetAt.getRow(j);
                        //读取
                        for (int h = 0;h < row.getPhysicalNumberOfCells(); h++) {
                            Cell cell = row.getCell(h);
                            megreRow.createCell(h).setCellValue(getCellValue(cell));
                        }
                        k++;
                    }
                }
                k = 0;
            }
            OutputStream outputStream = new FileOutputStream("D:\\aplus\\shuqian\\megre\\额度明细报表Ex.xlsx");
            megreWorkbook.write(outputStream);
        }finally {
           if (megreWorkbook != null) {
               megreWorkbook.close();
           }
        }
    }
}
