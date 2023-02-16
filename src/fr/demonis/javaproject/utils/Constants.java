package fr.demonis.javaproject.utils;

import java.awt.*;

public class Constants {
    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int xSize = ((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth());
    public static final int ySize = ((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    
    public static final Font PAGE_TITLE = new Font("serif", Font.BOLD, 20);
    public static final Font BUTTON_FONT = new Font("Serif", Font.PLAIN, 11);
}
