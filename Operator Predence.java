class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 12;
        boolean hasil = x + x++ < y && y - x > 2;
        System.out.println(hasil);
    }
}