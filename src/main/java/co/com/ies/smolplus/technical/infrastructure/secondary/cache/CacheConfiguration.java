package co.com.ies.smolplus.technical.infrastructure.secondary.cache;

import java.time.Duration;
import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;
    public CacheConfiguration(EhcacheProperties ehcacheProperties) {

      long cacheMaxEntries = ehcacheProperties.getMaxEntries();
      long cacheTimeToLiveSecons = ehcacheProperties.getTimeToLiveSeconds();
      jcacheConfiguration =
      Eh107Configuration.fromEhcacheCacheConfiguration(
          CacheConfigurationBuilder
              .newCacheConfigurationBuilder(Object.class, Object.class, ResourcePoolsBuilder.heap(cacheMaxEntries))
              .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(cacheTimeToLiveSecons)))
              .build()
      );
    }

    public static void createCache(javax.cache.CacheManager cm, String cacheName,
            javax.cache.configuration.Configuration<Object, Object> customConfig) {
              javax.cache.Cache<Object, Object> cache = cm.getCache(cacheName);
              if (cache != null) {
                  cache.clear();
              } else {
                  cm.createCache(cacheName, customConfig);
              }
    }

    public void createCache(javax.cache.CacheManager cm, String cacheName) {
      javax.cache.Cache<Object, Object> cache = cm.getCache(cacheName);
      if (cache != null) {
          cache.clear();
      } else {
          cm.createCache(cacheName, jcacheConfiguration);
      }
    }
}
