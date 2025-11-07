public class SerieA {
    public static void main(String[] args) throws Exception {

        Campionato seriea = new Campionato("data/seriea.csv");

        System.out.println(seriea.getSquadra(0));
    }
}
