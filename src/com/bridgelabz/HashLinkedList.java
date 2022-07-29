package com.bridgelabz;

public class HashLinkedList {
    HashNode head;
    public HashNode search(String key)
    {
        HashNode temp = head;
        while(temp != null)
        {
            if(temp.key.equals(key))
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public void add(String key, Integer value)
    {
        HashNode newNode = new HashNode(key,value,null);
        newNode.next = head;
        head = newNode;
    }
}
