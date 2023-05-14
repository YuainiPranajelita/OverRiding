package overriding;

public class PerabotRumah {
    private String nama;
    
    public PerabotRumah (String nama){
        this.nama = nama;
        
    }
    
    public void setnama (String Nama){
        this.nama = Nama;
    }
    
    public String getnama () {
        return this.nama;
    }
}  