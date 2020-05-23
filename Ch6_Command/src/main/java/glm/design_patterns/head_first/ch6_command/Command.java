package glm.design_patterns.head_first.ch6_command;

public interface Command {
    public void execute();
    public void undo();
}