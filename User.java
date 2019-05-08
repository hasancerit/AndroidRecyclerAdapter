package com.example.hasan.recyleview;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String isim;
    private String numara;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public static ArrayList<User> getList(){
        ArrayList<User> list = new ArrayList<>();
        String[] isimler = {"Hasan","Hüseyin","Faruk","Onur","Kazım","Hasan","Hüseyin","Faruk","Onur","Kazım"};
        String[] numaralar = {"123","1234","231","312","543","123","1234","231","312","543"};

        for(int i = 0 ; i < isimler.length ; i++){
            User temp = new User();
            temp.setIsim(isimler[i]);
            temp.setNumara(numaralar[i]);
            list.add(temp);
        }

        return list;
    }
}
