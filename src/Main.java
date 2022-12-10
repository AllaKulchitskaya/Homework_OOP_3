import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Herbivorous gazelle = new Herbivorous("Газель", 8, "саванна",
                97, "трава");
        System.out.println(gazelle);
        Herbivorous giraffe = new Herbivorous("Жираф", 25, "саванна",
                55, "листва деревьев");
        System.out.println(giraffe);
        Herbivorous horse = new Herbivorous("Лошадь", 25, "степи, полупустыни, лесостепи",
                60, "трава");
        System.out.println(horse);
        Predator hyena = new Predator("Гиена", 12, "пустынное побережье",
                60, "падаль, птицы и насекомые");
        System.out.println(hyena);
        Predator tiger = new Predator("Тигр", 10, "сухие саванны, дождевые и мангровые леса",
                65, "другие животные");
        System.out.println(tiger);
        Predator bear = new Predator("Медведь", 30, "лиственные леса, таежная зона, ледяные поля",
                45, "растительная пища, насекомые, рыба и другие животные");
        System.out.println(bear);
        Amphibia frog = new Amphibia("Лягушка", 9, "пресноводны водоемы, суша и подземные норы");
        System.out.println(frog);
        Amphibia waterSnake = new Amphibia("Уж пресноводный", 20, "побережье пресных водоемов");
        System.out.println(waterSnake);
        Flightless peacock = new Flightless("Павлин", 15,
                "лесистые местности, джунгли и берега рек", "ходит");
        System.out.println(peacock);
        Flightless penguin = new Flightless("Пингвин", 20,
                "открытое море, прибрежные воды и побережье", "ходит и плавает");
        System.out.println(penguin);
        Flightless dodo = new Flightless("Птица додо", 10, "остров Маврикий", "ходила");
        System.out.println(dodo);
        Flying seagull = new Flying("Чайка", 23,
                "вблизи морского побережья и внутренних водоемов", "летает");
        System.out.println(seagull);
        Flying albatross = new Flying("Альбатрос", 42, "ледяные воды Антарктиды и Южное полушарие",
                "летает");
        System.out.println(albatross);
        Flying falcon = new Flying("Сокол", 20,
                "повсеместно, за исключением северного и южного полюса", "летает");
        System.out.println(falcon);

        System.out.println(areAnimalsSame(penguin, gazelle));
        System.out.println(areAnimalsSame(tiger, tiger));
    }


    public static boolean areAnimalsSame(Animal animal, Animal animal2) {
        if (animal.equals(animal2)) {
            return true;
        }
        return false;
    }
}