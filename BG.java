// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BG extends World
{

    /**
     * Constructor for objects of class BG.
     */
    public BG()
    {
        super(900, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Balon balon =  new Balon();
        addObject(balon, 824, 106);
        Balon balon2 =  new Balon();
        addObject(balon2, 819, 478);
        Bom bom =  new Bom();
        addObject(bom, 833, 291);
        Bom bom2 =  new Bom();
        addObject(bom2, 658, 506);
        Bom bom3 =  new Bom();
        addObject(bom3, 673, 56);
        Bom bom4 =  new Bom();
        addObject(bom4, 658, 279);
        bom4.setLocation(668, 293);
        Balon balon3 =  new Balon();
        addObject(balon3, 600, 180);
        Balon balon4 =  new Balon();
        addObject(balon4, 594, 403);
        Balon balon5 =  new Balon();
        addObject(balon5, 512, 290);
        Bom bom5 =  new Bom();
        addObject(bom5, 484, 125);
        Bom bom6 =  new Bom();
        addObject(bom6, 480, 443);
        Roket roket =  new Roket();
        addObject(roket, 38, 576);
        roket.setLocation(69, 52);
        roket.setLocation(76, 278);
    }
}
