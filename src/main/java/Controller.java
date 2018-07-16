import java.util.ArrayList;
import java.util.List;

class Controller {

    private List<Command> history = new ArrayList<Command>();

    void execute(Command command) {
        command.execute();
    }

    void storeAndExecute(Command command) {

    }

    List<Command> getHistory() {

    }
}
