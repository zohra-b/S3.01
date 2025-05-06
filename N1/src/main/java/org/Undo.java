package org;

import java.util.LinkedList;

public class Undo{

    private LinkedList<Object> commandsList = new LinkedList<>();
    private static Undo undoManager = new Undo();

    private Undo(){
    }

    public static Undo getUndoManager() {
        if (undoManager == null) {
            undoManager = new Undo();
        }
        return undoManager;
    }

    public LinkedList getCommandsList() {
        return commandsList;
    }

    public void addCommand(Object command){
        commandsList.add(command);
    }

    public void undoLastCommand(){
        commandsList.removeLast();
    }


    @Override
    public String toString() {
        return "Undo{" +
                "commandsList=" + commandsList +
                '}';
    }
}

