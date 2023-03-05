package com.backend.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dto.ExcelMasterDTO;
import com.backend.excel.ExcelPOIHelper;
import com.backend.excel.ExcelUtil;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class BaseController {

    private final ExcelPOIHelper excelService;
    private final ExcelUtil excelUtil;

    @RequestMapping("/create")
    public String createExcelFile(ExcelMasterDTO datas){

        try {
            /*
             * TODO 
             * 1. DB에서 데이터를 받아온다.
             * 2. 받아온 데이터를 정해진 형식으로 formatting 한다.
             *   2-1.   fileName: String,
             *          sheetName: List<String>,
             *          tableTitle: List<String>.
             *          headerList: List<List<String>>,
             *          dataList: List<List<Map<String: String>>>,
             *          headerKey?: List<<List<String>>>
             *  3. workBook, sheet, row, cell 순으로 만든다.
             */
            excelUtil.makeExcelWithDatas(datas);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Success";
    }

    @RequestMapping("/read")
    public String ReadExcelFile(){

        try {
            excelService.writeExcel();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Success";
    }
    @RequestMapping("/test2")
    public String test2(){

        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() -1) + "temp.xlsx";

        System.out.println(fileLocation);
        return path;
    }
    
}
