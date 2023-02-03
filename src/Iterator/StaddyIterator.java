package Iterator;

import Homework_6.Designer_Human;

import java.util.Iterator;
import java.util.List;

public class StaddyIterator implements Iterator<Designer_Human> {

    private int index; //счетчик
    private final List<Designer_Human> humans;

    public StaddyIterator(List<Designer_Human> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return index < humans.size(); //достичь конца коллекции
    }

    @Override
    public Designer_Human next() {
        return humans.get(index++); //0 1 2 3 ...
    }

    //xnj nj



}

