package org.example.Sources;

public abstract class BaseObject {
    private long Code;
    private String Name;

    public BaseObject(long code, String name) {
        Code = code;
        Name = name;
    }

    public long getCode() {
        return Code;
    }

    public void setCode(long code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
