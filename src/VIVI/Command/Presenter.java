package VIVI.Command;

public class Presenter {
    ICommand AddСhildrenCommand;
    ICommand AddHumanCommand;
    ICommand AddParentsCommand;
    ICommand SearchCommand;
    ICommand ShowTreeAllCommand;
    ICommand SortingCommand;

    public Presenter(ICommand addCildrenCommand, ICommand addHumanCommand, ICommand addParentsCommand, ICommand searchCommand, ICommand showTreeAllCommand, ICommand sortingCommand) {
        this.AddСhildrenCommand = addCildrenCommand;
        this.AddHumanCommand = addHumanCommand;
        this.AddParentsCommand = addParentsCommand;
        this.SearchCommand = searchCommand;
        this.ShowTreeAllCommand = showTreeAllCommand;
        this.SortingCommand = sortingCommand;
    }

    public void AddСhildrenCommandRecord() {
        AddСhildrenCommand.execute();
    }

    public void AddHumanCommandRecord() {
        AddHumanCommand.execute();
    }

    public void AddParentsCommandRecord() {
        AddParentsCommand.execute();
    }

    public void SearchCommandRecord() {
        SearchCommand.execute();
    }

    public void ShowTreeAllCommandRecord() {
        ShowTreeAllCommand.execute();
    }

    public void SortingCommand() {
        SortingCommand.execute();
    }
}
