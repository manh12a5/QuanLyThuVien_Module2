import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int numberTakeBook;
    private int dayTakeBook;
    private int dayPayBook;
    private int numberBookStore;

    public TheMuon() {
    }

    public TheMuon(int numberTakeBook, int dayTakeBook, int dayPayBook, int numberBookStore) {
        this.numberTakeBook = numberTakeBook;
        this.dayTakeBook = dayTakeBook;
        this.dayPayBook = dayPayBook;
        this.numberBookStore = numberBookStore;
    }

    public TheMuon(String name, int numberStudent, int birthday, String classStudent, int numberTakeBook, int dayTakeBook, int dayPayBook, int numberBookStore) {
        super(name, numberStudent, birthday, classStudent);
        this.numberTakeBook = numberTakeBook;
        this.dayTakeBook = dayTakeBook;
        this.dayPayBook = dayPayBook;
        this.numberBookStore = numberBookStore;
    }

    public int getNumberTakeBook() {
        return numberTakeBook;
    }

    public void setNumberTakeBook(int numberTakeBook) {
        this.numberTakeBook = numberTakeBook;
    }

    public int getDayTakeBook() {
        return dayTakeBook;
    }

    public void setDayTakeBook(int dayTakeBook) {
        this.dayTakeBook = dayTakeBook;
    }

    public int getDayPayBook() {
        return dayPayBook;
    }

    public void setDayPayBook(int dayPayBook) {
        this.dayPayBook = dayPayBook;
    }

    public int getNumberBookStore() {
        return numberBookStore;
    }

    public void setNumberBookStore(int numberBookStore) {
        this.numberBookStore = numberBookStore;
    }

    public void addNewTheMuon() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        super.addNewSinhVien();
        System.out.println("Nhập số phiếu mượn: ");
        numberTakeBook = scanner2.nextInt();
        System.out.println("Nhập ngày mượn sách:");
        dayTakeBook = scanner1.nextInt();
        System.out.println("Nhập hạn trả: ");
        dayPayBook = scanner2.nextInt();
        System.out.println("Nhập số hiệu sách: ");
        numberBookStore = scanner1.nextInt();
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "numberTakeBook=" + numberTakeBook +
                ", dayTakeBook=" + dayTakeBook +
                ", dayPayBook=" + dayPayBook +
                ", numberBookStore=" + numberBookStore +
                '}';
    }

}
