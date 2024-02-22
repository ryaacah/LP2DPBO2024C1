class Baju extends Pakaian{
    private String warna;
    private String tipe;

    Baju(){

    }

    Baju(String warna, String tipe){
        this.warna = warna;
        this.tipe = tipe;
    }

    public void setwarna(String warna){
        this.warna = warna;
    }

    public void settipe(String tipe){
        this.tipe = tipe;
    }

    public String getwarna(){
        return this.warna;
    }

    public String gettipe(){
        return this.tipe;
    }
} 