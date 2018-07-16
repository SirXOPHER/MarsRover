import java.util.ArrayList;
import java.util.List;

class Controller {

    private List<Command> history = new ArrayList<>();

    void execute(Command command) {
        command.execute();
    }

    void storeAndExecute(Command command) {
        this.history.add(command);
        command.execute();
    }

    List<Command> getHistory() {
        return history;
    }
}
