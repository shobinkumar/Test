package com.example.Test.enums;

public enum DeptEnum {
    IT("Information Technology"),
    CS("Computer Science"),
    ECE("Electronics");
     String dept;

    private DeptEnum(String dept) {
        this.dept = dept;

    }

    public String getDept() {
        return dept;
    }
}
