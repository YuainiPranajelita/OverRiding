package overriding;

public class Meja extends PerabotRumah {
    public Meja (String nama){
        super (nama);
    }
    
    public void isirumah (){
        System.out.print(this.getnama());
        System.out.print("\t->\t");
    }
}