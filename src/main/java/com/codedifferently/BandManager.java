package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i< wuMemberArray.length); {
            result += wuMemberArray[i].toString();

        }
        return result;
    }
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop


    public String forLoop() {
        String result = "";
        for (int i = 0; i < wuMemberArray.length; i++) {
            result += wuMemberArray[i].toString();

        }
            return result;
        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for(WuMember member : wuMemberArray) {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result += member;
        }    // end loop

        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}