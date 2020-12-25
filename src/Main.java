import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();

        int number;
        do {
            listSwitch();
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    //Nhập thông tin
                    managerStudent.addNewStudent();
                    break;
                case 2:
                    //Hiển thị toàn bộ thông tin nhập
                    managerStudent.allinfoStudent();
                    break;
                case 3:
                    //Tên sách mượn cần trả vào cuối tháng
                    managerStudent.returnBookInLastMonth();
                    break;
            }
        } while (number != 0);
    }

    public static void listSwitch() {
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Hiển thị toàn bộ thông tin");
        System.out.println("3. Sách mượn cần phải trả cuối tháng");
        System.out.print("Choice number: ");
    }
}
