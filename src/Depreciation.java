public class Depreciation {
    public static void main(String[] args) {
//        Depreciation for the Year = (Asset Cost - Salvage Value) × factor
        int asset = 1000;
        int salvage = 500;
        int factor = 5;
        int d = (asset-salvage)*factor;
        System.out.println(d);
    }
}
