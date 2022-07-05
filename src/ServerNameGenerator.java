public class ServerNameGenerator {
   private static String[] adjectives = {"pizza", "taco", "pasta", "crackers", "soup", "cookies", "eggs", "juice", "bread", "rice"};
    private static String[] nouns = {"alpha", "beta", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "india", "Juliet"};

    private static String randomName(String[] nameList) {
        int currentPick = (int) (Math.random() * nameList.length);
        return nameList[currentPick];
}

public static String runSNG(String[] name1, String[] name2){
        String firstName = randomName(name1);
        String lastName = randomName(name2);
        String nameCombo = firstName + "-" + lastName;
        return nameCombo;
}

    public static void main(String[] args) {
        System.out.printf("Here is your sever name:");
        System.out.println(runSNG(adjectives, nouns));
    }
}
