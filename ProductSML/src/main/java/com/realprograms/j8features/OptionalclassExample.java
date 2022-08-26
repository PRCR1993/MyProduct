package com.realprograms.j8features;

import java.util.Locale;
import java.util.Optional;
import java.util.StringJoiner;

public class OptionalclassExample {

    String[]  strValue = new String[20];     //string type of array

    public void Optionalmethod(){

        strValue[0] = "xyz";

        strValue[8] = "RamChANDra";
        Optional<String>  checkNull = Optional.ofNullable(strValue[8]);

        if(checkNull.isPresent())
        {
            String  strV1 = strValue[8].toLowerCase();

            System.out.println("Getting value > " +strV1);
        }else{
            System.out.println("Getting null string");
        }
    }

    public String joiner(){

        String jv = "java";
        String ms = "microservices";
        String ws = "web services";
        String dvp = "developer";

        StringJoiner joiner = new StringJoiner("_");
            joiner.add(jv);
            joiner.add(ms);
            joiner.add(ws);
            joiner.add(dvp);

            System.out.println("string joiner values -> "+joiner);

       return  "jggjgjg";
    }
}
