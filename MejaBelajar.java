package overriding;

public class MejaBelajar extends Meja {
    private String jenis;
    
    public MejaBelajar(String nama, String Jenis) {
        super(nama);
        this.jenis = Jenis;
    }
    
    public String getjenis (){
        return this.jenis;
    }
    
    public void setjenis (String jenis){
        this.jenis = jenis;
    }
    
    public void isirumah (){
        System.out.print(this.getjenis());
        System.out.print("\t->\t");
    }
}