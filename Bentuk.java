package overriding;

public class Bentuk extends MejaBelajar {
    private String bentuk;
    
    public Bentuk (String nama, String Jenis, String Bentuk){
        super (nama, Jenis);
        this.bentuk = Bentuk;
    }
    
    public void setbentuk (String bentuk){
        this.bentuk = bentuk;
    }
    
    public String getbentuk (){
        return this.bentuk;
    }
    
    public void isirumah (){
        System.out.println(this.getbentuk());
    }
   
    
}
