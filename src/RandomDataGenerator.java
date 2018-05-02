import java.util.ArrayList;
import java.util.Random;

public class RandomDataGenerator {

    static ArrayList<String> nameList = new ArrayList<>();
    static ArrayList<String> surnameList = new ArrayList<>();
    static ArrayList<String> nationalityList = new ArrayList<>();


    public static void fillLists(){
        RandomDataGenerator.nameList.add("Jakub");
        RandomDataGenerator.nameList.add("Adam");
        RandomDataGenerator.nameList.add("Jurek");
        RandomDataGenerator.nameList.add("Janusz");
        RandomDataGenerator.nameList.add("Mateusz");
        RandomDataGenerator.nameList.add("Grzes");

        RandomDataGenerator.surnameList.add("Madej");
        RandomDataGenerator.surnameList.add("Lewy");
        RandomDataGenerator.surnameList.add("Styczen");
        RandomDataGenerator.surnameList.add("Piatek");
        RandomDataGenerator.surnameList.add("Lewandowski");

        RandomDataGenerator.nationalityList.add("Polska");
        RandomDataGenerator.nationalityList.add("Anglia");
        RandomDataGenerator.nationalityList.add("Niemcy");
        RandomDataGenerator.nationalityList.add("Dania");
        RandomDataGenerator.nationalityList.add("Slowacja");
        RandomDataGenerator.nationalityList.add("Rosja");

    }

    public static String randomName(){
        Random random = new Random();
        return RandomDataGenerator.nameList.get(random.nextInt(RandomDataGenerator.nameList.size()));
    }
    public static String randomSurame(){
        Random random = new Random();
        return RandomDataGenerator.surnameList.get(random.nextInt(RandomDataGenerator.surnameList.size()));
    }
    public static String randomNationality(){
        Random random = new Random();
        return RandomDataGenerator.nationalityList.get(random.nextInt(RandomDataGenerator.nationalityList.size()));
    }
    public static String randomNip(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i= 0 ;i<10;i++){
            int number = random.nextInt(10);
            sb.append(number);
        }
        return sb.toString();
    }

    public static CustomerType randomCustomerType(){
        Random random = new Random();
        if(random.nextBoolean()){
            return CustomerType.B2B;
        }else {
            return CustomerType.NORMAL;
        }
    }

}
