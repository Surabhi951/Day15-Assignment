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
        System.out.println();

        HashMap hashMap1 = new HashMap();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words1 = paragraph.split(" ");
        for ( String word : words1)
        {
            hashMap1.put(word,1);
        }
       int frequency1 = hashMap1.get("into");
       System.out.println("Frequency of given word is "+frequency1);

    }
}
