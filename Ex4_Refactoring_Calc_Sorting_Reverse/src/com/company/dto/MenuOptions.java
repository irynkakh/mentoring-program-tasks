package com.company.dto;

public enum MenuOptions {
    CALCULATION(1),
    SORTING(2),
    REVERSING(3),
    EXITING(4);

    private Integer value;

    MenuOptions(Integer value) {
        this.value = value;
    }

    public Integer getNumber() {
        return value;
    }
}
