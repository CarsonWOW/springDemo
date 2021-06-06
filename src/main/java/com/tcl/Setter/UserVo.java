package com.tcl.Setter;

public class UserVo {
    private int UserVoid;
    private String name;

    @Override
    public String toString() {
        return "UserVo{" +
                "UserVoid=" + UserVoid +
                ", name='" + name + '\'' +
                '}';
    }

    public int getUserVoid() {
        return UserVoid;
    }

    public String getName() {
        return name;
    }

    public void setUserVoid(int userVoid) {
        UserVoid = userVoid;
    }

    public void setName(String name) {
        this.name = name;
    }
}
