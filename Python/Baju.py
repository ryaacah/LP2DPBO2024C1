from Pakaian import Pakaian

class Baju(Pakaian):
    __warna = ""
    __tipe = ""

    def __init__(self, warna="", tipe=""):
        self.__warna = warna
        self.__tipe = tipe

    def getwarna(self):
        return self.__warna
    
    def gettipe(self):
        return self.__tipe
    
    def setwarna(self, warna):
        self.__warna = warna

    def settipe(self, tipe):
        self.__tipe = tipe