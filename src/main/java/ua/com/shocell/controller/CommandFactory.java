package ua.com.shocell.controller;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static CommandFactory instance;
    private Map<String, Command> comMap = new HashMap();

    private CommandFactory() {
        this.comMap.put("register", new UserRegistrationCommand());
        this.comMap.put("login", new UserLoginCommand());
    }

    public static CommandFactory getInstance() {
        if (instance == null) {
            instance = new CommandFactory();
        }

        return instance;
    }

    public Map<String, Command> getComMap() {
        return this.comMap;
    }

    public Command getCommand(String comName) {
        return (Command)this.comMap.get(comName);
    }
}
