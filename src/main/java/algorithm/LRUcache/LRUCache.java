package algorithm.LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int maxEntries;

    public LRUCache(int maxEntries){
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }

    public static void main(String[] args) {
        LRUCache<String,Object> cache = new LRUCache<>(3);
        cache.put("a", "abstract");
        cache.put("b", "basic");
        cache.put("c", "call");
        cache.get("a");
        cache.put("d", "call");
        System.out.println(cache);

        System.out.println(LRUCache.test());
    }

    public static int test(){
        int ret = 0;
        try{
            return ret;
        }finally{
            ret = 2;
        }
    }
}
