use std::io;

struct NumComplex {
    real: f64,
    imaginary: f64,
}

impl NumComplex {
    pub fn new(real: f64, imaginary: f64) -> NumComplex {
        NumComplex { real, imaginary }
    }

    pub fn get_real(&self) -> f64 {
        self.real
    }

    pub fn get_imaginary(&self) -> f64 {
        self.imaginary
    }

    pub fn add(&self, other: &NumComplex) -> NumComplex {
        NumComplex::new(self.get_real() + other.get_real(), self.get_imaginary() + other.get_imaginary())
    }

    pub fn subtract(&self, other: &NumComplex) -> NumComplex {
        NumComplex::new(self.get_real() - other.get_real(), self.get_imaginary() - other.get_imaginary())
    }

    pub fn multiply(&self, other: &NumComplex) -> NumComplex {
        let new_real = self.get_real() * other.get_real() - self.get_imaginary() * other.get_imaginary();
        let new_imaginary = self.get_real() * other.get_imaginary() + self.get_imaginary() * other.get_real();
        NumComplex::new(new_real, new_imaginary)
    }

    pub fn conjugate(&self) -> NumComplex {
        NumComplex::new(self.get_real(), -self.get_imaginary())
    }

    pub fn print_complex(&self, label: &str) {
        if self.get_imaginary() > 0.0 {
            println!("{}: {} + {}i", label, self.get_real(), self.get_imaginary());
        } else {
            println!("{}: {} {}i", label, self.get_real(), self.get_imaginary());
        }
    }
}


fn main() {
    let mut input = String::new();

    println!("Digite o primeiro número complexo (parte real e parte imaginária separadas por espaço):");
    io::stdin().read_line(&mut input).expect("Falha ao ler a entrada.");
    let parts: Vec<&str> = input.trim().split_whitespace().collect();
    let real1: f64 = parts[0].parse().expect("Falha ao analisar a parte real.");
    let imaginary1: f64 = parts[1].parse().expect("Falha ao analisar a parte imaginária.");
    let num1 = NumComplex::new(real1, imaginary1);

    println!("Digite o segundo número complexo (parte real e parte imaginária separadas por espaço):");
    input.clear();
    io::stdin().read_line(&mut input).expect("Falha ao ler a entrada.");
    let parts: Vec<&str> = input.trim().split_whitespace().collect();
    let real2: f64 = parts[0].parse().expect("Falha ao analisar a parte real.");
    let imaginary2: f64 = parts[1].parse().expect("Falha ao analisar a parte imaginária.");
    let num2 = NumComplex::new(real2, imaginary2);

    // Impressão dos números complexos
    num1.print_complex("Número Complexo 1");
    num2.print_complex("Número Complexo 2");

    // Restante do código...

    let sum = num1.add(&num2);
    let difference = num1.subtract(&num2);
    let product = num1.multiply(&num2);
    let conjugate = num1.conjugate();

    // Impressão dos resultados
    sum.print_complex("Resultado da Soma");
    difference.print_complex("Resultado da Subtração");
    product.print_complex("Resultado da Multiplicação");
    conjugate.print_complex("Conjugado do primeiro número complexo");
}