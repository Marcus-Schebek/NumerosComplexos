class NumComplex:
    def __init__(self, real, imaginary):
        self.real = real
        self.imaginary = imaginary
    def get_real(self):
        return self.real
    def get_imaginary(self):
        return self.imaginary
    def add(self, other):
        newReal = self.get_real() + other.get_real()
        newImaginary = self.get_imaginary() + other.get_imaginary()
        return NumComplex(newReal, newImaginary)
    def subtract(self, other):
        newReal = self.get_real() - other.get_real()
        newImaginary = self.get_imaginary() - other.get_imaginary()
        return NumComplex(newReal, newImaginary)
    def multiply(self, other):
        newReal = self.get_real() * other.get_real()
        newImaginary = self.get_imaginary() * other.get_imaginary()
        return NumComplex(newReal, newImaginary)
    def division(self, other):
        denominator = other.get_real() * other.get_real() + other.get_imaginary() * other.get_imaginary()
        newReal = (self.get_real() * other.get_real() + self.get_imaginary() * other.get_imaginary())/denominator
        newImaginary = (self.get_real() * other.get_real() - self.get_imaginary() * other.get_imaginary())/denominator
        return NumComplex(newReal, newImaginary)
    def __str__(self) -> str: #Método que permite definir uma representação em string personalizada para nossa classe, achei lindo 
        if self.get_imaginary() >= 0:
            return f"{self.get_real()} + {self.get_imaginary()}i"
        else:
            return f"{self.get_real()} - {-self.get_imaginary()}i"

    
real1, imaginary1 = map(float, input("Digite o primeiro número complexo (parte real e parte imaginária separadas por espaço): ").split(" "))
real2, imaginary2 = map(float, input("Digite o segundo número complexo (parte real e parte imaginária separadas por espaço): ").split(" "))
num1 = NumComplex(real1, imaginary1)
num2 = NumComplex(real2, imaginary2)


sum_result = num1.add(num2)
difference_result = num1.subtract(num2)
product_result = num1.multiply(num2)



print("Resultado da Soma:", sum_result)
print("Resultado da Subtração:", difference_result)
print("Resultado da Multiplicação:", product_result)
