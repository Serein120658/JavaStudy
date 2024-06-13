package ooDay05_vis;

/**
 * 复杂季节枚举
 */
public enum Seasons {
    // 枚举对象，枚举对象是常量，枚举对象是固定的
    // 枚举对象是放在第一行的，最后如果有枚举对象，那么枚举对象后面要加逗号
    // 枚举完之后，如果有其他变量或方法，一定要加分号
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冬雪皑皑");

    // 成员私有化，方法公开化
    private String name;
    private String desc;

    // 构造器私有化,枚举的构造方法默认是private
    Seasons(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    // 如果含有成员变量，则需要getter()和setter()规范
    public String getName(){
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public String getDesc(){
        return desc;
    }

    public String setDesc(String desc){
        return this.desc = desc;
    }
}
