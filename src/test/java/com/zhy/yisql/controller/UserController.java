package com.zhy.yisql.controller;

import com.zhy.yisql.User;
import com.zhy.yisql.netty.annotation.*;
import com.zhy.yisql.netty.rest.HttpStatus;
import com.zhy.yisql.netty.rest.ResponseEntity;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

//默认为单例，singleton = false表示启用多例。
//@RestController(singleton = false)
@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.status(HttpStatus.CREATED).build("ok");
    }


    static User user = null;
    static {
        user = new User();
        user.setId(1);
        user.setName("Leo");
        user.setAge((short)18);
    }

    @GetMapping("")
    @JsonResponse
    public ResponseEntity<User> listUser() {
        return ResponseEntity.ok().build(user);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> putMethod(@PathVariable("id") int id, @RequestBody String body) {
        user.setId(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMethod(@PathVariable int id) {
        user.setId(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
    @PostMapping("")
    public ResponseEntity<?> postMethod(@RequestBody String body) {
        // 添加用户
        JSONObject json = JSONObject.parseObject(body);
        User user = new User();
        user.setId(json.getIntValue("id"));
        user.setName(json.getString("name"));
        user.setAge(json.getShortValue("age"));
        return ResponseEntity.status(HttpStatus.CREATED).build(user);
    }

    @PostMapping("/2")
    public ResponseEntity<?> postMethod22() {
        return ResponseEntity.status(HttpStatus.CREATED).build("ok");
    }

    @PostMapping("/1")
    public ResponseEntity<?> postMethod2(@UrlEncodedForm Map<String,String> valM) {
        // 添加用户
        User user = new User();
        user.setId(Integer.parseInt(valM.get("id")));
        user.setName(valM.get("name"));
        user.setAge(Short.parseShort(valM.get("age")));
        return ResponseEntity.status(HttpStatus.CREATED).build(user);
    }
}
