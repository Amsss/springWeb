package com.test2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/10 11:34
 * @Modified By：
 */
public class AllSetBean {
    private String[] names;
    private List<Person> personlist;
    private Set<Person> personset;
    private Map<Integer, Person> personmap;
    private Properties personprop;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(List<Person> personlist) {
        this.personlist = personlist;
    }

    public Set<Person> getPersonset() {
        return personset;
    }

    public void setPersonset(Set<Person> personset) {
        this.personset = personset;
    }

    public Map<Integer, Person> getPersonmap() {
        return personmap;
    }

    public void setPersonmap(Map<Integer, Person> personmap) {
        this.personmap = personmap;
    }

    public Properties getPersonprop() {
        return personprop;
    }

    public void setPersonprop(Properties personprop) {
        this.personprop = personprop;
    }
}
