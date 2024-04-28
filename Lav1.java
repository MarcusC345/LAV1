import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Country {
    String country;
    String confederation;
    double populationShare;
    double tvAudienceShare;
    double gdpWeightedShare;

    public Country(String country, String confederation, double populationShare, double tvAudienceShare, double gdpWeightedShare) {
        this.country = country;
        this.confederation = confederation;
        this.populationShare = populationShare;
        this.tvAudienceShare = tvAudienceShare;
        this.gdpWeightedShare = gdpWeightedShare;
    }

    public String toString() {
        return String.format("%-20s %-10s %.1f%%", country, confederation, tvAudienceShare);
    }
}

public class Lav1 {
    public static void main(String[] args) {}
        List  
        Country countries = new ArrayList<>();
        countries.add(new Country("United States", "CONCACAF", 4.5, 4.3, 11.3));
        countries.add(new Country("Japan", "AFC", 1.9, 4.9, 9.1));
        countries.add(new Country("China", "AFC", 19.5, 14.8, 7.3));
        countries.add(new Country("Germany", "UEFA", 1.2, 2.9, 6.3));
        countries.add(new Country("Brazil", "CONMEBOL", 2.8, 7.1, 5.4));
        countries.add(new Country("United Kingdom", "UEFA", 0.9, 2.1, 4.2));
        countries.add(new Country("Italy", "UEFA", 0.9, 2.1, 4.0));
        countries.add(new Country("France", "UEFA", 0.9, 2.0, 4.0));
        countries.add(new Country("Russia", "UEFA", 2.1, 3.1, 3.5));
        countries.add(new Country("Spain", "UEFA", 0.7, 1.8, 3.1));
        countries.add(new Country("South Korea", "AFC", 0.7, 1.8, 3.0));
        countries.add(new Country("Indonesia", "AFC", 3.5, 6.7, 2.9));
        countries.add(new Country("Mexico", "CONCACAF", 1.7, 3.2, 2.6));
        countries.add(new Country("Turkey", "UEFA", 1.1, 2.3, 2.0));
        countries.add(new Country("Thailand", "AFC", 1.0, 2.4, 1.6));
        countries.add(new Country("Argentina", "CONMEBOL", 0.6, 1.5, 1.6));
        countries.add(new Country("Netherlands", "UEFA", 0.2, 0.6, 1.5));
        countries.add(new Country("Poland", "UEFA", 0.6, 1.2, 1.3));
        countries.add(new Country("Saudi Arabia", "AFC", 0.4, 0.5, 1.2));
        countries.add(new Country("Taiwan", "AFC", 0.3, 0.5, 1.0));
        countries.add(new Country("Canada", "CONCACAF", 0.5, 0.5, 1.0));
        countries.add(new Country("Colombia", "CONMEBOL", 0.7, 1.6, 0.9));
        countries.add(new Country("Venezuela", "CONMEBOL", 0.4, 1.0, 0.9));
        countries.add(new Country("South Africa", "CAF", 0.7, 1.3, 0.8));
        countries.add(new Country("Malaysia", "AFC", 0.4, 0.7, 0.7));
        countries.add(new Country("Switzerland", "UEFA", 0.1, 0.3, 0.7));
        countries.add(new Country("Nigeria", "CAF", 2.3, 2.6, 0.7));
        countries.add(new Country("Belgium", "UEFA", 0.2, 0.3, 0.7));
        countries.add(new Country("Sweden", "UEFA", 0.1, 0.3, 0.7));
        countries.add(new Country("Vietnam", "AFC", 1.3, 2.6, 0.6));
        countries.add(new Country("Iran", "AFC", 1.1, 0.7, 0.6));
        countries.add(new Country("Chile", "CONMEBOL", 0.3, 0.6, 0.6));
        countries.add(new Country("Romania", "UEFA", 0.3, 0.7, 0.6));
        countries.add(new Country("Austria", "UEFA", 0.1, 0.3, 0.6));
        countries.add(new Country("Singapore", "AFC", 0.1, 0.2, 0.6));
        countries.add(new Country("Australia", "AFC", 0.3, 0.3, 0.5));
        countries.add(new Country("Greece", "UEFA", 0.2, 0.3, 0.5));
        countries.add(new Country("Portugal", "UEFA", 0.2, 0.4, 0.5));
        countries.add(new Country("India", "AFC", 17.6, 2.0, 0.5));
        countries.add(new Country("Czech Republic", "UEFA", 0.2, 0.3, 0.5));
        countries.add(new Country("Egypt", "CAF", 1.1, 0.8, 0.5));
        countries.add(new Country("Denmark", "UEFA", 0.1, 0.2, 0.5));
        countries.add(new Country("Norway", "UEFA", 0.1, 0.1, 0.4));
        countries.add(new Country("Peru", "CONMEBOL", 0.4, 0.8, 0.4));
        countries.add(new Country("Ukraine", "UEFA", 0.7, 0.9, 0.4));
        countries.add(new Country("Iraq", "AFC", 0.5, 0.5, 0.4));
        countries.add(new Country("Hungary", "UEFA", 0.1, 0.3, 0.4));
        countries.add(new Country("Kazakhstan", "UEFA", 0.2, 0.3, 0.3));
        countries.add(new Country("Finland", "UEFA", 0.1, 0.2, 0.3));
        countries.add(new Country("Ireland", "UEFA", 0.1, 0.1, 0.3));
        countries.add(new Country("Algeria", "CAF", 0.5, 0.4, 0.3));
        countries.add(new Country("Cuba", "CONCACAF", 0.2, 0.3, 0.3));
        countries.add(new Country("Ecuador", "CONMEBOL", 0.2, 0.5, 0.3));
        countries.add(new Country("Slovakia", "UEFA", 0.1, 0.2, 0.3));
        countries.add(new Country("Qatar", "AFC", 0.0, 0.0, 0.2));
        countries.add(new Country("Kuwait", "AFC", 0.0, 0.1, 0.2));
        countries.add(new Country("Bulgaria", "UEFA", 0.1, 0.2, 0.2));
        countries.add(new Country("Serbia", "UEFA", 0.1, 0.3, 0.2));
        countries.add(new Country("Belarus", "UEFA", 0.1, 0.2, 0.2));
        countries.add(new Country("Hong Kong", "AFC", 0.1, 0.1, 0.2));
        countries.add(new Country("Croatia", "UEFA", 0.1, 0.1, 0.1));
        countries.add(new Country("Oman", "AFC", 0.0, 0.0, 0.1));
        countries.add(new Country("Dominica Republic", "CONCACAF", 0.1, 0.2, 0.1));
        countries.add(new Country("Azerbaijan", "UEFA", 0.1, 0.1, 0.1));
        countries.add(new Country("New Zealand", "OFC", 0.1, 0.1, 0.1));
        countries.add(new Country("Lithuania", "UEFA", 0.0, 0.1, 0.1));
        countries.add(new Country("Slovenia", "UEFA", 0.0, 0.1, 0.1));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] Ordenar por Ordem Alfabética");
            System.out.println("[2] Ordenar por audiência TV");
            System.out.println("[3] Encerrar");
    
            int option = scanner.nextInt();
    
            switch (option) {
                case 1:
                    Collections.sort(countries, Comparator.comparing(c > c.country));
                    System.out.println("Países ordenados por ordem alfabética:");
                    for (Country country : countries) {
                        System.out.println(country);
                    }
                    break;
                case 2:
                    Collections.sort(countries, Comparator.comparingDouble(c > c.tvAudienceShare));
                    System.out.println("Países ordenados por audiência de TV (em ordem crescente):");
                    for (Country country : countries) {
                        System.out.println(country);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    {}}}

// Considerações a Marcus e Isadora