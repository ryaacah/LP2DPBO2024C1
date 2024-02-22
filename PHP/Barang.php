<?php

class Barang{

    private $id = '';
    private $nama = '';
    private $brand = '';
    private $harga = '';

    public function __construct( $id = '', $nama = '', $brand = '', $harga = ''){
        $this->id = $id;
        $this->nama = $nama;
        $this->brand = $brand;
        $this->harga = $harga;
    }

    //setter

    public function setid($id){
        $this->id = $id;
    }

    public function setnama($nama){
        $this->nama = $nama;
    }

    public function setbrand($brand){
        $this->brand = $brand;
    }

    public function setharga($harga){
        $this->harga = $harga;
    }

    //getter

    public function getid(){
        return $this->id;
    }

    public function getnama(){
        return $this->nama;
    }

    public function getbrand(){
        return $this->brand;
    }

    public function getharga(){
        return $this->harga;
    }
}


?>