import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Mời nhập tên của bạn: ");
            name = scanner.nextLine();
            if (!name.equals("Hoàng")) {
                System.out.printf("Xin chào, %s!\n", name);
            }else {
                System.out.println("Chào tạm biệt!");
            }
        } while (!name.equals("Hoàng"));
    }
}