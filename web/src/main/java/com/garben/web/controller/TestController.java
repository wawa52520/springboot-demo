package com.garben.web.controller;

import com.garben.business.entity.Annoyance;
import com.garben.business.entity.Sneeze;
import com.garben.business.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/listTest")
    @ResponseBody
    public List listTest() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    @RequestMapping("/hashMapTest")
    @ResponseBody
    public Map mapTest() {
        Map<String, String> map = new HashMap();
        for (int i = 0; i < 1000; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        return map;
    }

    @RequestMapping("/linkedHashMapTest")
    @ResponseBody
    public Map linkedHashMapTest() {
        Map<String, String> map = new LinkedHashMap();
        for (int i = 0; i < 1000; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
        }
        return map;
    }

    @RequestMapping("/streamTest")
    @ResponseBody
    public void streamTest() {
        User userA = new User();
        userA.setId(1);
        userA.setUserName("userA");
        userA.setPassWord("passwordA");
        userA.setRealName("realA");
        User userB = new User();
        userB.setId(2);
        userB.setUserName("userB");
        userB.setPassWord("passwordB");
        userB.setRealName("realB");
        User userC = new User();
        userC.setId(3);
        userC.setUserName("userC");
        userC.setPassWord("passwordC");
        userC.setRealName("realC");

        List<User> names = new ArrayList<>();
        names.add(userA);
        names.add(userB);
        names.add(userC);

        Stream<User> userStream = names.stream().filter(x -> x.getUserName().equals("userB"));
        Object[] array = userStream.toArray();
        boolean anyMatch = names.stream().anyMatch(x -> x.getUserName().equals("userA"));
    }

    /**
     * @description: ??????????????????
     * @author: yaojiabin
     * @date: 2022/1/27 15:54
     */
    @RequestMapping("/getNowDate")
    @ResponseBody
    public String getNowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    /**
     * @description: ??????????????????n?????????????????????
     * @author: yaojiabin
     * @date: 2022/1/27 15:53
     */
    @RequestMapping("/getMonth/{month}")
    @ResponseBody
    public String getMonth(@PathVariable("month") Integer month) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();//????????????

        calendar.setTime(new Date());//??????????????????
        calendar.add(Calendar.MONTH, -month);//?????????n
        System.out.println(sdf.format(calendar.getTime()));//?????????n???????????????
        System.out.println(sdf.format(new Date()));//??????????????????

        return sdf.format(calendar.getTime());
    }

    /**
     * @description: ??????????????????????????????
     * @author: yaojiabin
     * @date: 2022/1/27 15:53
     */
    @RequestMapping("/getHalfDay")
    @ResponseBody
    public String getHalfMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();//????????????

        calendar.setTime(new Date());//??????????????????
        calendar.add(Calendar.DATE, -15);//?????????n
        System.out.println(sdf.format(calendar.getTime()));//?????????n???????????????
        System.out.println(sdf.format(new Date()));//??????????????????

        return sdf.format(calendar.getTime());
    }

    //    ????????????
    public static int fibonacci(int i) {
        if (i == 1)
            return 0;
        if (i == 2)
            return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public void arrTest() {
        List list = new ArrayList();
        List<Object> synchronizedList = Collections.synchronizedList(list);
    }

    public void setTest(){
    }

    public static void main(String[] args){

    }

}
