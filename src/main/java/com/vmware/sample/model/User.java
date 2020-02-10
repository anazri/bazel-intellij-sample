package com.vmware.sample.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "User")
public class User {

    @ApiModelProperty(value = "user id", required = true)
    private Integer id;

    @ApiModelProperty(value = "user name", required = true)
    private String name;

    @ApiModelProperty(value = "user sex", required = false)
    private Sex sex;

    @ApiModelProperty(value = "user age", required = false)
    private Integer age;

    @ApiModelProperty(value = "user race", required = false)
    private Race race;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, Sex sex, int age, Race race) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.race = race;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Sex getSex() { return sex; }
    public void setSex(Sex sex) { this.sex = sex; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Race getRace() { return race; }
    public void setRace(Race race) { this.race = race; }
}
