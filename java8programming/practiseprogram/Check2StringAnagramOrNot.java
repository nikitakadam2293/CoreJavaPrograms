package java8programming.practiseprogram;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//12) Java 8 program to check if two strings are anagrams or not?


public class Check2StringAnagramOrNot {
    public static void main(String[] args) {

        String s1 = "javaar";
        String s2 = "jarava";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if(s1.equals(s2))
        {
            System.out.println("String are Anagram : ");
        }
        else
        {
            System.out.println("String are not Anagram ");
        }
    }
}

/*
s1.split("") → splits the string into an array of characters: ["R", "a", "c", "e", "C", "a", "r"]

.map(String::toUpperCase) → converts each letter to uppercase: ["R", "A", "C", "E", "C", "A", "R"]

.sorted() → sorts the characters: ["A", "A", "C", "C", "E", "R", "R"]

.collect(Collectors.joining()) → joins them back into a string: "AACCERR"



* */