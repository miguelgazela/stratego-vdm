//
package GameLogic;
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-03 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "C:\\Users\\Miguel\\Dropbox\\projects\\stratego\\Player/Player.vdmpp".

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Record;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class Player implements EvaluatePP {

// ***** VDMTOOLS START Name=name KEEP=NO
  private volatile String name = null;
// ***** VDMTOOLS END Name=name

// ***** VDMTOOLS START Name=score KEEP=NO
  private volatile Number score = null;
// ***** VDMTOOLS END Name=score

// ***** VDMTOOLS START Name=pieces KEEP=NO
  public volatile List pieces = null;
// ***** VDMTOOLS END Name=pieces

// ***** VDMTOOLS START Name=deadPieces KEEP=NO
  private volatile List deadPieces = null;
// ***** VDMTOOLS END Name=deadPieces

// ***** VDMTOOLS START Name=color KEEP=NO
  private volatile Object color = null;
// ***** VDMTOOLS END Name=color

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=PlayerSentinel KEEP=NO
  class PlayerSentinel extends Sentinel {

    public final int Player = 0;

    public final int getName = 1;

    public final int addPiece = 2;

    public final int getColor = 3;

    public final int getScore = 4;

    public final int incScore = 5;

    public final int getPieces = 6;

    public final int setPieces = 7;

    public final int placePiece = 8;

    public final int resetScore = 9;

    public final int addDeadPiece = 10;

    public final int getNextPiece = 11;

    public final int removePieces = 12;

    public final int getDeadPieces = 13;

    public final int removeDeadPieces = 14;

    public final int nr_functions = 15;


    public PlayerSentinel () throws CGException {}


    public PlayerSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=PlayerSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new PlayerSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Player KEEP=NO
  private void vdm_init_Player () {
    try {
      setSentinel();
      score = new Integer(0);
      pieces = new ArrayList();
      deadPieces = new ArrayList();
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_Player


// ***** VDMTOOLS START Name=inv_Player KEEP=NO
  public Boolean inv_Player () throws CGException {
    Boolean rexpr_2 = null;
    if ((rexpr_2 = Boolean.valueOf(name.length() > 0)).booleanValue()) {
      Boolean var2_7 = null;
      if ((var2_7 = Boolean.valueOf(score.intValue() >= 0)).booleanValue()) {
        Boolean var2_11 = null;
        if ((var2_11 = Boolean.valueOf(pieces.size() <= 40)).booleanValue()) {
          Boolean var2_16 = null;
          boolean tmpQuant_19 = false;
          {
            Set e1_set_22 = new HashSet(pieces);
            Piece p1 = null;
            Piece p2 = null;
            Set e_set_34 = e1_set_22;
            Set tmpSet_37 = new HashSet(e_set_34);
            for (Iterator enm_36 = tmpSet_37.iterator(); enm_36.hasNext() && !tmpQuant_19; ) {
              Piece elem_35 = (Piece)enm_36.next();
              /* p2 */
              p2 = elem_35;
              Set tmpSet_33 = new HashSet(e1_set_22);
              for (Iterator enm_32 = tmpSet_33.iterator(); enm_32.hasNext() && !tmpQuant_19; ) {
                Piece elem_31 = (Piece)enm_32.next();
                /* p1 */
                p1 = elem_31;
                Boolean pred_23 = null;
                if ((pred_23 = Boolean.valueOf(!UTIL.equals(p1, p2))).booleanValue()) 
                  pred_23 = Boolean.valueOf(!UTIL.equals(p1.getColor(), p2.getColor()));
                if (pred_23.booleanValue()) 
                  tmpQuant_19 = true;
              }
            }
          }
          if ((var2_16 = Boolean.valueOf(!tmpQuant_19)).booleanValue()) {
            Boolean var2_38 = null;
            if ((var2_38 = Boolean.valueOf(deadPieces.size() <= 40)).booleanValue()) {
              Boolean var2_43 = null;
              boolean tmpQuant_46 = false;
              {
                Set e1_set_49 = new HashSet(deadPieces);
                Piece p1 = null;
                Piece p2 = null;
                Set e_set_61 = e1_set_49;
                Set tmpSet_64 = new HashSet(e_set_61);
                for (Iterator enm_63 = tmpSet_64.iterator(); enm_63.hasNext() && !tmpQuant_46; ) {
                  Piece elem_62 = (Piece)enm_63.next();
                  /* p2 */
                  p2 = elem_62;
                  Set tmpSet_60 = new HashSet(e1_set_49);
                  for (Iterator enm_59 = tmpSet_60.iterator(); enm_59.hasNext() && !tmpQuant_46; ) {
                    Piece elem_58 = (Piece)enm_59.next();
                    /* p1 */
                    p1 = elem_58;
                    Boolean pred_50 = null;
                    if ((pred_50 = Boolean.valueOf(!UTIL.equals(p1, p2))).booleanValue()) 
                      pred_50 = Boolean.valueOf(!UTIL.equals(p1.getColor(), p2.getColor()));
                    if (pred_50.booleanValue()) 
                      tmpQuant_46 = true;
                  }
                }
              }
              if ((var2_43 = Boolean.valueOf(!tmpQuant_46)).booleanValue()) {
                Set var2_67 = new HashSet();
                var2_67.add(new quotes.Blue());
                var2_67.add(new quotes.Red());
                var2_43 = Boolean.valueOf(UTIL.Contains(var2_67, color));
              }
              var2_38 = var2_43;
            }
            var2_16 = var2_38;
          }
          var2_11 = var2_16;
        }
        var2_7 = var2_11;
      }
      rexpr_2 = var2_7;
    }
    return rexpr_2;
  }
// ***** VDMTOOLS END Name=inv_Player


// ***** VDMTOOLS START Name=Player KEEP=NO
  public Player () throws CGException {
    vdm_init_Player();
  }
// ***** VDMTOOLS END Name=Player


// ***** VDMTOOLS START Name=Player#2|String|Object KEEP=NO
  public Player (final String name_, final Object color_) throws CGException {
    vdm_init_Player();
    if (!this.pre_Player(name_, color_).booleanValue()) 
      UTIL.RunTime("Precondition failure in Player");
    {
      final String atom_1 = name_;
      final Object atom_2 = color_;
      name = UTIL.ConvertToString(UTIL.clone(atom_1));
      color = UTIL.clone(atom_2);
    }
  }
// ***** VDMTOOLS END Name=Player#2|String|Object


// ***** VDMTOOLS START Name=pre_Player#2|String|Object KEEP=NO
  public Boolean pre_Player (final String name_, final Object color_) throws CGException {
    Boolean varRes_3 = null;
    if ((varRes_3 = Boolean.valueOf(name_.length() > 0)).booleanValue()) {
      Set var2_10 = new HashSet();
      var2_10.add(new quotes.Blue());
      var2_10.add(new quotes.Red());
      varRes_3 = Boolean.valueOf(UTIL.Contains(var2_10, color_));
    }
    return varRes_3;
  }
// ***** VDMTOOLS END Name=pre_Player#2|String|Object


// ***** VDMTOOLS START Name=getName KEEP=NO
  public String getName () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getName);
    try {
      return name;
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getName);
    }
  }
// ***** VDMTOOLS END Name=getName


// ***** VDMTOOLS START Name=getColor KEEP=NO
  public Object getColor () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getColor);
    try {
      return color;
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getColor);
    }
  }
