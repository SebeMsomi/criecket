package me.cricket.repository.member.impl;

import me.cricket.domain.member.Batsman;
import me.cricket.factory.BatsmanFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatsmanRepositoryImplTest {
    // @Autowired
    private BatsmanRepositoryImpl repository;

    private Batsman batsman;

    @Before
    public void setUp() throws Exception {
        repository = BatsmanRepositoryImpl.getRepository();
        batsman = BatsmanFactory.getBatsman("Sebe");
    }


    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void create() {
        repository.create(batsman);
        assertNotNull(repository.read(batsman.getId()));
        System.out.println("Created\n" + repository.read("1"));
    }

    @Test
    public void read() {
        Batsman b = BatsmanFactory.getBatsman("Sebe");

        repository.create(b);

        assertNotNull(repository.getAll());

        Batsman bb = repository.read(b.getId());

        assertEquals(b.getId(), bb.getId());
    }

    @Test
    public void update() {
        Batsman b = BatsmanFactory.getBatsman("Sebe");

        repository.create(b);
        System.out.println(repository.read("1"));
    }

    @Test
    public void delete() {
        repository.delete(batsman.getId());
        assertNull(repository.read("1"));
        System.out.println("Deleted\n" + repository.read("1"));
    }

    @Test
    public void getAll() {
        repository.create(batsman); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

}