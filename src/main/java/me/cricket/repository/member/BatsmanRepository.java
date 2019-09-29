package me.cricket.repository.member;

import me.cricket.domain.member.Batsman;
import me.cricket.repository.Irepository;

import java.util.Set;

public interface BatsmanRepository  extends Irepository<Batsman, String> {


    Set<Batsman> getAll();
}
