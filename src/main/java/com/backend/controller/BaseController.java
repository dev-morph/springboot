package com.backend.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.excel.ExcelPOIHelper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class BaseController {

    private final ExcelPOIHelper excelService;

    @RequestMapping("/test")
    public String createExcelFile(){

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
