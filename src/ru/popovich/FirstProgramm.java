package ru.popovich;

import java.util.Date;

// public - модификатор доступа
// private -
// protected -

public class FirstProgramm {

    // Поля - свойства класса
    // Методы класса

    // Статическое поле - статическое свойство
    static String s = "MainClass";

    // Объявление поля Date
    private Date date;

    // Метод получения даты
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public static void main(String[] args) {
        System.out.println("Первая программа:");

        FirstProgramm fp = new FirstProgramm();
        fp.setDate(new Date());

        System.out.println(fp.getDate());
    }

}
