package me.cricket.domain.member;

import javax.persistence.Column;
import javax.persistence.Id;

public class Bowler {

    @Id
    private String id;
    @Column(name = "description" )
    private String bowlwer;

    private Bowler(){}

    public Bowler(Builder builder) {
        this.id = builder.id;
        this.bowlwer = builder.bowlwer;
    }

    public String getId() {
        return id;
    }

    public String getbowlwer() {
        return bowlwer;
    }

    @Override
    public String toString() {
        return "bowlwer{" +
                "id='" + id + '\'' +
                ", desc='" + bowlwer + '\'' +
                '}';
    }

    public static class Builder{

        private String id, bowlwer;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder bowlwer(String desc) {
            this.bowlwer = bowlwer;
            return this;
        }

        public Bowler build() {
            return new Bowler(this);
        }

    }
}
