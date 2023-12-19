from automate import Automate
from assault_rifle import AssaultRifle

def main():
    automate = Automate("M16", "5.56mm")
    automate.fire()
    
    assault_rifle = AssaultRifle("AK-47", "7.62mm", 30)
    assault_rifle.fire()
    assault_rifle.reload()

if __name__ == "__main__":
    main()