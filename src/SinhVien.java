import java.util.Scanner;

public class SinhVien {
    private String name;
    private int numberStudent;
    private int birthday;
    private String classStudent;

    public SinhVien() {
    }

    public SinhVien(String name, int numberStudent, int birthday, String classStudent) {
        this.name = name;
        this.numberStudent = numberStudent;
        this.birthday = birthday;
        this.classStudent = classStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public void addNewSinhVien() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("----------");
        System.out.println("Nhập tên sinh viên: ");
        name = scanner.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        numberStudent = scanner1.nextInt();
        System.out.println("Nhập năm sinh: ");
        birthday = scanner1.nextInt();
        System.out.println("Nhập lớp của sinh viên: ");
        classStudent = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", numberStudent=" + numberStudent +
                ", birthday=" + birthday +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
