package kira.task;

public class ToDo extends Task {
    
    public ToDo(String data) {
        super(data);
    }

    @Override
    public String saveFormat() {
        return "TODO\",\"" + super.saveFormat();
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
