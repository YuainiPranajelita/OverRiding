package overriding;

public class OverridingMain {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("| Nama \t: Yuaini Pranajelita \t|");
        System.out.println("| NPM \t: 21081010204 \t\t|");
        System.out.println("| Kelas : PBO D081 \t\t|");
        System.out.println("===============================");
        System.out.println("\n");
        
        System.out.println("\t\t\t\tMeja");
   
        System.out.print("Perabot Rumah");
        System.out.print("\t->\t");
        Meja perabot = new Meja ("Meja");
        perabot.isirumah();
        
        MejaBelajar MB = new MejaBelajar ("Meja","Meja Belajar");
        MB.isirumah();
        
        Bentuk b = new Bentuk ("Meja", "Meja Belajar","Meja Belajar Bulat");
        b.isirumah();
        
    }   
}
