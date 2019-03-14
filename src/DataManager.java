import java.util.List;

public class DataManager {
    private String name;
    private List<State> states;

    public DataManager(String name, List<State> states) {
        setName(name);
        setStates(states);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}
