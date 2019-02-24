package com.example.demo.bean;

import com.avatar.db.annotation.Column;
import com.avatar.db.annotation.GeneratorType;
import com.avatar.db.annotation.Table;

@Table(name = "test")
public class TestBean {

    @Column(name = "id", primaryKey = true, generatorType = GeneratorType.AUTO_INCREMENT)
    private Long id;

    @Column(name = "str_test")
    private String strTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrTest() {
        return strTest;
    }

    public void setStrTest(String strTest) {
        this.strTest = strTest;
    }
}
