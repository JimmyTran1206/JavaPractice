public class Conditionals {
    public static void main(String[] args) {
        boolean flag = true;
        if(flag){
            System.out.println("Flag is True");
        }

//        Condition1
        boolean user = true;
        if(user == true){
            System.out.println("It's True");
        }

//        Condition2
        int x = 5;
        if(x > 0){
            System.out.println("X is Positive");
        }

        // Other conditions with logical operators
//        LogicalOperators
        int age = 18;
        if(age > 18){
            System.out.println("Condition is True");
        }

        String gender = "male";
        if(gender.equals("male")){
            System.out.println("Condition is True");
        }

        if(age > 18 && gender.equals("male")){
            System.out.println("Eligible");
        }

//        LogicalOperators1
        int a = 10, b = 20, c = 20, d = 0;
        if(a < b && b == c){
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }

        double examScore = 85;
        if(examScore >= 60 || examScore  <= 100){
            System.out.println("The student has passed the Exam");
        }

//        OrOperator1
        double num = 6;
        if(num % 2 == 0 || num % 3 == 0){
            System.out.println("The Number is even or divisible by 3");
        }

//        NotOperator
        int num2 = 7;
        if(!(num % 2 == 0)){
            System.out.println("The Number is odd");
        }
//        CompOperator
        int x2 = 5, y = 3, z = 4;
        if(x > y && x > z){
            System.out.println("x is the largest number");
        }

//        CompOperator1
        int score = 85;
        String grade;
        if(score >= 80 && score <= 95){
            grade = "A";
            System.out.println(grade);
        }

//        TernaryOperator
        int age2 = 20;
        String status;
        status = (age2 < 18) ?  "Under Age" : "Senior";
        System.out.println(status);

//        TernaryOperator1
        int marks = 50;
        String result;
        result = (marks > 40) ?  "Pass" : "Fail";
        System.out.println(result);

//        TernaryOperator2
        int number = 24;
        String result2;
        result2 = (number > 0) ?  "Positive Number" : "Negative Number";
        System.out.println(result2);

    }
}