// ***** VDMTOOLS END Name=getColor


// ***** VDMTOOLS START Name=getPieces KEEP=NO
  public List getPieces () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getPieces);
    try {
      return pieces;
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getPieces);
    }
  }
// ***** VDMTOOLS END Name=getPieces


// ***** VDMTOOLS START Name=getDeadPieces KEEP=NO
  public List getDeadPieces () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getDeadPieces);
    try {
      return deadPieces;
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getDeadPieces);
    }
  }
// ***** VDMTOOLS END Name=getDeadPieces


// ***** VDMTOOLS START Name=getScore KEEP=NO
  public Number getScore () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getScore);
    try {
      return score;
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getScore);
    }
  }
// ***** VDMTOOLS END Name=getScore


// ***** VDMTOOLS START Name=addPiece#1|Piece KEEP=NO
  public void addPiece (final Piece p) throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).addPiece);
    try {
      if (!this.pre_addPiece(p).booleanValue()) 
        UTIL.RunTime("Precondition failure in addPiece");
      pieces.add(p);
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).addPiece);
    }
  }
// ***** VDMTOOLS END Name=addPiece#1|Piece


// ***** VDMTOOLS START Name=pre_addPiece#1|Piece KEEP=NO
  public Boolean pre_addPiece (final Piece p) throws CGException {
    Boolean varRes_2 = null;
    if ((varRes_2 = Boolean.valueOf(!UTIL.Contains(new HashSet(pieces), p))).booleanValue()) 
      varRes_2 = Boolean.valueOf(UTIL.equals(p.getColor(), color));
    return varRes_2;
  }
