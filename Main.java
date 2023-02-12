import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez your Character ");

            String character = scanner.nextLine();

            LinkedList linkedList = new LinkedList();
            
            linkedList.addAll(new ListCharacter(character));

      System.out.println(linkedList.displyListCharacter().toString());
        }catch (Exception e) {
            // TODO: handle exception
        }

    }
}
