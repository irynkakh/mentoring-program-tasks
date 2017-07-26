package com.company.dto;

public enum Operations {
    ADDITION('+'),
    SUBSTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private Character operation;

    Operations(Character operation) {
        this.operation = operation;
    }

    Character getOperations() {
        return operation;
    }


}
