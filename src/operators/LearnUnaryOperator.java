package operators;

public class LearnUnaryOperator {

    // Increment operator: ++ always add 1
    // PreIncrement: ++number
    // PostIncrement: number++

    // Decrement Operator: -- Decrease -1
    // PreDecrement : --number
    // PostDecrement : number--

    public static void main(String[] args) {
        int number = 30;
        //System.out.println(++number); // 1+number
        System.out.println("************************");
        System.out.println(number++); // number+ 1(this 1 is for future use)
        System.out.println(number); //31
        number++;//31 + 1ForFuture
        number++;//32   +1ForFuture
        ++number;//1+1+32
        System.out.println(number); // 34,
        --number;
        System.out.println(number);// 33
        number--;
        number--;
        number--;
        --number;
        --number;
        ++number;
        number++;
        System.out.println(number);//29,30,




    }


}
