package VIVI.Command;

import VIVI.AddParents.AddParentsScanner;
import VIVI.AddParents.IAddParents;

public class addParentsCommand implements ICommand{
    @Override
    public void execute() {
        IAddParents iAddParents = new AddParentsScanner();
        iAddParents.addParents();
    }
}
