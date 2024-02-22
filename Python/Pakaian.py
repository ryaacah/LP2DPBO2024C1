from Barang import Barang

class Pakaian(Barang):
    __ukuran = ""
    __bahan = ""
    __gender = ""

    def __init__(self, ukuran="", bahan="", gender=""):
        self.__ukuran = ukuran
        self.__bahan = bahan
        self.__gender = gender

    def getukuran(self):
        return self.__ukuran
    
    def getbahan(self):
        return self.__bahan
    
    def getgender(self):
        return self.__gender
    
    def setukuran(self, ukuran):
        self.__ukuran = ukuran

    def setbahan(self, bahan):
        self.__bahan = bahan

    def setgender(self, gender):
        self.__gender = gender