// ***** VDMTOOLS END Name=pre_addPiece#1|Piece


// ***** VDMTOOLS START Name=setPieces#1|List KEEP=NO
  public void setPieces (final List pieces_) throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).setPieces);
    try {
      if (!this.pre_setPieces(pieces_).booleanValue()) 
        UTIL.RunTime("Precondition failure in setPieces");
      pieces = UTIL.ConvertToList(UTIL.clone(pieces_));
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).setPieces);
    }
  }
// ***** VDMTOOLS END Name=setPieces#1|List


// ***** VDMTOOLS START Name=pre_setPieces#1|List KEEP=NO
  public Boolean pre_setPieces (final List pieces_) throws CGException {
    Boolean varRes_2 = null;
    Boolean var1_3 = null;
    if ((var1_3 = Boolean.valueOf(UTIL.equals(pieces, new ArrayList()))).booleanValue()) 
      var1_3 = Boolean.valueOf(pieces_.size() == 40);
    if ((varRes_2 = var1_3).booleanValue()) {
      boolean tmpQuant_13 = false;
      {
        Set e1_set_16 = new HashSet(pieces_);
        Piece piece = null;
        Set tmpSet_23 = new HashSet(e1_set_16);
        for (Iterator enm_22 = tmpSet_23.iterator(); enm_22.hasNext() && !tmpQuant_13; ) {
          Piece elem_21 = (Piece)enm_22.next();
          /* piece */
          piece = elem_21;
          if (!UTIL.equals(piece.getColor(), color)) 
            tmpQuant_13 = true;
        }
      }
      varRes_2 = Boolean.valueOf(!tmpQuant_13);
    }
    return varRes_2;
  }
// ***** VDMTOOLS END Name=pre_setPieces#1|List


// ***** VDMTOOLS START Name=removePieces KEEP=NO
  public void removePieces () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).removePieces);
    try {
      if (!this.pre_removePieces().booleanValue()) 
        UTIL.RunTime("Precondition failure in removePieces");
      List rhs_2 = new ArrayList();
      if (!(((Object)rhs_2) instanceof List)) 
        UTIL.RunTime("Incompatible type");
      pieces = UTIL.ConvertToList(UTIL.clone(rhs_2));
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).removePieces);
    }
  }
// ***** VDMTOOLS END Name=removePieces


// ***** VDMTOOLS START Name=pre_removePieces KEEP=NO
  public Boolean pre_removePieces () throws CGException {
    return Boolean.valueOf(!UTIL.equals(pieces, new ArrayList()));
  }
// ***** VDMTOOLS END Name=pre_removePieces


// ***** VDMTOOLS START Name=removeDeadPieces KEEP=NO
  public void removeDeadPieces () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).removeDeadPieces);
    try {
      if (!this.pre_removeDeadPieces().booleanValue()) 
        UTIL.RunTime("Precondition failure in removeDeadPieces");
      List rhs_2 = new ArrayList();
      if (!(((Object)rhs_2) instanceof List)) 
        UTIL.RunTime("Incompatible type");
      deadPieces = UTIL.ConvertToList(UTIL.clone(rhs_2));
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).removeDeadPieces);
    }
  }
