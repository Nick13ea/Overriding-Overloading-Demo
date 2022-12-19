package com.company.MethodOverriding.Account;

//overloading can only exist inside the class only not outside the class
//method signature just consist of same name nd an argument but no return type
//name and type - type nd order should be same, name could be different
public class Cheqing extends Account {

    @Override
    public double InterestRate() {
        return 2.2;
    }
}

