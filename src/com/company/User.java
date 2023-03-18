package com.company;

public class User {

    private  String name;
    private  String id;
    private  String email;


    public User(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }


    static  public  void  userInfo(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Method Hiding Test");
        System.out.println(stringBuffer.toString());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
