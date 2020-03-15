package controller;

public enum AppCommandName {
    CREATEBOUQUET ("-crb"),
    WATCHFLOWERS("-wf"),
    WATCHWRAPPERS("-ww"),
    WATCHBOUQUET("-wb"),
    ADDFLOWER("-adfl"),
    ADDWRAPPER("-adwr"),
    REMOVEFLOWER ("-rmfl"),
    SAVEBOUQUET ("-svb"),
    REMOVEWRAPPER("-rmwr");

    private final String shortCommand;

    AppCommandName(String s) {
        this.shortCommand = s;
    }

    public static AppCommandName fromString(String name) {

        final AppCommandName[] values = AppCommandName.values();
        for (AppCommandName commandName : values) {
            if (commandName.shortCommand.equals(name) || commandName.name().equals(name)) {
                return commandName;
            }
        }
        return null;
    }
}
