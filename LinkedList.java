import java.util.ArrayList;
import java.util.List;

/**
 * LinkedList
 */
public class LinkedList {

    private String head;

    private int size;

    private List<ListCharacter> listCharacter = new ArrayList<ListCharacter>();

    public LinkedList() {

        this.head = null;
        this.size = 0;
    }

    public LinkedList(String head, int size) {
        this.head = head;
        this.size = size;
    }

    public LinkedList(List<ListCharacter> listCharacter) {
        this.listCharacter = listCharacter;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ListCharacter> getListCharacter() {
        return listCharacter;
    }

    public void setListCharacter(List<ListCharacter> listCharacter) {
        this.listCharacter = listCharacter;
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + ", size=" + size + ", listCharacter=" + listCharacter + "]";
    }

    public String displyListCharacter() {
        return "LinkedList [  listCharacter=" + listCharacter + "]";
    }

    public LinkedList addAll (ListCharacter character){

        this.listCharacter.add(character);

        return this;
    }

}