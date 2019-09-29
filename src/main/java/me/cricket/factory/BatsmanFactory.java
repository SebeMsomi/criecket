package me.cricket.factory;

import me.cricket.domain.member.Batsman;
import me.cricket.misc.Misc;

public class BatsmanFactory {

    public static Batsman getBatsman (String name) {

        return new Batsman.Builder()
                .id(Misc.generateId())
                .name(name)
                .build();
    }
}
