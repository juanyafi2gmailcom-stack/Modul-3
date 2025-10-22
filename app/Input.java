package app;

import java.util.Scanner;

public class Input {
    private static final Scanner SC = new Scanner(System.in);

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(SC.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("Masukan harus bilangan bulat. Coba lagi."); }
        }
    }

    public static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Double.parseDouble(SC.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("Masukan harus angka (boleh desimal). Coba lagi."); }
        }
    }

    public static void close() {
        try { SC.close(); } catch (Exception ignored) {}
    }
}
