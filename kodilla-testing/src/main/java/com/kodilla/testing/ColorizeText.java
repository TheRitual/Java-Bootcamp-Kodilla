package com.kodilla.testing;

public class ColorizeText {
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";
    private boolean isColorized;

    public void setColorized(boolean colorized) {
        isColorized = colorized;
    }

    public ColorizeText(boolean colorize){
        this.isColorized = colorize;
    }

    private String colorize(String color, String txt) {
        if(isColorized) {
            return color + txt + RESET;
        }else
        {
            return txt;
        }
    }

    public String blue(String txt) {
        return colorize(BLUE,txt);
    }

    public String black(String txt) {
        return colorize(BLACK,txt);
    }

    public String red(String txt) {
        return colorize(RED,txt);
    }

    public String green(String txt) {
        return colorize(GREEN,txt);
    }

    public String yellow(String txt) {
        return colorize(YELLOW,txt);
    }

    public String purple(String txt) {
        return colorize(PURPLE,txt);
    }

    public String cyan(String txt) {
        return colorize(CYAN,txt);
    }

    public String white(String txt) {
        return colorize(WHITE,txt);
    }
}
