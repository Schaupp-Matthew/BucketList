package com.example.andriod.bucketlist;

import java.util.HashMap;

public class AppController {

    private HashMap<String, Handler> handlerMap = new HashMap();

    public void handleRequest (String command, HashMap<String, String> data) {
        Handler commandHandler = handlerMap.get(command);
        if (commandHandler != null){
            commandHandler.execute(data);
        }
    }

    public void mapCommand(String command, Handler commandHandler) {
        handlerMap.put(command, commandHandler);
    }
}
