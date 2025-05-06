package org;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getUndoManager();

        undo.addCommand("Open curl-braces");
        undo.addCommand("Write a word");
        undo.addCommand("Line break");
        undo.addCommand("Close curl-braces");
        System.out.println(undo.getCommandsList());

        undo.undoLastCommand();
        System.out.println(undo.getCommandsList());
    }
}