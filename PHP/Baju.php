<?php

require ('Pakaian.php');

class Baju extends Pakaian{

    private $warna = '';
    private $tipe = '';

    public function __construct( $warna = '', $tipe = ''){
        $this->warna = $warna;
        $this->tipe = $tipe;
    }

    public function setwarna($warna){
        $this->warna = $warna;
    }

    public function settipe($tipe){
        $this->tipe = $tipe;
    }


    public function getwarna(){
        return $this->warna;
    }

    public function gettipe(){
        return $this->tipe;
    }

    
}

?>