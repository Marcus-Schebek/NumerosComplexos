#include <iostream>
#include <string>

class ComplexNumber {
public:
    ComplexNumber(double real, double imaginary) : real(real), imaginary(imaginary) {}

    double getReal() const {
        return real;
    }

    double getImaginary() const {
        return imaginary;
    }

    ComplexNumber add(const ComplexNumber& other) {
        return ComplexNumber(getReal() + other.getReal(), getImaginary() + other.getImaginary());
    }

    ComplexNumber subtract(const ComplexNumber& other) {
        return ComplexNumber(getReal() - other.getReal(), getImaginary() - other.getImaginary());
    }

    ComplexNumber multiply(const ComplexNumber& other) {
        double newReal = getReal() * other.getReal() - getImaginary() * other.getImaginary();
        double newImaginary = getReal() * other.getImaginary() + getImaginary() * other.getReal();
        return ComplexNumber(newReal, newImaginary);
    }

    ComplexNumber conjugate() {
        return ComplexNumber(getReal(), -getImaginary());
    }

    void printComplex(const std::string& label) const {
        std::cout << label << ": " << getReal();
        if (getImaginary() >= 0) {
            std::cout << " + " << getImaginary() << "i";
        } else {
            std::cout << " - " << -getImaginary() << "i";
        }
        std::cout << std::endl;
    }

private:
    double real;
    double imaginary;
};

int main() {
    double real1, imaginary1, real2, imaginary2;

    std::cout << "Digite o primeiro número complexo (parte real e parte imaginária separadas por espaço): ";
    std::cin >> real1 >> imaginary1;
    ComplexNumber num1(real1, imaginary1);

    std::cout << "Digite o segundo número complexo (parte real e parte imaginária separadas por espaço): ";
    std::cin >> real2 >> imaginary2;
    ComplexNumber num2(real2, imaginary2);

    num1.printComplex("Número Complexo 1");
    num2.printComplex("Número Complexo 2");


    ComplexNumber sum = num1.add(num2);
    ComplexNumber difference = num1.subtract(num2);
    ComplexNumber product = num1.multiply(num2);
    ComplexNumber conjugate = num1.conjugate();

    sum.printComplex("Resultado da Soma");
    difference.printComplex("Resultado da Subtração");
    product.printComplex("Resultado da Multiplicação");
    conjugate.printComplex("Conjugado do primeiro número complexo");

    return 0;
}
