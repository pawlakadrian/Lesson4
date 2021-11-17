import java.util.ArrayList;
import java.util.List;

public class Market {
    String name;
    List<Country> countries = new ArrayList<>();

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }

    public void printCountryInformation() {
        for (Country country : countries) {
            System.out.println(country.getCountryName() + " - " + country.getCountrySign() + " ");
        }
    }
}
