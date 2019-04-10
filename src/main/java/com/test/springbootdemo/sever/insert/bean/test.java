package com.test.springbootdemo.sever.insert.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
*@Author：Pandong
*@Description
*@Date:Created in 15:32 2019/4/9
*@Modified By:
*/
public  class  test {
   public void test(){
       HashMap map = new HashMap();
       map.put("123","123");
       map.get("123");
       ArrayList list = new ArrayList();
       String a1 = "柳柴";
       String a2 = "柴柕";
       System.out.println(a1.hashCode());
       System.out.println(a2.hashCode());
   }

}
