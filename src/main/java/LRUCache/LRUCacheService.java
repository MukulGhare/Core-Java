package LRUCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCacheService {

    private final int CAPACITY;
    private final Map<String, Node> cacheMap;
    private final DoublyLinkedList list;

    private final Lock lock = new ReentrantLock();

    public LRUCacheService(int capacity){
        this.CAPACITY = capacity;
        this.cacheMap = new HashMap<>();
        this.list = new DoublyLinkedList();
    }


    public String get(String key){
        lock.lock();
        try {
            Node requestedNode = cacheMap.get(key);
            if( requestedNode == null){
                return null;
            }

            list.moveToHead(requestedNode);
            return requestedNode.value;

        } finally {
            lock.unlock();
        }
    }


    public void put(String key, String value){

        lock.lock();
        try {

            Node putNode = cacheMap.get(key);

            if( putNode != null){
                putNode.value = value;
                list.moveToHead(putNode);
                return;
            }

            putNode = new Node(key,value);
            cacheMap.put(key,putNode);
            list.addToHead(putNode);

            if( cacheMap.size() > CAPACITY){
                Node removedNode = list.removeTail();
                cacheMap.remove(removedNode.key);
            }


        } finally {
            lock.unlock();
        }


    }

}
