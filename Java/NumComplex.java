public class NumComplex{
    private float real;
    private float imaginary;

    public NumComplex(float x, float y){
        this.real = x;
        this.imaginary = y;
    }

    public float getReal(){
        return this.real;
    }
    public float getImaginary(){
        return this.imaginary;
    }
    public NumComplex add(NumComplex x){
        float newReal = this.getReal() + x.getReal();
        float newImaginary = this.getImaginary() + x.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }

    public NumComplex subtract(NumComplex x){
        float newReal = this.getReal() - x.getReal();
        float newImaginary = this.getImaginary() - x.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }
    public NumComplex multiply(NumComplex x){
        float newReal = this.getReal() * x.getReal();
        float newImaginary = this.getImaginary() * x.getImaginary();
        return new NumComplex(newReal, newImaginary);
    }
    public NumComplex conjugate(){
        return new NumComplex(this.getReal(), -this.getImaginary());
    }
    public void printNumComplex(){
        if (this.getImaginary() > 0){
            System.out.println(this.getReal() + "+" + this.getImaginary() + "i");
        } else{
            System.out.println(this.getReal() + "-" + this.getImaginary() + "i");
        }
    }
}