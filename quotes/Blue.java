//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-03 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package quotes;
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
// ***** VDMTOOLS END Name=imports



public class Blue {

// ***** VDMTOOLS START Name=hc KEEP=NO
  static private int hc = 0;
// ***** VDMTOOLS END Name=hc


// ***** VDMTOOLS START Name=Blue KEEP=NO
  public Blue () {
    if (hc == 0) 
      hc = super.hashCode();
  }
// ***** VDMTOOLS END Name=Blue


// ***** VDMTOOLS START Name=hashCode KEEP=NO
  public int hashCode () {
    return hc;
  }
// ***** VDMTOOLS END Name=hashCode


// ***** VDMTOOLS START Name=equals#1|Object KEEP=NO
  public boolean equals (Object obj) {
    return obj instanceof Blue;
  }
// ***** VDMTOOLS END Name=equals#1|Object


// ***** VDMTOOLS START Name=toString KEEP=NO
  public String toString () {
    return "<Blue>";
  }
// ***** VDMTOOLS END Name=toString

}
;
