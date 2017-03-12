package synapticloop.datastructures;

/*
 * Copyright (c) 2016-2017 Synapticloop.
 * 
 * All rights reserved.
 * 
 * This code may contain contributions from other parties which, where 
 * applicable, will be listed in the default build file for the project 
 * ~and/or~ in a file named CONTRIBUTORS.txt in the root of the project.
 * 
 * This source code and any derived binaries are covered by the terms and 
 * conditions of the Licence agreement ("the Licence").  You may not use this 
 * source code or any derived binaries except in compliance with the Licence.  
 * A copy of the Licence is available in the file named LICENSE.txt shipped with 
 * this source code or binaries.
 */


/**
 * Light-weight POJO for cache statistics gathering
 * 
 * @author synapticloop
 *
 */
public class LruCacheStatistics {
	private int size = 0;
	private int putCount = 0;
	private int evictionCount = 0;
	private int hitCount = 0;
	private int missCount = 0;

	/**
	 * Create a new statistics object with a particular size that should match
	 * the size of the cache
	 * 
	 * @param size the size of the cache
	 */
	public LruCacheStatistics(int size) {
		this.size = size;
	}

	/**
	 * Get the size of the cache
	 * 
	 * @return the size of the cache
	 */
	public int getSize() { return this.size; }

	/**
	 * Get the number of 'put' requests for the lru cache
	 * 
	 * @return the number of put requests for this cache
	 */
	public int getPutCount() { return this.putCount; }

	/**
	 * Get the number of evictions for the lru cache
	 * 
	 * @return the number of evictions for this cache
	 */
	public int getEvictionCount() { return this.evictionCount; }

	/**
	 * Get the number of hits on the cache
	 * 
	 * @return the number of hits on the cache
	 */
	public int getHitCount() { return this.hitCount; }

	/**
	 * Get the number of misses on the lru cache
	 * 
	 * @return the number of misses on the lru cache
	 */
	public int getMissCount() { return this.missCount; }

	/**
	 * Increment the number of 'put' requests
	 */
	public void incrementPutCount() { this.putCount++; }

	/**
	 * Increment the number of evictions for this cache
	 */
	public void incrementEvictionCount() { this.evictionCount++; }

	/**
	 * increment the number of hits on the cache
	 */
	public void incrementHitCount() { this.hitCount++; }

	/**
	 * increment the number of misses on the account
	 */
	public void incrementMissCount() { this.missCount++; }
}
