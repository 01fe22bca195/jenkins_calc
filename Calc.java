class Calc extends ExtendedCalc{

    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return the sum of operand_1 and operand_2.
     */
     float addition(float operand_1,float operand_2){
         return(operand_1+operand_2);
     }
 
     /**
      * The function "substraction" takes two float operands and returns their difference.
      * 
      * @param operand_1 The first operand for the subtraction operation.
      * @param operand_2 The second operand in the subtraction operation.
      * @return the result of subtracting operand_2 from operand_1.
      */
     float substraction(float operand_1,float operand_2){
         return(operand_1-operand_2);
     }
 
     /**
      * The function "multiplication" takes two float operands and returns their product.
      * 
      * @param operand_1 The first operand for multiplication. It is a floating-point number.
      * @param operand_2 The second operand in the multiplication operation.
      * @return The product of operand_1 and operand_2 is being returned.
      */
     float multiplication(float operand_1,float operand_2){
         return(operand_1*operand_2);
     }
 
     /**
      * The division function takes two float operands and returns their quotient.
      * 
      * @param operand_1 The first operand of the division operation.
      * @param operand_2 The second operand in the division operation.
      * @return the result of dividing operand_1 by operand_2.
      */
     float division(float operand_1,float operand_2){
         return(operand_1/operand_2);
     }

     // The code `public static void main(String[] args)` is the main method in Java. It is the entry
     // point of the program and is automatically called when the program is executed.
     public static void main(String[] args){
         float operand_1=10;
         float operand_2=7;
         Calc c = new Calc();
 
         // The code `float add_result=c.addition(operand_1,operand_2);` is calling the `addition`
         // method of the `Calc` class and passing `operand_1` and `operand_2` as arguments. It assigns
         // the returned value to the variable `add_result`, which will hold the sum of `operand_1` and
         // `operand_2`.
         float add_result=c.addition(operand_1,operand_2);
         System.out.println("Addition result is : "+add_result);
 
        // The code `float sub_result=c.substraction(operand_1,operand_2);` is calling the
        // `substraction` method of the `Calc` class and passing `operand_1` and `operand_2` as
        // arguments. It assigns the returned value to the variable `sub_result`, which will hold the
        // difference of `operand_1` and `operand_2`.
         float sub_result=c.substraction(operand_1,operand_2);
         System.out.println("Substraction result is : "+sub_result);
 // The code `float mul_result=c.multiplication(operand_1,operand_2);` is calling the `multiplication`
 // method of the `Calc` class and passing `operand_1` and `operand_2` as arguments. It assigns the
 // returned value to the variable `mul_result`, which will hold the product of `operand_1` and
 // `operand_2`.
 
         float mul_result=c.multiplication(operand_1,operand_2);
         System.out.println("Multiplication result is : "+mul_result);
 // The code `float div_result=c.division(operand_1,operand_2);` is calling the `division` method of the
 // `Calc` class and passing `operand_1` and `operand_2` as arguments. It assigns the returned value to
 // the variable `div_result`, which will hold the quotient of `operand_1` divided by `operand_2`.
 
         float div_result=c.division(operand_1,operand_2);
         System.out.println("Division result is : "+div_result);

        

         float sqr_result=c.square(operand_1);
         System.out.println("Square result is : "+sqr_result);
 
         float cube_result=c.cube(operand_1);
         System.out.println("Cube result is : "+cube_result);
 
     }
 }
