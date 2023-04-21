package me.whiteship.chapter01.item07.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class PostRepository {
    private Map<Object, Post> cache;

    public PostRepository() {
        this.cache = new WeakHashMap<>();
    }

    public Post getPostById(Object key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            Post post = new Post();
            cache.put(key, post);
            return post;
        }
    }

    public Map<Object, Post> getCache() {
        return cache;
    }
}
