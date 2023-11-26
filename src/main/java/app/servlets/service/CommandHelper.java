package app.servlets.service;

import java.util.HashMap;
import java.util.Map;

import app.servlets.service.impl.*;

public final class CommandHelper {
    private static final CommandHelper instance = new CommandHelper();
    private Map<CommandName, ICommand> commands = new HashMap<>();
    public CommandHelper() {
        //commands.put(CommandName.DO_ANYTHING_CMD, new DoAnythingCommand());
        //commands.put(CommandName.NO_SUCH_CMD, new NoSuchCmd());
    }
    public static CommandHelper getInstance() {
        return instance;
    }
    public ICommand getCommand(String commandName){
        CommandName name = CommandName.valueOf(commandName.toUpperCase());
        ICommand command;
        if ( null != name){
            command = commands.get(name);
        } else{
            command = commands.get(CommandName.NO_SUCH_CMD);
        }
        return command;
    }
}

