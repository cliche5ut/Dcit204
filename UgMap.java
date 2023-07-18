package com.group47.upmap;

import java.awt.*;

public class UgMap extends Canvas {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("com\\group47\\upmap\\map_info.png");
        g.drawImage(i, 10,10,this);
    }
}
