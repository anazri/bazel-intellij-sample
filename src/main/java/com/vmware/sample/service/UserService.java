package com.vmware.sample.service;

import com.vmware.sample.model.Race;
import com.vmware.sample.model.Sex;
import com.vmware.sample.model.User;
import com.vmware.sample.utils.Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserService extends ApiService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User(0, "Ray", Sex.MALE, 30, Race.YELLOW_RACE));
        this.users.add(new User(1, "Lily", Sex.FEMALE, 23, Race.WHITE_RACE));
        this.users.add(new User(2, "Bob", Sex.MALE, 45, Race.BLACK_RACE));
    }

    public Response obtainAllUsers() {
        return setResultSuccess(users);
    }

    public Response obtainUserById(int id) {
        List<User> users = new ArrayList<>();

        for (User _user : this.users) {
            if (_user.getId().equals(id)) {
                users.add(_user);
            }
        }

        if (users.size() == 0) {
            return setResultError(String.format("There are no user with ID %s.", id));
        } else {
            return setResultSuccess(users);
        }
    }

    public Response obtainUserByName(String name) {
        List<User> users = new ArrayList<>();

        for (User _user : this.users) {
            if (_user.getName().toLowerCase().contains(name.toLowerCase())) {
                users.add(_user);
            }
        }

        if (users.size() == 0) {
            return setResultError(String.format("There are no user with name %s.", name));
        } else {
            return setResultSuccess(users);
        }
    }

    public Response createUser(User user) {
        int id = user.getId();

        for (User _user: this.users) {
            if (_user.getId() == id) {
                return setResultError(String.format("The user with ID %d already exists, please do not add again", id));
            }
        }
        this.users.add(user);
        return setResultSuccess();
    }

    public Response updateUserById(int id, User user) {
        for (User _user: this.users) {
            if (_user.getId() == id) {
                this.users.remove(_user);
                this.users.add(user);
                return setResultSuccess();
            }
        }
        return setResultError(String.format("The user with ID %s no longer exists.", id));
    }

    public Response deleteUserById(int id) {
        for (User _user: this.users) {
            if (_user.getId().equals(id)) {
                this.users.remove(_user);
                return setResultSuccess();
            }
        }
        return setResultError(String.format("The user with ID %s no longer exists.", id));
    }
}
