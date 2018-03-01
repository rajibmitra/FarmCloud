package com.webstart.controller;

import com.webstart.DTO.ObservationMeasure;
import com.webstart.model.Notifications;
import com.webstart.model.UserProfile;
import com.webstart.model.Users;
import com.webstart.service.FeatureofInterestService;
import com.webstart.service.UsersService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public @ResponseBody UserProfile getUserProfile(HttpServletRequest httpServletRequest) {
        Users user = new Users();
        user = (Users) httpServletRequest.getSession().getAttribute("current_user");

        UserProfile userprofile = usersService.getUserProfile(user.getUser_id());

        return userprofile;
    }

    @RequestMapping(value = "profile", method = RequestMethod.POST)
    public ResponseEntity<Boolean> saveUserProfile(HttpServletRequest httpServletRequest, @RequestBody UserProfile userprofile) {
        Users user = new Users();
        user = (Users) httpServletRequest.getSession().getAttribute("current_user");
        boolean isDone = usersService.saveUserProfiledata(userprofile);

        return new ResponseEntity<Boolean>(isDone, HttpStatus.CREATED);
    }

    @RequestMapping(value = "notifications", method = RequestMethod.GET)
    public @ResponseBody List<Notifications> getCounterNotifications(HttpServletRequest request) {
        List<Notifications> notificationList = null;
        Users users = (Users) request.getSession().getAttribute("current_user");

        try {
            notificationList = usersService.getUserCounterNotifications(users.getUser_id());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return notificationList;
    }

}
