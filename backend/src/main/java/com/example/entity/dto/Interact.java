package com.example.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Author: 程凯
 * @Package: com.example.entity.dto
 * @Project: jwt
 * @Name: Interact
 * @Date: 2024/10/9  上午10:20
 */
@Data
@AllArgsConstructor
public class Interact {
    int tid;
    Integer uid;
    Date time;
    String type;

    public String toKey(){
        return tid + ":" + uid;
    }

    public static Interact parseInteract(String str,String type){
        String[] keys = str.split(":");
        return  new Interact(Integer.parseInt(keys[0]), Integer.parseInt(keys[1]), new Date(), type);
    }
}
