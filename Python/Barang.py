class Barang():
    __ID = ""
    __nama = ""
    __brand = ""
    __harga = ""

    def __init__(self, ID="", nama="", brand="", harga=""):
        self.__ID = ID
        self.__nama = nama
        self.__brand = brand
        self.__harga = harga

    def getID(self):
        return self.__ID

    def getnama(self):
        return self.__nama
    
    def getbrand(self):
        return self.__brand
    
    def getharga(self):
        return self.__harga
    
    def setID(self, ID):
        self.__ID = ID

    def setnama(self, nama):
        self.__nama = nama

    def setbrand(self, brand):
        self.__brand = brand

    def setharga(self, harga):
        self.__harga = harga