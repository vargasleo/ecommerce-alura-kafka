package br.com.alura.ecommerce;

import java.math.BigDecimal;
import java.util.UUID;

public class User {

    private final String id;

    public User(String id) {
        this.id = id;
    }

    public String getReportPath() {
        return "target/" + id + "-report.txt";
    }

    public String getId() {
        return id;
    }
}