// ***** VDMTOOLS END Name=removeDeadPieces


// ***** VDMTOOLS START Name=pre_removeDeadPieces KEEP=NO
  public Boolean pre_removeDeadPieces () throws CGException {
    return Boolean.valueOf(!UTIL.equals(deadPieces, new ArrayList()));
  }
// ***** VDMTOOLS END Name=pre_removeDeadPieces


// ***** VDMTOOLS START Name=placePiece KEEP=NO
  public Piece placePiece () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).placePiece);
    try {
      if (!this.pre_placePiece().booleanValue()) 
        UTIL.RunTime("Precondition failure in placePiece");
      {
        Piece piece = null;
        piece = (Piece)UTIL.clone((Piece)pieces.get(0));
        if (!this.inv_Player().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Player");
        pieces = new ArrayList(pieces.subList(1, pieces.size()));
        if (!this.inv_Player().booleanValue()) 
          UTIL.RunTime("Instance invariant failure in Player");
        return piece;
      }
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).placePiece);
    }
  }
// ***** VDMTOOLS END Name=placePiece


// ***** VDMTOOLS START Name=pre_placePiece KEEP=NO
  public Boolean pre_placePiece () throws CGException {
    return Boolean.valueOf(pieces.size() > 0);
  }
// ***** VDMTOOLS END Name=pre_placePiece


// ***** VDMTOOLS START Name=getNextPiece KEEP=NO
  public Piece getNextPiece () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).getNextPiece);
    try {
      if (!this.pre_getNextPiece().booleanValue()) 
        UTIL.RunTime("Precondition failure in getNextPiece");
      return (Piece)pieces.get(0);
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).getNextPiece);
    }
  }
// ***** VDMTOOLS END Name=getNextPiece


// ***** VDMTOOLS START Name=pre_getNextPiece KEEP=NO
  public Boolean pre_getNextPiece () throws CGException {
    return Boolean.valueOf(pieces.size() > 0);
  }
// ***** VDMTOOLS END Name=pre_getNextPiece


// ***** VDMTOOLS START Name=addDeadPiece#1|Piece KEEP=NO
  public void addDeadPiece (final Piece p) throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).addDeadPiece);
    try {
      if (!this.pre_addDeadPiece(p).booleanValue()) 
        UTIL.RunTime("Precondition failure in addDeadPiece");
      deadPieces.add(p);
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).addDeadPiece);
    }
  }
// ***** VDMTOOLS END Name=addDeadPiece#1|Piece


// ***** VDMTOOLS START Name=pre_addDeadPiece#1|Piece KEEP=NO
  public Boolean pre_addDeadPiece (final Piece p) throws CGException {
    Boolean varRes_2 = null;
    Boolean var1_3 = null;
    if ((var1_3 = Boolean.valueOf(!UTIL.Contains(new HashSet(pieces), p))).booleanValue()) 
      var1_3 = Boolean.valueOf(!UTIL.Contains(new HashSet(deadPieces), p));
    if ((varRes_2 = var1_3).booleanValue()) 
      varRes_2 = Boolean.valueOf(UTIL.equals(p.getColor(), color));
    return varRes_2;
  }
// ***** VDMTOOLS END Name=pre_addDeadPiece#1|Piece


// ***** VDMTOOLS START Name=incScore KEEP=NO
  public void incScore () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).incScore);
    try {
      score = new Integer(score.intValue() + 1);
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).incScore);
    }
  }
// ***** VDMTOOLS END Name=incScore


// ***** VDMTOOLS START Name=resetScore KEEP=NO
  public void resetScore () throws CGException {
    sentinel.entering(((PlayerSentinel)sentinel).resetScore);
    try {
      score = new Integer(0);
      if (!this.inv_Player().booleanValue()) 
        UTIL.RunTime("Instance invariant failure in Player");
    }
    finally {
      sentinel.leaving(((PlayerSentinel)sentinel).resetScore);
    }
  }
// ***** VDMTOOLS END Name=resetScore

}
;
