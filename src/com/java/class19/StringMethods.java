package com.java.class19;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // 1. Change Case Of String
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // 2. Equality of String
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false

        // 3. Equals ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        // 4. Contains // has to be exact matching of the string
        String str4 = "Hello Syrga, Welcome to Google";
        System.out.println(str4.contains(str1)); // true
        System.out.println(str4.contains(str3)); // false
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); // true in this case

        System.out.println(str1.contains(str4)); // false

        // 5. Character at Particular Index
        System.out.println(str4.charAt(15));

        // 6. Index of Particular character
        System.out.println(str4.indexOf('S'));

        // 7. Length of the String
        System.out.println(str4.length());

        // 8. Check if String is empty
        String str5 = "  ";
        System.out.println(str5.isEmpty()); // false, but if there's any space, then it is true
        //System.out.println(str5.isBlank()); // true -  doesn't care about spaces

        // 9. Trim - trimming spaces before and after String
        String str6 = "        Hello        ";
        System.out.println(str6.trim()); // trimming the spaces before and after the String

        // 10. SubString
        String str7 = "Hello User, Welcome to Ebay";
        System.out.println(str7.substring(0));
        System.out.println(str7.substring(0,6));

        // 11. Format

        String title = "Hello %s, Welcome to %s";
        String user  = "Syrga";
        String website = "Amazon";
        System.out.println(String.format(title, user, website));

        // 12. Replace
        String title1 = "Hello ZZZ, Welcome to $$$";
        //title1 = title.replace("ZZZ", user);
        System.out.println(title1.replace("ZZZ", user)
        .replace("$$$", website));

        System.out.println(title1.replace("$$$", website));

        // replaceAll() - will learn later

        // 13. Split
        String title2 = "Hello User, Welcome to Ebay";
        String words[] = title2.split("");

        System.out.println(words.length);
    }
}
