import java.io.*;

public class Planets {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("week9/planets.txt"));
        String line = r.readLine();
        System.out.println(line);
        String [] components = line.split(" ", 4);
        PlanetSighting sighting = new PlanetSighting(components[0],
                Double.parseDouble(components[1]),
                Double.parseDouble(components[2]),
                Double.parseDouble(components[3]));
        sighting.printSighting(System.out);
    }
}

class PlanetSighting {
    private String name;
    private double xDistanceFromEarth;
    private double yDistanceFromEarth;
    private double zDistanceFromEarth;

    public PlanetSighting(String name, Double x, Double y, Double z) {
        super();
        this.name = name;
        xDistanceFromEarth = x;
        yDistanceFromEarth = y;
        zDistanceFromEarth = z;
    }

    public void printSighting(PrintStream output) {
        output.println(name);
        output.println(xDistanceFromEarth);
        output.println(yDistanceFromEarth);
        output.println(zDistanceFromEarth);
    }
    // and the rest
}
