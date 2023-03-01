package com.backend.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;



@Component
public class ExcelPOIHelper {
    
    public void writeExcel() throws IOException{
        Workbook workbook = new XSSFWorkbook();
        
        // Note that sheet name is Excel must not exceed 31 characters
        // and must not contain any of the any of the following characters:
        // 0x0000
        // 0x0003
        // colon (:)
        // backslash (\)
        // asterisk (*)
        // question mark (?)
        // forward slash (/)
        // opening square bracket ([)
        // closing square bracket (])
        Sheet sheet1 = workbook.createSheet("new sheet");
        Sheet sheet2 = workbook.createSheet("second sheet");
        String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]");
        Sheet sheet3 = workbook.createSheet(safeName);


        // Style setting.
        CellStyle headerStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);

        headerStyle.setFont(font);


        // Header setting.
        Row header = sheet1.createRow(0);
        header.setRowStyle(headerStyle);
        
        header.createCell(0).setCellValue("Name");
        header.createCell(1).setCellValue("Job");
        header.createCell(2).setCellValue("Age");

        // Body Style Setting.
        CellStyle bodyStyle = workbook.createCellStyle();
        bodyStyle.setWrapText(true);

        // Put Body values;
        Row body = sheet1.createRow(1);
        body.setRowStyle(bodyStyle);

        body.createCell(0).setCellValue("morph");
        body.createCell(1).setCellValue("Developer / Accountants");
        body.createCell(2).setCellValue("33");
        


        try (OutputStream fileOut = new FileOutputStream("workbook.xlsx")){
            workbook.write(fileOut);
            workbook.close();
        } catch (Exception e) {

            System.out.println("error");
            // TODO: handle exception
        }
    }

}
