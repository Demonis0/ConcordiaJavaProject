package fr.demonis.javaproject.utils;

import java.awt.*;
import java.awt.Toolkit;
public class Constants {
    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int xSize = ((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    public static final int ySize = ((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
}
