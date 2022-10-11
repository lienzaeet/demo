package com.yjy.entity;

public class Role {
    private int id;
    private String rolename;
    private char available;
    private String roledes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public char getAvailable() {
        return available;
    }

    public void setAvailable(char available) {
        this.available = available;
    }

    public String getRoledes() {
        return roledes;
    }

    public void setRoledes(String roledes) {
        this.roledes = roledes;
    }

    @Override
    public String toString() {
        return "role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", available=" + available +
                ", roledes='" + roledes + '\'' +
                '}';
    }
}
