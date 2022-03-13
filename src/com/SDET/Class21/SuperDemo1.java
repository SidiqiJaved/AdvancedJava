package com.SDET.Class21;

public class SuperDemo1 {
}
class AAA{

}

class BBB extends AAA{
    String name ;
    BBB(){

    }
    BBB(String name){
        super();
     //   this.(); /// we can not use this() inside the same constructor

        this.name= name;
    }
}