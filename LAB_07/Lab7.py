import sys
class Lab7Class:
    def __init__(self):
        pass

    def main(self):
# ???????? ??????? ???????
        print("Enter the size of the square matrix: ")
        sideLength = int(input())
# ????????????? ??????
        arr = [[' ' for _ in range(i)] for i in range(1, sideLength//2 + 1)]
        arr += [[' ' for _ in range(i)] for i in range(1, sideLength // 2 + 1)]
        if sideLength % 2 == 1:
            arr.append([' ' for _ in range(sideLength//2 + 1)])
# ???????? ???????-???????????
        print("Enter the fill character: ")
        symbol = input()
# ?????????? ??????? ?????????
        for i in range(sideLength):
            arr[i] = [symbol for _ in range(len(arr[i]))]
# ????????? ??????? ? ???????
        for i in range(sideLength):
      
            print(" " * (sideLength // 2), end="")
            print("".join(arr[i]))

if __name__ == "__main__":
    lab7 = Lab7Class()
    lab7.main()