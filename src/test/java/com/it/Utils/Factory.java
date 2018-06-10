package com.it.Utils;

import com.it.Utils.Users.User;

public class Factory {
   public static class Users {
       // static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser() {
            return new User("ittest2",
                    "337774a",
                    "ittest2@i.ua");
        }

        public static User getRandomUser() {
            return new User("ira",
                    "dhhhd",
                    "asd@i.ua");
        }

    }
}
