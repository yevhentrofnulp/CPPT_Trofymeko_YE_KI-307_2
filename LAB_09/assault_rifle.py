from automate import Automate

class AssaultRifle(Automate):
    def __init__(self, model, caliber, magazine_capacity):
        super().__init__(model, caliber)
        self.magazine_capacity = magazine_capacity
    
    def reload(self):
        print(f"Reloading {self.model} with {self.magazine_capacity} rounds")