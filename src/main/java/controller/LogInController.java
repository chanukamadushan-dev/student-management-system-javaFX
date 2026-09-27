package controller;

public class LogInController {
    public boolean checkUserNameAndPassword(String name, String password) {
        if(name.equals("pamod") && password.equals("2004")){
            return true;
        }
        return false;
    }
}
