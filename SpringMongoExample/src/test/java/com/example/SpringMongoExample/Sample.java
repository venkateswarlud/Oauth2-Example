package com.example.SpringMongoExample;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
       //count of each character
        /**char[] str = "dfaaaccgga".toCharArray();
        Map<Character,Integer> map= new HashMap();
        for(char ch: str){
            if(map.get(ch) != null){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);**/
        //count of each characternext
    /**    char[] str = "dfaaaccgga".toCharArray(); //d1f1a3c2g2a1
        StringBuilder stringBuilder = new StringBuilder();

        //System.out.println(str.length);
        for(int i=0,j=1;i<str.length-1; i++){
            //for(int j=i+1;j< str.length-1;j++){
                if(str[i] == str[i+1]){
                    j++;
                    continue;
                }else{
                    stringBuilder.append(str[i]);
                    stringBuilder.append(j);
                }
          //  }
        }

        System.out.println(stringBuilder);

        Map<String,Long> list ="dfaaaccgga".chars()
                .mapToObj(j -> (char) j)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
       // System.out.println(list);**/

        String s1 = "Cat";
        String s2 = "Cat";
        String s4 = s2;
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :"+(s1==s4));
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
    }
}
