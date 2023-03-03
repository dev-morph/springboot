package com.backend.dto;

import com.backend.dto.domain.SheetName;

public class ExcelMasterDTO<T> {
    public String fileName;
    public SheetName<T> sheetName;
    public String tableTitle;
    public String headerInfo;
    public String dataList;
}
