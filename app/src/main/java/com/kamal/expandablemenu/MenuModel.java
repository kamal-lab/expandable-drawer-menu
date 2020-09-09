package com.kamal.expandablemenu;

public class MenuModel {
    public String menuName;
    public boolean hasChildren;
    public boolean isGroup;

    public MenuModel(String menuName, boolean isGroup, boolean hasChildren) {
        this.hasChildren = hasChildren;
        this.isGroup = isGroup;
        this.menuName = menuName;
    }
}
