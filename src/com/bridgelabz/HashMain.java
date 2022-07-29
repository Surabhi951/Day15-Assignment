package com.bridgelabz;

public class HashMain {

    public static void main(String args[]) {
        HashMap hashMap = new HashMap();
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            hashMap.put(word, 1);
        }
        int frequency = hashMap.get("to");
        System.out.println("Frequency of given word is " + frequency);

    }
}
