package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed;// закрытый член класса, содержащий максимальную скорость
    private String GosNomer;
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setGosNomer(String GosN) {
        GosNomer=GosN;
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public String getGosNomer(){
        return GosNomer;
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
    }
    public Auto(String firma, int speed){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
    }
}
class test1 {
    public static void main(String[] args) {
        Auto myAuto1=new Auto(); //создаем объект типа нашего класса
        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли
        System.out.print("Введите фирму: ");
        String nazv=in.next(); //считываем название из консоли !!!только 1 слово
//т.к. in.next() считывает только символы до пробела, остальные символы отправляет
//следующему оператору, связанному с консольным вводом
        myAuto1.setFirm(nazv); //задаем значение для параметра нашего класса
        System.out.print("Введите гос номер: ");
        myAuto1.setGosNomer(nazv);
        System.out.print("Введите максимальную скорость: ");
        int s=in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed()+" "+myAuto1.getGosNomer());
    }
}







