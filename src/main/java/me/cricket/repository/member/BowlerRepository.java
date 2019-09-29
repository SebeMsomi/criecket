package me.cricket.repository.member;

import me.cricket.domain.member.Bowler;
import me.cricket.repository.Irepository;

import java.util.Set;

public interface BowlerRepository  extends Irepository<Bowler, String> {


    Set<Bowler> getAll();

}
