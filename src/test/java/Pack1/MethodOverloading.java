package Pack1;

public class MethodOverloading {

    public void calc(int principal, int interestrate) {

        int simpleInterest = (principal * interestrate * 1) / 100;
        System.out.println("Simple interest for the period of 1 year = " + simpleInterest);
    }

    public void calc(int principal, int interestrate, int tenuryears) {

        int simpleInterest = (principal * interestrate * tenuryears) / 100;
        System.out.println("Simple interest for the period of " + tenuryears + " years = " + simpleInterest);
    }

    public static void main(String[] args) {

        MethodOverloading object = new MethodOverloading();
        //You are creating an object of the class.

        object.calc(20000, 4);
        object.calc(20000, 4, 5);

    }
}