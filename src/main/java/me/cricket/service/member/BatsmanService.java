package me.cricket.service.member;

import me.cricket.domain.member.Batsman;
import me.cricket.service.Service;

import java.util.Set;

public interface BatsmanService  extends Service<Batsman, String> {
    Set<Batsman> getAll();
}
