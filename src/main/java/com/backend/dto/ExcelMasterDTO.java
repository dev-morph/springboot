package com.backend.dto;

import com.backend.dto.domain.SheetName;
import com.backend.dto.domain.TableTitle;

import com.backend.dto.domain.DataList;

public class ExcelMasterDTO {
    public String fileName;
    public List<SheetName> sheetName;  // 제목1 // [제목1, 제목2, 제목3]
    public List<TableTitle> tableTitle;
    public List<List<String>> headerInfo;
    public List<List<List<Map<String, Object>>>> dataList;
}
