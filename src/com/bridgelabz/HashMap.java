package com.bridgelabz;

public class HashMap {
    HashLinkedList[] buckets;

    public HashMap()
    {
        buckets = new HashLinkedList[20];
    }

    public void put(String key,Integer value)
    {
        int bucketIndex = computeBucketIndex(key);
        HashLinkedList foundLinkedList = buckets[bucketIndex];
        if(foundLinkedList != null)
        {
            HashNode foundNode = foundLinkedList.search(key);
            if(foundNode != null)
            {
                foundNode.value += value;
            }
            else {
                foundLinkedList.add(key, value);
            }
        }
        else
        {
            HashLinkedList newLinkedList = new HashLinkedList();
            newLinkedList.add(key,value);
            buckets[bucketIndex] = newLinkedList;
        }
    }
    public int get(String key)
    {
        int bucketIndex = computeBucketIndex(key);
        HashLinkedList foundLinkedList = buckets[bucketIndex];
        if(foundLinkedList != null)
        {
            HashNode foundNode = foundLinkedList.search(key);
            return  foundNode.value;
        }
        return 0;
    }

        private int computeBucketIndex(String key) {
        int hashCode = Math.abs(key.hashCode());
        int bucketIndex = hashCode % buckets.length;
        return bucketIndex;
    }

}
