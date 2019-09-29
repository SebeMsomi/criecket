package me.cricket.repository.member.impl;

import me.cricket.domain.member.Batsman;
import me.cricket.repository.member.BatsmanRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BatsmanRepositoryImpl implements BatsmanRepository {
    private static BatsmanRepositoryImpl repository = null;
    private Map<String, Batsman> batsmans;



    public static BatsmanRepositoryImpl getRepository(){
        if (repository == null) {
            return new BatsmanRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Batsman create(Batsman batsman){
        this.batsmans.put(batsman.getId(),batsman);
        return batsman;
    }

    @Override
    public Batsman read(String batId){
        return this.batsmans.get(batId);
    }

    @Override
    public void delete(String batsmanId) {
        this.batsmans.remove(batsmanId);
    }

    @Override
    public Batsman update(Batsman batsman) {
        this.batsmans.replace(batsman.getId(),batsman);
        return this.batsmans.get(batsman.getId());
    }

    @Override
    public Set<Batsman> getAll() {
        return new HashSet<>(batsmans.values());
    }

}
