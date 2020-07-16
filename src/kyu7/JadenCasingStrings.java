package kyu7;
/*
When writing on Twitter, he is known for almost always capitalizing every word.
For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */

public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {
        if (phrase != null && phrase.length() > 1) {
            StringBuilder result = new StringBuilder();
            if (Character.isAlphabetic(phrase.charAt(0)))result.append(phrase.toUpperCase().charAt(0));

            for (int i = 1; i < phrase.length(); i++) {
                if (Character.isAlphabetic(phrase.charAt(i)) && phrase.charAt(i-1) == ' ')  {
                    result.append(phrase.toUpperCase().charAt(i));
                } else result.append(phrase.charAt(i));
            }
            return result.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(toJadenCase(null));
        System.out.println(toJadenCase(""));
    }

}
