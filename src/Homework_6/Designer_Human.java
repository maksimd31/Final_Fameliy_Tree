package Homework_6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Описываем сущность вида human
 */
public class Designer_Human implements Serializable, Comparable<Designer_Human> {
    Femily_Tree femily_tree;

    //создаем поля в классе
    private String name;
    private String sex;
    private int date;

//    public List<Designer_Human> getDesigner_human() {
//        return designer_human;
//    }

    private List<Designer_Human> designer_human; //константа

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getDate() {
        return date;
    }


    private Designer_Human father; // Объектная переменная

    private Designer_Human mother; // Объектная переменная

    private List<Designer_Human> children;


    private static List<Designer_Human> humans;

    public List<Designer_Human> getHumans() {
        return humans;
    }

    public Designer_Human(List<Designer_Human> humans) {
        Designer_Human.humans = humans;
    }

    public Designer_Human(String personName) {
        this(new ArrayList<>());
    }


    /*
     * Создаем максимально описанный конструктор
     */
    public Designer_Human(String name, String sex, int date, Designer_Human father, Designer_Human mother) {
        this();
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        humans = new ArrayList<>();


    }

    /*
     * Создаем конструктор на случей отсутствия родителей.
     */
    public Designer_Human(String name, String sex, int date) {
        this();
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    /*
     * конструктор с добавлением id
     */
    public Designer_Human(int id, String name, String sex, int date) {
        this();
        this.name = name;
        this.sex = sex;
        this.date = date;
        humans = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    /**
     * Пустой конструктор
     */
    public Designer_Human() {

    }

    public Designer_Human getFather() {
        return father;
    }

    public Designer_Human getMother() {
        return mother;
    }

    public void setFather(Designer_Human father) {
        this.father = father;
    }


    public void setMother(Designer_Human mother) {
        this.mother = mother;
    }

    public List<Designer_Human> getChildren() {
        return children;
    }


    /**
     * Переопределение toString
     *
     * @return Делаем перегрузку
     */
    @Override
    public String toString() {
        return "Имя: " + getName() + " Возраст: " + getDate() + " Пол : " + getSex() + " Мать : " + mother + " " +
                " Отец : " + father;
    }


    @Override
    public int compareTo(Designer_Human o) {
        return name.compareTo(o.getName());
    }

}


