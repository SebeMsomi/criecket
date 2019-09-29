package me.cricket.service.member;

import me.cricket.domain.member.Bowler;
import me.cricket.service.Service;

import java.util.Set;

public interface BowlerService extends Service<Bowler, String> {
    Set<Bowler> getAll();
}
