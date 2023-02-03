package VIVI.Sort;

import Homework_7.Designer_Human;
import Homework_7.Femily_Tree;

import java.util.Comparator;

public class SortLamdaByName implements ISort{
    Designer_Human designer_human;
    Femily_Tree femily_tree;

    @Override
    public void sort() {
//        Collections.sort(Designer_Human, ((o1, o2) -> o1.getName().compareTo((o2.getName()))));
        designer_human.getHumans().sort((Comparator.comparing(Designer_Human::getName)));
        femily_tree.forEach(System.out::println);
    }
}
