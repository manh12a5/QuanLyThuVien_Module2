import java.util.ArrayList;

public class ManagerStudent {
    ArrayList<TheMuon> arrtheMuon = new ArrayList<>();

    public void addNewStudent() {
        TheMuon theMuon = new TheMuon();
        theMuon.addNewTheMuon();
        arrtheMuon.add(theMuon);
    }

    public void allinfoStudent() {
        for (int i = 0; i < arrtheMuon.size(); i++) {
            System.out.println(arrtheMuon.get(i));
            System.out.print("\n");
        }
    }

    public void returnBookInLastMonth() {
        for (int i = 0; i < arrtheMuon.size(); i++) {
            if (arrtheMuon.get(i).getDayPayBook() == 30) {
                System.out.println(arrtheMuon.get(i));
            }
        }
    }

}
