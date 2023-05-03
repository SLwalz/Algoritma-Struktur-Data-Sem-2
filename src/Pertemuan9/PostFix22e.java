/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan9;

/**
 *
 * @author Farisa
 */
public class PostFix22e {
    int n, top;
    char stack[];

    PostFix22e(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c){
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
        (c >= '0' && c <= '9') || (c == ' ' && c == '.')){
            return true;
        } else { return false; }
    }

    public boolean isOperator (char c){
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+' ){
            return true;
        } else { return false; }
    }

    public int derajat(char c){
        switch (c){
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String q){
        String p = "";
        char c;
        for (int i = 0; i<n; i++){
            c = q.charAt(i);
            if (isOperand(c)){
                p = p + c;
            }
            if (c == '('){
                push(c);
            }
            if (c == ')'){
                while (stack[top] != '('){
                    p = p + pop();
                }
                pop();
            }
            if (isOperator(c)){
                while (derajat(stack[top]) >= derajat(c)){
                    p = p + pop();
                }
                push(c);
            }
        }
        return p;
    }
}
