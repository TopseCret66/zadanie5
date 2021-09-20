package com.company;


import java.text.MessageFormat;

public class Сотрудник {

    private String ФИО;
    private String должность;
    private String email;
    private String телефон;
    private int зарплата;
    private int возраст;

    public Сотрудник(String ФИО, String должность, String email, String телефон, int зарплата, int возраст) {

        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public String сотрудникInfo() {
        String pattern = "ФИО: {0}, должность: {1}, email: {2}, телефон: {3}, зарплата: {4}, возраст: {5}";
        return MessageFormat.format(pattern, this.ФИО, this.должность, this.email, this.телефон, this.зарплата, this.возраст);
    }

    public String getФИО() {
        return ФИО;
    }

    public void setФИО(String ФИО) {
        this.ФИО = ФИО;
    }

   public String getДолжность() {
        return должность;
    }

   public void setДолжность(String должность) {
        this.должность = должность;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getТелефон() {
        return телефон;
    }

    public void setТелефон(String телефон) {
        this.телефон = телефон;
    }

    public int getЗарплата() {
        return зарплата;
    }

    public void setЗарплата(int зарплата) {
        this.зарплата = зарплата;
    }

    public int getВозраст() {
        return возраст;
    }

    public void setВозраст(int возраст) {
        this.возраст = возраст;
    }


}


