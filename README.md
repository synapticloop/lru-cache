<img src="https://travis-ci.org/synapticloop/lru-cache.svg?branch=master" />

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

# Dependency Management

> Note that the latest version can be found [https://bintray.com/synapticloop/maven/lru-cache/view](https://bintray.com/synapticloop/maven/lru-cache/view)

Include the dependency

## maven

this comes from the jcenter bintray, to set up your repository:

    <?xml version="1.0" encoding="UTF-8" ?>
    <settings xsi:schemaLocation='http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd' xmlns='http://maven.apache.org/SETTINGS/1.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>
      <profiles>
        <profile>
          <repositories>
            <repository>
              <snapshots>
                <enabled>false</enabled>
              </snapshots>
              <id>central</id>
              <name>bintray</name>
              <url>http://jcenter.bintray.com</url>
            </repository>
          </repositories>
          <pluginRepositories>
            <pluginRepository>
              <snapshots>
                <enabled>false</enabled>
              </snapshots>
              <id>central</id>
              <name>bintray-plugins</name>
              <url>http://jcenter.bintray.com</url>
            </pluginRepository>
          </pluginRepositories>
          <id>bintray</id>
        </profile>
      </profiles>
      <activeProfiles>
        <activeProfile>bintray</activeProfile>
      </activeProfiles>
    </settings>

And now for the dependency

    <dependency>
      <groupId>synapticloop</groupId>
      <artifactId>lru-cache</artifactId>
      <version>v1.0.0</version>
      <type>jar</type>
    </dependency>
 
 
## gradle

Repository

    repositories {
        maven {
            url  "http://jcenter.bintray.com" 
        }
    }
 
 or just
 
    repositories {
      jcenter()
    }

and then include the dependency:

    runtime(group: 'synapticloop', name: 'lru-cache', version: 'v1.0.0', ext: 'jar')

    compile(group: 'synapticloop', name: 'lru-cache', version: 'v1.0.0', ext: 'jar')
 
or 

    runtime 'synapticloop:lru-cache:v1.0.0'

    compile 'synapticloop:lru-cache:v1.0.0'
    
## Other

You may either download the files from [https://bintray.com/synapticloop/maven/lru-cache/](https://bintray.com/synapticloop/maven/lru-cache/) or from [https://github.com/synapticloop/lru-cache/releases](https://github.com/synapticloop/lru-cache/releases)
