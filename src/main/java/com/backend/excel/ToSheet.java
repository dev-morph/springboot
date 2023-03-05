package com.backend.excel;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import com.backend.dto.domain.SheetName;

public class ToSheet {
    

    public void setSheetName(SheetName sheetName, SXSSFWorkbook workbook) {
        if(sheetName.sheet instanceof String){
            workbook.setSheetName(0, sheetName.sheet);
        }else if(sheetName.sheetList != null){
            int index = 0;
            for(String sheet : sheetName.sheetList){
                workbook.setSheetName(index, sheet);
                index++;
            }
        }
    }
}
