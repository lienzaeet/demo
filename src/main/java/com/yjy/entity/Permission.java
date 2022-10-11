package com.yjy.entity;

public class Permission {
    private int id;
    private String permission_name;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "permission{" +
                "id=" + id +
                ", permission_name='" + permission_name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
