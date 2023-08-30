package eje3.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public abstract class Service<T> {
    private ArrayList<T> t;
    public Service(List<T> t) {
        if(t == null)
            this.t = new ArrayList<>();
        else
            this.t = new ArrayList<>(t);
    }
    public Optional<List<T>> getAll(){
        return Optional.of(t);
    }
    public void add(T t){
        this.t.add(t);
    }
    public Boolean remove(T t){
        if(this.t.isEmpty())
            return false;
        return this.t.remove(t);
    }
    public Boolean update(T oldElement, T newElement){
        if(t.isEmpty())
            return false;
        if(!remove(oldElement))
            return false;
        add(newElement);
        return true;
    }
    public Optional<List<T>> sortByComparator(Comparator<T> comparator){
        t.sort(comparator);
        return Optional.of(t);
    }
    public Optional<List<T>> findByAttributeName(String attributeName, Object attributeValue) {
        List<T> filteredItemList = new ArrayList<T>();
        try {
            for (T item : t) {
                String getterMethodName = "get" + attributeName.substring(0,1).toUpperCase() + attributeName.substring(1);
                Object value = item.getClass().getMethod(getterMethodName).invoke(item);
                if (value instanceof String) {
                    if (((String) value).equalsIgnoreCase((String) attributeValue)) {
                        filteredItemList.add(item);
                    }
                } else if (value.equals(attributeValue)) {
                    filteredItemList.add(item);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(filteredItemList);
    }
}