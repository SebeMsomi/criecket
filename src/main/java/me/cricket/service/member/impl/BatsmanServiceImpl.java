package me.cricket.service.member.impl;

import me.cricket.domain.member.Batsman;
import me.cricket.repository.member.BatsmanRepository;
import me.cricket.service.member.BatsmanService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;

public class BatsmanServiceImpl implements BatsmanService {

    private static BatsmanService genderService = null;

    @Autowired
    private BatsmanRepository batsmanRepository;

    private BatsmanServiceImpl() {

    }

    public static BatsmanService getGenderService() {
        if (genderService == null) genderService = new BatsmanServiceImpl();
        return genderService;
    }

    @Override
    public Batsman create(Batsman b) {
        return this.batsmanRepository.create(b);
    }

    @Override
    public Batsman read(String s) {
        Optional<Batsman> optGender = Optional.ofNullable(this.batsmanRepository.read(s));
        return optGender.orElse(null);
    }

    @Override
    public Batsman update(Batsman b) {
        return this.batsmanRepository.update(b);
    }

    @Override
    public void delete(String s) {
        this.batsmanRepository.delete(s);
    }


    public Batsman retrieveByname(String name) {
        Set<Batsman> batsmen = getAll();
        for (Batsman batsmana : batsmen) {
            if (batsmana.getDesc().equalsIgnoreCase(name)) return batsmana;
        }
        return null;
    }

    @Override
    public Set<Batsman> getAll() {
        return this.batsmanRepository.getAll();
    }
}
