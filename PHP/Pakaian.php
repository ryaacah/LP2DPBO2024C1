<?php

require ('Barang.php');

class Pakaian extends Barang{

    private $ukuran = '';
    private $bahan = '';
    private $gender = '';

    public function __construct( $ukuran = '', $bahan = '', $gender = ''){
        $this->ukuran = $ukuran;
        $this->bahan = $bahan;
        $this->gender = $gender;
    }

    public function setukuran($ukuran){
        $this->ukuran = $ukuran;
    }

    public function setbahan($bahan){
        $this->bahan = $bahan;
    }

    public function setgender($gender){
        $this->gender = $gender;
    }



    public function getukuran(){
        return $this->ukuran;
    }

    public function getbahan(){
        return $this->bahan;
    }

    public function getgender(){
        return $this->gender;
    }

    
}

?>