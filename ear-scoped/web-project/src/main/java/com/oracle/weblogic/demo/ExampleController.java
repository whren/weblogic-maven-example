package com.oracle.weblogic.demo;

//import com.tangosol.net.CacheFactory;
//import com.tangosol.net.NamedCache;
import java.util.Map;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by IntelliJ IDEA.
 * User: jefwest
 * Date: Oct 19, 2011
 * Time: 10:12:05 AM
 */
@ManagedBean(name = "ExampleControllerBean")
@SessionScoped
public class ExampleController {
  protected static Map<String, String> cache = new HashMap<String, String>();

  public ExampleController() {
    //CacheFactory.ensureCluster();
  }

  private String cacheName;
  private String entryKey;
  private String entryValue;

  public String performCacheGet() {
    //NamedCache cache = CacheFactory.getCache(cacheName);
    entryValue = (String) cache.get(entryKey);
    return "index";
  }

  public String performCachePut() {
    //NamedCache cache = CacheFactory.getCache(cacheName);
    cache.put(entryKey, entryValue);
    return "index";
  }

  public String performCachePurge() {
    cache = new HashMap<String, String>();
    return "index";
  }

  public String getCacheName() {
    return cacheName;
  }

  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }

  public String getEntryKey() {
    return entryKey;
  }

  public void setEntryKey(String entryKey) {
    this.entryKey = entryKey;
  }

  public String getEntryValue() {
    return entryValue;
  }

  public void setEntryValue(String entryValue) {
    this.entryValue = entryValue;
  }
}
