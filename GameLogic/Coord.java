//
package GameLogic;
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-11-29 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 11:53:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "/Users/migueloliveira/Dropbox/projects/stratego/Coord.vdmpp".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import java.util.Set;
import java.util.HashSet;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class Coord implements EvaluatePP {

// ***** VDMTOOLS START Name=x KEEP=NO
  private volatile Number x = null;
// ***** VDMTOOLS END Name=x

// ***** VDMTOOLS START Name=y KEEP=NO
  private volatile Number y = null;
// ***** VDMTOOLS END Name=y

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=CoordSentinel KEEP=NO
  class CoordSentinel extends Sentinel {

    public final int getX = 0;

    public final int getY = 1;

    public final int Coord = 2;

    public final int setPos = 3;

    public final int areEqual = 4;

    public final int nr_functions = 5;


    public CoordSentinel () throws CGException {}


    public CoordSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=CoordSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new CoordSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Coord KEEP=NO
  private void vdm_init_Coord () {
    try {
      setSentinel();
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_Coord


// ***** VDMTOOLS START Name=inv_Coord KEEP=NO
  public Boolean inv_Coord () {
    Boolean rexpr_2 = null;
    Boolean var1_3 = null;
    if ((var1_3 = Boolean.valueOf(x.intValue() >= 1)).booleanValue()) 
      var1_3 = Boolean.valueOf(x.intValue() <= 10);
    if ((rexpr_2 = var1_3).booleanValue()) {
      Boolean var2_10 = null;
      if ((var2_10 = Boolean.valueOf(y.intValue() >= 1)).booleanValue()) 
        var2_10 = Boolean.valueOf(y.intValue() <= 10);
      rexpr_2 = var2_10;
    }
    return rexpr_2;
  }
// ***** VDMTOOLS END Name=inv_Coord


// ***** VDMTOOLS START Name=Coord KEEP=NO
  public Coord () throws CGException {
    vdm_init_Coord();
  }
// ***** VDMTOOLS END Name=Coord


// ***** VDMTOOLS START Name=Coord#2|Number|Number KEEP=NO
  public Coord (final Number x_, final Number y_) throws CGException {
    vdm_init_Coord();
    if (!this.pre_Coord(x_, y_).booleanValue()) 
      UTIL.RunTime("Precondition failure in Coord");
    {
      final Number atom_1 = x_;
      final Number atom_2 = y_;
      x = UTIL.NumberToInt(UTIL.clone(atom_1));
      y = UTIL.NumberToInt(UTIL.clone(atom_2));
    }
  }
// ***** VDMTOOLS END Name=Coord#2|Number|Number


// ***** VDMTOOLS START Name=pre_Coord#2|Number|Number KEEP=NO
  public Boolean pre_Coord (final Number x_, final Number y_) throws CGException {
    Boolean varRes_3 = null;
    Set var2_6 = new HashSet();
    var2_6 = new HashSet();
    for (int count_9 = 1; count_9 <= 10; count_9++) 
      var2_6.add(new Integer(count_9));
    if ((varRes_3 = Boolean.valueOf(UTIL.Contains(var2_6, x_))).booleanValue()) {
      Set var2_14 = new HashSet();
      var2_14 = new HashSet();
      for (int count_17 = 1; count_17 <= 10; count_17++) 
        var2_14.add(new Integer(count_17));
      varRes_3 = Boolean.valueOf(UTIL.Contains(var2_14, y_));
    }
    return varRes_3;
  }
// ***** VDMTOOLS END Name=pre_Coord#2|Number|Number


// ***** VDMTOOLS START Name=getX KEEP=NO
  public Number getX () throws CGException {
    sentinel.entering(((CoordSentinel)sentinel).getX);
    try {
      return x;
    }
    finally {
      sentinel.leaving(((CoordSentinel)sentinel).getX);
    }
  }
// ***** VDMTOOLS END Name=getX


// ***** VDMTOOLS START Name=getY KEEP=NO
  public Number getY () throws CGException {
    sentinel.entering(((CoordSentinel)sentinel).getY);
    try {
      return y;
    }
    finally {
      sentinel.leaving(((CoordSentinel)sentinel).getY);
    }
  }
// ***** VDMTOOLS END Name=getY


// ***** VDMTOOLS START Name=setPos#2|Number|Number KEEP=NO
  public void setPos (final Number x_, final Number y_) throws CGException {
    sentinel.entering(((CoordSentinel)sentinel).setPos);
    try {
      if (!this.pre_setPos(x_, y_).booleanValue()) 
        UTIL.RunTime("Precondition failure in setPos");
      x = UTIL.NumberToInt(UTIL.clone(x_));
      if (!this.inv_Coord().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Coord");
      y = UTIL.NumberToInt(UTIL.clone(y_));
      if (!this.inv_Coord().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Coord");
    }
    finally {
      sentinel.leaving(((CoordSentinel)sentinel).setPos);
    }
  }
// ***** VDMTOOLS END Name=setPos#2|Number|Number


// ***** VDMTOOLS START Name=pre_setPos#2|Number|Number KEEP=NO
  public Boolean pre_setPos (final Number x_, final Number y_) throws CGException {
    Boolean varRes_3 = null;
    Set var2_6 = new HashSet();
    var2_6 = new HashSet();
    for (int count_9 = 1; count_9 <= 10; count_9++) 
      var2_6.add(new Integer(count_9));
    if ((varRes_3 = Boolean.valueOf(UTIL.Contains(var2_6, x_))).booleanValue()) {
      Set var2_14 = new HashSet();
      var2_14 = new HashSet();
      for (int count_17 = 1; count_17 <= 10; count_17++) 
        var2_14.add(new Integer(count_17));
      varRes_3 = Boolean.valueOf(UTIL.Contains(var2_14, y_));
    }
    return varRes_3;
  }
// ***** VDMTOOLS END Name=pre_setPos#2|Number|Number


// ***** VDMTOOLS START Name=areEqual#2|Coord|Coord KEEP=NO
  static public Boolean areEqual (final Coord pos1, final Coord pos2) throws CGException {
    Boolean rexpr_3 = null;
    if ((rexpr_3 = Boolean.valueOf(pos1.getX().intValue() == pos2.getX().intValue())).booleanValue()) 
      rexpr_3 = Boolean.valueOf(pos1.getY().intValue() == pos2.getY().intValue());
    return rexpr_3;
  }
// ***** VDMTOOLS END Name=areEqual#2|Coord|Coord

}
;