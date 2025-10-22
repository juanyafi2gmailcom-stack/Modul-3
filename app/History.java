package app;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<String> items = new ArrayList<>();

    public void add(String entry) { items.add(entry); }

    public void print() {
        if (items.isEmpty()) {
            System.out.println("(Riwayat kosong)");
            return;
        }
        System.out.println("== Riwayat ==");
        int i = 1;
        for (String s : items) System.out.println(i++ + ") " + s);
    }
}
