public class logicalOperator {
    //
    // Logical operators are used to perform logical operations on boolean values.
    // There are three logical operators in Java: &&, ||, ! (AND, OR, NOT)
    // && (AND) - Returns true if both the operands are true
    // || (OR) - Returns true if one of the operands is true
    // ! (NOT) - Returns true if the operand is false, and false if the operand is
    // true
    // The logical operators are used to combine two or more conditions.
    // The && and || operators are used to combine two or more relational
    // expressions.
    // The ! operator is used to reverse the logical state of its operand.
    // The && and || operators are used to combine two or more relational
    // expressions.
    // |(bitwise OR) - Returns a 1 in each bit position if one or both bits are 1,
    // and 0 if both are 0.
    // &(bitwise AND) - Returns a 1 in each bit position if both bits are 1, and 0
    // if one or both are 0.
    // | boolean logical operators
    public static void main(String[] args) {

        // booleanLogicalOperators......
        int a = 5;
        int b = 3;
        System.out.println(a | b); // true
        System.out.println(a & b); // false
        // && logical operator...........
        int x = 5;
        int y = 6;
        System.out.println(x > 3 && y > 3); // true
        System.out.println(x > 3 && y > 7); // false

        // || logical operator..................
        int m = 5;
        int n = 6;
        System.out.println(m > 3 || n > 3); // true
        System.out.println(m > 3 || n > 7); // true
        System.out.println(m > 7 || n > 7); // false

        // ! logical operator

        // int p = 5;
        // int c = 4;
        // boolean n = ++c > 2 && ++c < 5;
        // System.out.println(n); // true
        // System.out.println(c); // 5
    }
}
