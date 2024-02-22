<?php

require ('Baju.php');

$arraybj = array(); 

$baju1 = new Baju();


$baju1->setid("0000011");
$baju1->setnama("Septiani Eka Putri");
$baju1->setbrand('Husna');
$baju1->setharga("200000");
$baju1->setukuran("XL");
$baju1->setbahan("Katun rayon");
$baju1->setgender("Wanita");
$baju1->setwarna("Hitam cream");
$baju1->settipe("Lengan panjang");

array_push($arraybj, $baju1);

$baju2 = new Baju();

$baju2->setid("0000022");
$baju2->setnama("Meiva Labibah Putri");
$baju2->setbrand('Zara');
$baju2->setharga("5444999");
$baju2->setukuran("XL");
$baju2->setbahan("Katun");
$baju2->setgender("Perempuan");
$baju2->setwarna("Biru dongker");
$baju2->settipe("Lengan pendek");


array_push($arraybj, $baju2);

echo "<h2><b><center>Data Mahasiswa</center></b></h2>";

//KOLOM UTAMA TABEL
echo "<center><table border='2'>";
    echo "<tr>
        <th> ID </th>
        <th> Nama </th>
        <th> Brand </th>
        <th> Harga </th>
        <th> Ukuran </th>
        <th> Bahan </th>
        <th> Gender </th>
        <th> Warna </th>
        <th> Tipe </th>
    </tr>";

    //ISI TABEL
    for ($i=0; $i < count($arraybj); $i++)
    {
        echo "<tr><td>";
        echo $arraybj[$i]->getid();
        echo "</td><td>";
        echo $arraybj[$i]->getnama();
        echo "</td><td>";
        echo $arraybj[$i]->getbrand();
        echo "</td><td>";
        echo $arraybj[$i]->getharga();
        echo "</td><td>";
        echo $arraybj[$i]->getukuran();
        echo "</td><td>";
        echo $arraybj[$i]->getbahan();
        echo "</td><td>";
        echo $arraybj[$i]->getgender();
        echo "</td><td>";
        echo $arraybj[$i]->getwarna();
        echo "</td><td>";
        echo $arraybj[$i]->gettipe();
        echo "</td>";
        echo "</tr>";
    }
echo "</table> </center>";
        
?>