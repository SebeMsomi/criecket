package me.cricket.repository;

public interface Irepository <T, ID> {

    T create(T t);

    T read(ID id);

    T update(T t);

    void delete(ID id);
}
