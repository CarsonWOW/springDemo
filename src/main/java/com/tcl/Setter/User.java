package com.tcl.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class User {
    private int UserId;
    private String name;
    private Map map;
    private List list;
    private String str[];
    private UserVo userVo;

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", map=" + map +
                ", list=" + list +
                ", str=" + Arrays.toString(str) +
                '}';
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setStr(String[] str) {
        this.str = str;
    }
}
