package com.kayeswap.shahajjo;

public class Req_Model {
    String name;
    String phone;
    String blood;
    String location;
    private String relation;
   private String problem;
   private String time;
   private String how;

    public Req_Model() {
    }

    public Req_Model(String id, String name, String phone,
                     String blood, String location, String relation,
                     String problem, String time, String how) {
        this.name = name;
        this.phone = phone;
        this.blood = blood;
        this.location = location;
        this.relation = relation;
        this.problem = problem;
        this.time = time;
        this.how = how;
    }


    public String getName() {
        return name;
    }

    public String getPhone() { return phone; }

    public String getBlood() {
        return blood;
    }

    public String getLocation() { return location; }

    public String getRelation() { return relation; }

    public String getProblem() { return problem; }

    public String getTime() { return time; }

    public String getHow() { return how; }

}
