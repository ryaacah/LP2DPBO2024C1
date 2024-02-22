class Barang{
    private String ID;
    private String nama;
    private String bran;
    private String harga;

    Barang(){

    }

    Barang(String ID, String nama, String bran, String harga){
        this.ID = ID;
        this.nama = nama;
        this.bran = bran;
        this.harga = harga;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setbran(String bran){
        this.bran = bran;
    }

    public void setharga(String harga){
        this.harga = harga;
    }

    public String getID(){
        return this.ID;
    }

    public String getnama(){
        return this.nama;
    }

    public String getbran(){
        return this.bran;
    }

    public String getharga(){
        return this.harga;
    }

} 