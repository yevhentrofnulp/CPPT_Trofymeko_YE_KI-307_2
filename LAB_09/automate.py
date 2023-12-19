class Automate:
    def __init__(self, model, caliber):
        self.model = model
        self.caliber = caliber
    
    def fire(self):
        print(f"Firing {self.model}")