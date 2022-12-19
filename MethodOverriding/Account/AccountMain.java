package com.company.MethodOverriding.Account;
//reference is stored in stack for example a, s, cheqing in line 11, 12, 13
//object is stored in heap like new Account() in line 12

//in overriding we have no idea which method will be called. its either asked to the user or runtime compiler decides it by itself
//a parent can hold a child object like line 12 ac one
public class AccountMain {
    public static void main(String[] args) {

        Account a = new SpecialSaving();

        System.out.println(a.InterestRate());

//        Account a = new Account();
//        Saving s = new Saving();
//        Cheqing cheqing = new Cheqing();
//
//
//        Account ac = new Cheqing();
//        Account as = new Saving();


//        System.out.println("Please select an account type: ");
//        System.out.println("Select 1 for Account \n" +
//                "Select 2 for Chequing \n" +
//                "Select 3 for Savings: ");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//
//        Account a = null;
//        switch (choice) {
//            case 1:
//                a = new Account();
//                break;
//            case 2:
//                a = new Cheqing();
//                break;
//            case 3:
//                a = new Saving();
//                break;
//            default:
//                System.out.println("Please try again");
//                break;
//
//        }
//        System.out.println(a.InterestRate("abc", 2));
//        // System.out.println(cheqing.InterestRate("nikhil", 2));
//    //we can only use .InterestRate constructor if it is present in all the classes only
//    }
//}
    }
}

//child cannot hold parent class as an object
// Cheqing ca=new Account();