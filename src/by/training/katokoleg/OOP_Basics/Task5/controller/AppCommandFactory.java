package controller;

public interface AppCommandFactory {

    AppCommand getAppCommand (String commandName);
}
