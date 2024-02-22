from Baju import Baju

__listbaju = []

print("> Banyak data :")
n = int(input())
for i in range(n):
    baju = Baju()
    print("> ID :")
    ID = input()
    print("> Nama :")
    nama = input()
    print("> Brand :")
    brand = input()
    print("> Harga :")
    harga = input()
    print("> Ukuran :")
    ukuran = input()
    print("> Bahan :")
    bahan = input()
    print("> Gender :")
    gender = input()
    print("> Warna :")
    warna = input()
    print("> Tipe :")
    tipe = input()

    baju.setID(ID)
    baju.setnama(nama)
    baju.setbrand(brand)
    baju.setharga(harga)
    baju.setukuran(ukuran)
    baju.setbahan(bahan)
    baju.setgender(gender)
    baju.setwarna(warna)
    baju.settipe(tipe)

    __listbaju.append(baju)

# Mencari panjang maksimum untuk setiap atribut
max_lengths = {
    'ID': max(len(baju.getID()) for baju in __listbaju),
    'nama': max(len(baju.getnama()) for baju in __listbaju),
    'brand': max(len(baju.getbrand()) for baju in __listbaju),
    'harga': max(len(baju.getharga()) for baju in __listbaju),
    'ukuran': max(len(baju.getukuran()) for baju in __listbaju),
    'bahan': max(len(baju.getbahan()) for baju in __listbaju),
    'gender': max(len(baju.getgender()) for baju in __listbaju),
    'warna': max(len(baju.getwarna()) for baju in __listbaju),
    'tipe': max(len(baju.gettipe()) for baju in __listbaju)
}

# Header
print("|", end="")
for attribute, length in max_lengths.items():
    print(f" {attribute.ljust(length)} |", end="")
print()

# Garis pembatas
print("|", end="")
for length in max_lengths.values():
    print("-" * (length + 2) + "|", end="")
print()

# Baris untuk setiap baju
for baju in __listbaju:
    print("|", end="")
    for attribute, length in max_lengths.items():
        value = getattr(baju, f"get{attribute}")()
        print(f" {value.ljust(length)} |", end="")
    print()
