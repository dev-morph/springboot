package com.backend.dto.domain;

public class SheetName<T> {
    
    private final T sheetName;

    public SheetName(T sheetName){
        this.sheetName = sheetName;
    }
}
