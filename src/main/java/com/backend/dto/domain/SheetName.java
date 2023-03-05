package com.backend.dto.domain;

import java.util.List;

public class SheetName {
    public String sheet;
    public List<String> sheetList;

    public SheetName(String sheet) {
        this.sheet = sheet;
    }

    public SheetName(List<String> sheetList) {
        this.sheetList = sheetList;
    }
}
