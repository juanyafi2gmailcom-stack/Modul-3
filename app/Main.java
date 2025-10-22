package app;

public class Main {
    public static void main(String[] args) {
        History history = new History();

        System.out.println("== Mini CLI Calculator ==");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Penjumlahan");
            System.out.println("2) Pengurangan");
            System.out.println("3) Perkalian");
            System.out.println("4) Pembagian");
            System.out.println("5) Lihat Riwayat");
            System.out.println("0) Keluar");

            int pilih = Input.readInt("Pilih menu: ");
            if (pilih == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            switch (pilih) {
                case 1, 2, 3, 4 -> {
                    double a = Input.readDouble("Masukkan angka pertama: ");
                    double b = Input.readDouble("Masukkan angka kedua  : ");
                    double hasil;
                    String ekspresi;

                    try {
                        switch (pilih) {
                            case 1 -> { hasil = Calculator.add(a, b); ekspresi = a + " + " + b + " = " + hasil; }
                            case 2 -> { hasil = Calculator.sub(a, b); ekspresi = a + " - " + b + " = " + hasil; }
                            case 3 -> { hasil = Calculator.mul(a, b); ekspresi = a + " * " + b + " = " + hasil; }
                            default -> { hasil = Calculator.div(a, b); ekspresi = a + " / " + b + " = " + hasil; }
                        }
                        System.out.println("Hasil: " + hasil);
                        history.add(ekspresi);
                    } catch (IllegalArgumentException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                }
                case 5 -> history.print();
                default -> System.out.println("Menu tidak dikenali.");
            }
        }

        Input.close();
    }
}
