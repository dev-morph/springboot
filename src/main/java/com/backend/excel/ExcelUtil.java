package com.backend.excel;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Component;

import com.backend.dto.ExcelMasterDTO;
import com.fasterxml.jackson.databind.node.BooleanNode;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ExcelUtil {

    private final ToWorkbook toWorkbook;
    
    public SXSSFWorkbook makeExcelWithDatas(ExcelMasterDTO excelMasterDTO){
        /*
         * ## parameter로는 하나의 object DTO를 받는다. 
         * 1. workbook 만들고,
         * 2. sheet 생성하고,
         * 3. title, header, content 순으로 넣어줘야 한다.
         */
        SXSSFWorkbook workbook = new SXSSFWorkbook();
        
        
        return workbook;
    };
}
