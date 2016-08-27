A small (~3k) Least Recently Used cache implementation.

# Usage


```
import synapticloop.datastructures.LruCache;
import synapticloop.datastructures.LruCacheStatistics;

...

// Simply create an LruCache object with the Key and Value Types

// by default - this will have a size of 512 entries
LruCache<Integer, Integer> lruCache = new LruCache<Integer, Integer>();

// you could also create a smaller/larger cache by passing in the cache size
LruCache<Integer, Integer> lruCacheLarge = new LruCache<Integer, Integer>(1024);
LruCache<Integer, Integer> lruCacheSmall = new LruCache<Integer, Integer>(3);

// add some items

lruCacheSmall.put(1, 1);
lruCacheSmall.put(2, 2);
lruCacheSmall.put(3, 3);

// Note that the tail of the cache is the last to be evicted

System.out.println(lruCacheSmall.toString()); // "{ 1:1 }, { 2:2 }, { 3:3 }"


lruCacheSmall.get(2);

System.out.println(lruCacheSmall.toString()); // "{ 1:1 }, { 3:3 }, { 2:2 }"

// now add another entry - to evict one

lruCacheSmall.put(4, 4);

System.out.println(lruCacheSmall.toString()); // "{ 3:3 }, { 2:2 }, { 4:4 }"

```