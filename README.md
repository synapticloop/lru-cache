<a name="documentr_top"></a>

> **This project requires JVM version of at least 1.7**






<a name="documentr_heading_0"></a>

# lru-cache <sup><sup>[top](#)</sup></sup>



> lru-cache






<a name="documentr_heading_1"></a>

# Table of Contents <sup><sup>[top](#)</sup></sup>



 - [lru-cache](#documentr_heading_0)
 - [Table of Contents](#documentr_heading_1)
 - [Usage](#documentr_heading_2)
 - [Building the Package](#documentr_heading_3)
   - [*NIX/Mac OS X](#documentr_heading_4)
   - [Windows](#documentr_heading_5)
 - [Running the Tests](#documentr_heading_6)
   - [*NIX/Mac OS X](#documentr_heading_7)
   - [Windows](#documentr_heading_8)
   - [Dependencies - Gradle](#documentr_heading_9)
   - [Dependencies - Maven](#documentr_heading_10)
   - [Dependencies - Downloads](#documentr_heading_11)


A small (~3k) Least Recently Used cache implementation.



<a name="documentr_heading_2"></a>

# Usage <sup><sup>[top](#)</sup></sup>




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





<a name="documentr_heading_3"></a>

# Building the Package <sup><sup>[top](#)</sup></sup>



<a name="documentr_heading_4"></a>

## *NIX/Mac OS X <sup><sup>[top](#)</sup></sup>

From the root of the project, simply run

`./gradlew build`




<a name="documentr_heading_5"></a>

## Windows <sup><sup>[top](#)</sup></sup>

`./gradlew.bat build`


This will compile and assemble the artefacts into the `build/libs/` directory.

Note that this may also run tests (if applicable see the Testing notes)



<a name="documentr_heading_6"></a>

# Running the Tests <sup><sup>[top](#)</sup></sup>



<a name="documentr_heading_7"></a>

## *NIX/Mac OS X <sup><sup>[top](#)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`gradlew --info test`



<a name="documentr_heading_8"></a>

## Windows <sup><sup>[top](#)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`./gradlew.bat --info test`


The `--info` switch will also output logging for the tests



<a name="documentr_heading_9"></a>

## Dependencies - Gradle <sup><sup>[top](#)</sup></sup>



```
dependencies {
	runtime(group: 'synapticloop', name: 'lru-cache', version: '2.0.1', ext: 'jar')

	compile(group: 'synapticloop', name: 'lru-cache', version: '2.0.1', ext: 'jar')
}
```



or, more simply for versions of gradle greater than 2.1



```
dependencies {
	runtime 'synapticloop:lru-cache:2.0.1'

	compile 'synapticloop:lru-cache:2.0.1'
}
```





<a name="documentr_heading_10"></a>

## Dependencies - Maven <sup><sup>[top](#)</sup></sup>



```
<dependency>
	<groupId>synapticloop</groupId>
	<artifactId>lru-cache</artifactId>
	<version>2.0.1</version>
	<type>jar</type>
</dependency>
```





<a name="documentr_heading_11"></a>

## Dependencies - Downloads <sup><sup>[top](#)</sup></sup>


You will also need to download the following dependencies:



### cobertura dependencies

  - `net.sourceforge.cobertura:cobertura:2.0.3`: (It may be available on one of: [bintray](https://bintray.com/net.sourceforge.cobertura/maven/cobertura/2.0.3/view#files/net.sourceforge.cobertura/cobertura/2.0.3) [mvn central](http://search.maven.org/#artifactdetails|net.sourceforge.cobertura|cobertura|2.0.3|jar))


### testCompile dependencies

  - `junit:junit:4.12`: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))


### testRuntime dependencies

  - `junit:junit:4.12`: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))

**NOTE:** You may need to download any dependencies of the above dependencies in turn (i.e. the transitive dependencies)

--

> `This README.md file was hand-crafted with care utilising synapticloop`[`templar`](https://github.com/synapticloop/templar/)`->`[`documentr`](https://github.com/synapticloop/documentr/)

--
