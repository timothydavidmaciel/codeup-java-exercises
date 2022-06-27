public class ServerNameGenerator {
    private static String[] adj = {"radical", "tubular", "gnarly", "wicked", "groovy", "bland", "juicy", "wild", "sketchy", "worked"};
    private static String[] noun = {"wombat", "potoroo", "kangaroo", "koala", "bandicoot", "quoll", "opossum", "billby", "numbat", "wallaby"};

    private static String randomElement(String[] strings){
        int magicNum = (int) (Math.random() * strings.length);
        return strings[magicNum];
    }

    public static String makeServerName(String[] strings1, String[] strings2){
        String part1 = randomElement(strings1);
        String part2 = randomElement(strings2);
        String finalString = part1 + "-" + part2;
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println("Your server name is:");
        System.out.println(makeServerName(adj,noun));
    }
}
