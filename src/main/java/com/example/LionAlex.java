package com.example;

import java.util.List;

public class LionAlex extends Lion{

    public LionAlex(Feline feline) throws Exception {
        super(feline, "Male");
    }

    public List<String> getFriends() {
        return List.of("�����", "������", "������");
    }

    public String getPlaceOfLiving(){
        return "���-�������� �������";
    }

    @Override
    public int getKittens(){
        return 0;
    }
}
