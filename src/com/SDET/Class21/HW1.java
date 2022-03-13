package com.SDET.Class21;

public class HW1 {
}


    /*
    Write program: userClass  that has a constructor
     that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and
     it also being initialized through constructor call. Print users name,
    mobile number and address in userDetails method. Test your code.
     */

    class userClass {
        String name;
        String MobileNumber;

        public userClass(String name, String MobileNumber) {
            this.name = name;
            this.MobileNumber = MobileNumber;
        }

    }

    class userInfo extends userClass{
        String address;
        public userInfo(String name, String MobileNumber, String address){
            super(name, MobileNumber);
             this.address=address;

        }
        void output(){
            System.out.println(name+ " "+ MobileNumber+" "+ address);
        }

        public static void main(String[] args) {
         new userInfo("Alpha", "456", "4 Braddock").output();
        }
    }







