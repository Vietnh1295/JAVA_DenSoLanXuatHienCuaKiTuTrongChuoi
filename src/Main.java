import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ki tu:");
        message = sc.nextLine();
        char x;
        System.out.println("Nhap ki tu can dem:");
        x = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (x == message.charAt(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("So lan xuat hien cua chu " + x + " la:" + count);
        }
    }
}
