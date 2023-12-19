import math
import struct
import os
class CalculateTheEquation:
    def __init__(self):
        self.variable = 0
# ??????? ?????????? ?????? tg(4x)/4  
    def doCalculation(self):
        try:
            self.variable = math.tan(4*self.variable) / self.variable
            return self.variable
        except ZeroDivisionError:
            print("Arithmetic exception: illegal value.")                                                                                                                                                                                                                                                                                                                                                                                                                    
            return 0
# ??????? ?????? ?????????? ? ????????? ????    
    def writeResultToTxt(self, fileName):
         try:
          with open(fileName, 'w') as f:
                f.write(str(self.variable))
                f.flush()
                os.fsync(f.fileno())
          file_size = os.path.getsize(fileName)
          print(f"Size of the text file '{fileName}': {file_size} bytes")
         except IOError:
          print("Error writing to file.")
# ??????? ?????? ?????????? ? ???????? ????    
    def writeResultToBin(self, fileName):
        try:
            with open(fileName, 'wb') as f:
                f.write(struct.pack('>d', self.variable))
        except IOError:
            print("Error writing to file.")
# ??????? ??????? ?????????? ? ?????????? ?????    
    def readResultFromTxt(self, fileName):
        try:
            with open(fileName, 'r') as f:
                self.variable = float(f.read())
        except IOError:
            print("Error reading from file.")
# ??????? ??????? ?????????? ? ????????? ?????    
    def readResultFromBin(self, fileName):
        try:
            with open(fileName, 'rb') as f:
                self.variable = int.from_bytes(f.read(), 'big') / (2**64)
        except IOError:
            print("Error reading from file.")

calc = CalculateTheEquation()
# ????????? ?????????? ? ?????????? ?????
try:
    calc.readResultFromBin("bin.bin")
    print("Result of calculation:", calc.doCalculation())
    calc.writeResultToBin("bin.bin")
except IOError as e:
    print(e)
# ????????? ?????????? ? ????????? ?????
try:
    calc.readResultFromTxt("txt.txt")
    print("Result of calculation:", calc.doCalculation())

    calc.writeResultToTxt("txt.txt")
except IOError as e:
    print(e)