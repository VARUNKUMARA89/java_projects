public class Complex {
    int r, i;
    static Complex add(Complex a, Complex b){
        Complex c = new Complex();
        c.r = a.r + b.r;
        c.i = a.i + b.i;
        return c;
    }
    Complex(){
        r = 0;
        i = 0;
    }
    Complex(int r){
        this.r = r;
        i = 0;
    }
    Complex(int r, int i){
        this(r);
        this.i = i;

    }

    Complex(Complex obj){
        this.r = obj.r;
        this.i = obj.i;
    }

    public static void main(String[] args) {
        Complex obj = new Complex();
        Complex a = new Complex(2);
        System.out.println(a.r + " " + a.i);
        Complex b = new Complex(4,4);
        System.out.println(b.r + " " + b.i);
        Complex sum = Complex.add(a,b);
        System.out.println(sum.r +" "+ sum.i);
        Complex c = new Complex(a);
        System.out.println(c.r + " " + c.i);

    }
}

