package com.vmware.sample.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

import com.vmware.sample.model.User;
import com.vmware.sample.utils.Response;
import com.vmware.sample.service.UserService;

@Api(tags = "User info.")
@RestController
@RequestMapping(value = "/api/v1")
public class UserController extends UserService {

    @ApiOperation(value = "Obtain all users info.")
    @GetMapping(value = "/users")
    public Response obtain() {
        return obtainAllUsers();
    }

    @ApiOperation(value = "Obtain user info by ID.")
    @GetMapping(value = "/user/{id}")
    public Response obtain(@PathVariable int id) {
        return obtainUserById(id);
    }

    @ApiOperation(value = "Obtain user info by name.")
    @GetMapping(value = "/user")
    public Response obtain(@RequestParam String name) {
        return obtainUserByName(name);
    }

    @ApiOperation(value = "Create a new user.")
    @PostMapping(value = "/user")
    public Response create(@RequestBody User user) {
        return createUser(user);
    }

    @ApiOperation(value = "Update an existing user info.")
    @PutMapping(value = "/user/{id}")
    public Response update(@PathVariable int id, @RequestBody User user) {
        return updateUserById(id, user);
    }

    @ApiOperation(value = "Delete a user by ID.")
    @DeleteMapping(value = "/user/{id}")
    public Response delete(@PathVariable int id) {
        return deleteUserById(id);
    }
}
