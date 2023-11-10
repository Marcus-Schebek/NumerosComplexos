class NumComplex:
    def __init__(self, real, imaginary):
        self.real = real
        self.imaginary = imaginary
    def add(self, another):
        newReal = self.real + another.real
        newImaginary = self.imaginary + another.imaginary
        return NumComplex(newReal, newImaginary)
    def subtract(self, another):
        newReal = self.real - another.real
        newImaginary = self.imaginary - another.imaginary
        return NumComplex(newReal, newImaginary)
    def multiply(self, another):
        newReal = self.real * another.real
        newImaginary = self.imaginary * another.imaginary
        return NumComplex(newReal, newImaginary)
    def conjugate(self):
        return NumComplex(self.real, -self.imaginary)
    def __str__(self) -> str: #Método mágico que permite definir uma representação em string personalizada para nossa classe
        if self.imaginary >= 0:
            return f"{self.real} + {self.imaginary}i"
        else:
            return f"{self.real} - {-self.imaginary}i"

    # Leitura de números complexos
real1, imaginary1 = map(float, input("Digite o primeiro número complexo (parte real e parte imaginária separadas por virgula): ").split(","))
real2, imaginary2 = map(float, input("Digite o segundo número complexo (parte real e parte imaginária separadas por virgula): ").split(","))
num1 = NumComplex(real1, imaginary1)
num2 = NumComplex(real2, imaginary2)

# Realização de operações
sum_result = num1.add(num2)
difference_result = num1.subtract(num2)
product_result = num1.multiply(num2)
conjugate_result = num1.conjugate()

# Impressão dos resultados
print("Resultado da Soma:", sum_result)
print("Resultado da Subtração:", difference_result)
print("Resultado da Multiplicação:", product_result)
print("Conjugado do primeiro número complexo:", conjugate_result)