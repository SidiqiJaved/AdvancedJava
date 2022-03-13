package Repls;

import java.util.Locale;

public class Repl91 {

    public static void main(String []args){
        String str1="syntax technologies and convert into SYNTAX TECHNOLOGIES";

        String str2="SYNTAX TECHNOLOGIES and convert into syntax technologies";


        System.out.println(str1.toUpperCase(Locale.ROOT));
        System.out.println(str2.toLowerCase(Locale.ROOT));
    }


}
