package com.backend.dto.domain;

import java.util.List;
import java.util.Map;

public class TableTitle {
    public String title;
    public List<String> titleList;
    public Map<String, List<String>> titleMap;

    public TableTitle(String title) {
        this.title = title;
    }

    public TableTitle(List<String> titleList) {
        this.titleList = titleList;
    }

    public TableTitle(Map<String, List<String>> titleMap) {
        this.titleMap = titleMap;
    }
}
