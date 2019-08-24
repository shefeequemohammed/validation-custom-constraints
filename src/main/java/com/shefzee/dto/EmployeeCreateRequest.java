package com.shefzee.dto;

import com.shefzee.validator.ValidAge;
import jdk.nashorn.internal.objects.annotations.Getter;

@ValidAge
public class EmployeeCreateRequest implements EmployeeRequest{

    private String id;

    private String firstName;

    private String lastName;

    private Integer age;

    public EmployeeCreateRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
