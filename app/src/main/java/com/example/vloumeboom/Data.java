package com.example.vloumeboom;

public class Data {
    private int age; //나이
    private boolean sex; //성별, 0:여자 1:남자
    private String name; //이름
    private int image; //이미지

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;//제목

    void ProfileData(String name, int image) { //프르필
        this.name = name;
        this.image = image;
    }

    void Account(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
