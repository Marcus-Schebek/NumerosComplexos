public class NumComplex{
    private float real;
    private float imaginary;

    public NumComplex(float other, float y){
        this.real = other;
        this.imaginary = y;
    }

    public float getReal(){
        return this.real;
    }
    public float getImaginary(){
        return this.imaginary;
    }
    public NumComplex add(NumComplex other){
        float newReal = this.getReal() + other.getReal();
        float newImaginary = this.getImaginary() + other.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }

    public NumComplex subtract(NumComplex other){
        float newReal = this.getReal() - other.getReal();
        float newImaginary = this.getImaginary() - other.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }
    public NumComplex multiply(NumComplex other){
        float newReal = this.getReal() * other.getReal();
        float newImaginary = this.getImaginary() * other.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }
    public NumComplex division(NumComplex other){
        float denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        float newReal = (this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary())/denominator;
        float newImaginary = (this.getReal() * other.getReal() - this.getImaginary() * other.getImaginary())/denominator;
        return new NumComplex(newReal, newImaginary);
    }

    public void printNumComplex(){
        if (this.getImaginary() > 0){
            System.out.println(this.getReal() + "+" + this.getImaginary() + "i");
        } else{
            System.out.println(this.getReal() + " " + this.getImaginary() + "i");
        }
    }
}