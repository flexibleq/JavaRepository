package com.fanyi;

import java.io.IOException;
import java.util.StringTokenizer;

public class Text {
    public static void handle(String eString) throws IOException{
        StringTokenizer st = new StringTokenizer(eString,",!' '.;");
        while(st.hasMoreElements()){
            String sText;
            sText = st.nextElement().toString();
        }
    }
}
