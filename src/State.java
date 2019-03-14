import java.util.List;

public class State {
    private String name;
    private List<County> countries;

    public State(String name, List<County> countries){
        setName(name);
        setCountries(countries);
    }
    public List<County> getCountries() {
        return countries;
    }

    public void setCountries(List<County> countries) {
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
