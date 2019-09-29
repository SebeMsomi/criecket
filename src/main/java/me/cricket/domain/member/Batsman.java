package me.cricket.domain.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Batsman {

    @Id
    private String id;
    @Column(name = "batsman_name" )
    @OneToMany()
    private String name;

    private Batsman() {}

    public Batsman(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return name;
    }

    @Override
    public String toString() {
        return "batsman{" +
                "id='" + id + '\'' +
                ", desc='" + name + '\'' +
                '}';
    }

    public static class Builder{

        private String id, name;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Batsman batsman) {
            this.name = batsman.name;
            this.id = batsman.id;

            return this;
        }

        public Batsman build() {
            return new Batsman(this);
        }
    }
}
