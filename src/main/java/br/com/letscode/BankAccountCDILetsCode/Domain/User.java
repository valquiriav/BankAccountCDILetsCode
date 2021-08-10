package br.com.letscode.BankAccountCDILetsCode.Domain;

public class User {
    private Long taxNumber;
    private String name;
    private int code;

    public Long getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Long taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
