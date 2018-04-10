package BTArrayList;

import java.util.ArrayList;

public class BTArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> dsSV = new ArrayList<String>();
        dsSV.add("Hoa");
        dsSV.add("Nam");
        dsSV.add("Lam");
        dsSV.add("Linh");
        dsSV.add("Minh");
        
        //1 in ra so phan tu
        int soPt = dsSV.size();
        System.out.println("So phan tu cua ds la: " + soPt);
        
        //2: Xoa ban ten Hoa khoi danh sach 
        dsSV.remove("Hoa");
        //2' IN ra de xem
        for (int i=0; i<soPt-1; i++)
            System.out.println(dsSV.get(i));
        
        //2'' IN ra de xem cach khac
        for (Object x: dsSV) 
            System.out.println(x.toString());
        
        //3: Kiem tra xem co ten Kien trong ds?
        boolean coKien = dsSV.contains("Kien");
        if (coKien)  
            System.out.println("Co em Kien trong ds");
        else System.out.println("KO CO em Kien trong ds");
    }
}
