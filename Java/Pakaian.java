class Pakaian extends Barang{
    private String ukuran;
    private String bahan;
    private String gender;
 

    Pakaian() {

    }

    Pakaian(String ukuran, String bahan, String gender){
        this.ukuran = ukuran;
        this.bahan = bahan;
        this.gender = gender;
    }

    public void setukuran(String ukuran){
        this.ukuran = ukuran;
    }

    public void setbahan(String bahan){
        this.bahan = bahan;
    }

    public void setgender(String gender){
        this.gender = gender;
    }

    public String getukuran() {
        return this.ukuran;
    }

    public String getbahan() {
        return this.bahan;
    }

    public String getgender() {
        return this.gender;
    }

}


