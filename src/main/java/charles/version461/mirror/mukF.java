package charles.version461.mirror;

import com.xk72.charles.gui.lib.treetable.DefaultTreeTableNode;
import com.xk72.charles.gui.lib.treetable.OEqP;
import com.xk72.charles.gui.lib.treetable.tfse;
import com.xk72.charles.gui.transaction.lib.TransactionSummary;
import com.xk72.charles.gui.transaction.lib.TransactionSummary$Dimension;
import com.xk72.charles.gui.transaction.lib.TransactionSummary$Type;
import com.xk72.charles.lib.SkbX;
import com.xk72.charles.model.ModelNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.tree.MutableTreeNode;

public class mukF extends com.xk72.charles.gui.transaction.general.OEqP {
  private static final String uQqp = "-";

  protected DefaultTreeTableNode eCYm = new DefaultTreeTableNode();

  private final OEqP AhDU = new OEqP(this.eCYm);

  private DefaultTreeTableNode PRdh;

  private DefaultTreeTableNode Idso;

  private DefaultTreeTableNode Vvaz;

  private DefaultTreeTableNode Hylk;

  private DefaultTreeTableNode qvCh;

  private DefaultTreeTableNode QNPA;

  private DefaultTreeTableNode vkEM;

  private DefaultTreeTableNode kbzH;

  private DefaultTreeTableNode ERKX;

  private DefaultTreeTableNode gMxR;

  private DefaultTreeTableNode CsNq;

  private DefaultTreeTableNode ukMN;

  private DefaultTreeTableNode rsVk;

  private DefaultTreeTableNode qLOY;

  private DefaultTreeTableNode CFPh;

  private DefaultTreeTableNode emFI;

  public mukF() {
    this.AhDU.XdKP("Name");
    this.AhDU.XdKP("Value", String.class);
    uQqp();
  }

  protected void uQqp() {
    this.PRdh = new DefaultTreeTableNode("协议");
    this.eCYm.add((MutableTreeNode)this.PRdh);
    this.Idso = AhDU();
    this.eCYm.add((MutableTreeNode)this.Idso);
    this.kbzH = PRdh();
    this.eCYm.add((MutableTreeNode)this.kbzH);
    this.Vvaz = new DefaultTreeTableNode("大小");
    this.Vvaz.add((MutableTreeNode)(this.Hylk = new DefaultTreeTableNode("Requests")));
    this.Hylk.add((MutableTreeNode)XdKP("TLS Handshakes"));
    this.Hylk.add((MutableTreeNode)XdKP("Headers"));
    this.Hylk.add((MutableTreeNode)XdKP("内容"));
    this.Hylk.add((MutableTreeNode)XdKP("Total"));
    this.Hylk.add((MutableTreeNode)new DefaultTreeTableNode("Uncompressed"));
    this.Vvaz.add((MutableTreeNode)(this.qvCh = new DefaultTreeTableNode("Responses")));
    this.qvCh.add((MutableTreeNode)XdKP("TLS Handshakes"));
    this.qvCh.add((MutableTreeNode)XdKP("Headers"));
    this.qvCh.add((MutableTreeNode)XdKP("Content"));
    this.qvCh.add((MutableTreeNode)XdKP("Total"));
    this.qvCh.add((MutableTreeNode)new DefaultTreeTableNode("Uncompressed"));
    this.QNPA = uQqp("Combined");
    this.vkEM = new DefaultTreeTableNode("Compression");
    this.Vvaz.add((MutableTreeNode)this.Hylk);
    this.Vvaz.add((MutableTreeNode)this.qvCh);
    this.Vvaz.add((MutableTreeNode)this.QNPA);
    this.Vvaz.add((MutableTreeNode)this.vkEM);
    this.eCYm.add((MutableTreeNode)this.Vvaz);
    this.ERKX = XdKP("Duration");
    this.qLOY = XdKP("DNS");
    this.CFPh = XdKP("Connect");
    this.emFI = XdKP("TLS Handshake");
    this.gMxR = XdKP("Latency");
    this.CsNq = AhDU("Speed");
    this.ukMN = eCYm("Request Speed");
    this.rsVk = eCYm("Response Speed");
    this.kbzH.add((MutableTreeNode)this.ERKX);
    this.kbzH.add((MutableTreeNode)this.qLOY);
    this.kbzH.add((MutableTreeNode)this.CFPh);
    this.kbzH.add((MutableTreeNode)this.emFI);
    this.kbzH.add((MutableTreeNode)this.gMxR);
    this.kbzH.add((MutableTreeNode)this.CsNq);
    this.kbzH.add((MutableTreeNode)this.ukMN);
    this.kbzH.add((MutableTreeNode)this.rsVk);
  }

  public tfse eCYm() {
    return (tfse)this.AhDU;
  }

  public void XdKP(ModelNode[] paramArrayOfModelNode) {
    TransactionSummary transactionSummary = (paramArrayOfModelNode != null) ? new TransactionSummary(paramArrayOfModelNode) : new TransactionSummary();
    ArrayList<Comparable> arrayList = new ArrayList(transactionSummary.YCFq());
    Collections.sort(arrayList);
    this.PRdh.setValue(SkbX.XdKP(arrayList));
    XdKP(this.Idso, transactionSummary);
    eCYm(this.kbzH, transactionSummary);
    XdKP(this.Hylk, transactionSummary.AhDU(), transactionSummary.yBqx(), transactionSummary.rsVk(), transactionSummary.rsVk());
    XdKP(this.qvCh, transactionSummary.PRdh(), transactionSummary.ossy(), transactionSummary.rsVk(), transactionSummary.qLOY());
    XdKP(this.QNPA, transactionSummary.uQqp(), transactionSummary.yBqx() + transactionSummary.ossy(), transactionSummary.rsVk(), transactionSummary.qLOY());
    uQqp(this.vkEM, transactionSummary);
    XdKP(this.ERKX, transactionSummary.hwVj(), transactionSummary.QNPA(), transactionSummary.XdKP(), transactionSummary.qLOY() + transactionSummary.XSyo());
    XdKP(this.qLOY, transactionSummary.jJFj(), transactionSummary.NWha(), transactionSummary.jHme(), transactionSummary.jskY());
    XdKP(this.CFPh, transactionSummary.smyD(), transactionSummary.WAEF(), transactionSummary.EzdH(), transactionSummary.YKXz());
    XdKP(this.emFI, transactionSummary.WWRi(), transactionSummary.ftUP(), transactionSummary.WkwC(), transactionSummary.wuFV());
    XdKP(this.gMxR, transactionSummary.UQQK(), transactionSummary.vkEM(), transactionSummary.eCYm(), transactionSummary.qLOY() + transactionSummary.XSyo());
    XdKP(this.CsNq, transactionSummary.uQqp()[TransactionSummary$Dimension.uQqp.ordinal()], transactionSummary.ERKX(), transactionSummary.Vvaz(), transactionSummary.hwVj(), 0L, 0L);
    XdKP(this.ukMN, transactionSummary.AhDU()[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()], transactionSummary.kkpB(), transactionSummary.GgWt(), transactionSummary.ZoGD(), transactionSummary.batT(), transactionSummary.wNwP());
    XdKP(this.rsVk, transactionSummary.PRdh()[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()], transactionSummary.kbzH(), transactionSummary.Idso(), transactionSummary.sbEg(), transactionSummary.ANvn(), transactionSummary.eRmO());
    this.AhDU.eCYm();
  }

  public void XdKP() {
    XdKP((ModelNode[])null);
  }

  private DefaultTreeTableNode AhDU() {
    DefaultTreeTableNode defaultTreeTableNode = new DefaultTreeTableNode("Requests");
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Completed"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Incomplete"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Failed"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Blocked"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("DNS"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Connects"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("TLS Handshakes"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Kept Alive"));
    return defaultTreeTableNode;
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode, TransactionSummary paramTransactionSummary) {
    paramDefaultTreeTableNode.setValue(Integer.valueOf(paramTransactionSummary.rsVk()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue(Integer.valueOf(paramTransactionSummary.qLOY()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue(Integer.valueOf(paramTransactionSummary.XSyo()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue(Integer.valueOf(paramTransactionSummary.CFPh()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue(Integer.valueOf(paramTransactionSummary.emFI()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(4)).setValue(Integer.valueOf(paramTransactionSummary.jskY()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(5)).setValue(Integer.valueOf(paramTransactionSummary.YKXz()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(6)).setValue(Integer.valueOf(paramTransactionSummary.wuFV()));
    ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(7)).setValue(Integer.valueOf(paramTransactionSummary.FeXO()));
  }

  private DefaultTreeTableNode PRdh() {
    DefaultTreeTableNode defaultTreeTableNode = new DefaultTreeTableNode("Timing");
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Start"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("End"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Timespan"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Requests / sec"));
    return defaultTreeTableNode;
  }

  private void eCYm(DefaultTreeTableNode paramDefaultTreeTableNode, TransactionSummary paramTransactionSummary) {
    Date date1 = paramTransactionSummary.gMxR();
    if (date1 != null) {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue(XdKP(date1));
    } else {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue("-");
    }
    Date date2 = paramTransactionSummary.Hylk();
    if (date2 != null) {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue(XdKP(date2));
    } else {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue("-");
    }
    if (date1 != null && date2 != null) {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.Idso(date2.getTime() - date1.getTime()));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.XdKP(paramTransactionSummary.qLOY(), date2.getTime() - date1.getTime()));
    } else {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue("-");
    }
  }

  private DefaultTreeTableNode XdKP(String paramString) {
    DefaultTreeTableNode defaultTreeTableNode = AhDU(paramString);
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Total"));
    return defaultTreeTableNode;
  }

  private DefaultTreeTableNode eCYm(String paramString) {
    DefaultTreeTableNode defaultTreeTableNode = AhDU(paramString);
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Bandwidth"));
    return defaultTreeTableNode;
  }

  private DefaultTreeTableNode uQqp(String paramString) {
    DefaultTreeTableNode defaultTreeTableNode = XdKP(paramString);
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Uncompressed"));
    return defaultTreeTableNode;
  }

  private DefaultTreeTableNode AhDU(String paramString) {
    DefaultTreeTableNode defaultTreeTableNode = new DefaultTreeTableNode(paramString);
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Min"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Mean"));
    defaultTreeTableNode.add((MutableTreeNode)new DefaultTreeTableNode("Max"));
    return defaultTreeTableNode;
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode, long[][] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    if (paramInt2 > 0) {
      paramDefaultTreeTableNode.setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()]));
      for (TransactionSummary$Type type : TransactionSummary$Type.values()) {
        DefaultTreeTableNode defaultTreeTableNode = (DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(type.ordinal());
        long l1 = paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.XdKP.ordinal()];
        long l2 = paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.eCYm.ordinal()];
        long l3 = paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()];
        long l4 = paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.AhDU.ordinal()];
        defaultTreeTableNode.setValue(this.XdKP.eCYm(l3));
        ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(0)).setValue((l3 == 0L && l1 > 0L) ? "-" : this.XdKP.eCYm(l1));
        ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(1)).setValue(this.XdKP.eCYm(l4 / paramInt2));
        ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.eCYm(l2));
        ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.eCYm(l3));
      }
      if (paramLong != paramArrayOflong[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.AhDU.ordinal()]) {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(paramDefaultTreeTableNode.getChildCount() - 1)).setValue(this.XdKP.eCYm(paramLong));
      } else {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(paramDefaultTreeTableNode.getChildCount() - 1)).setValue("-");
      }
    } else {
      XdKP(paramDefaultTreeTableNode);
      if (paramInt1 > 0) {
        paramDefaultTreeTableNode.setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()]));
        for (TransactionSummary$Type type : TransactionSummary$Type.values()) {
          DefaultTreeTableNode defaultTreeTableNode = (DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(type.ordinal());
          defaultTreeTableNode.setValue(this.XdKP.eCYm(paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()]));
          ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(0)).setValue("-");
          ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(1)).setValue("-");
          ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.eCYm(paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.eCYm.ordinal()]));
          ((DefaultTreeTableNode)defaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.eCYm(paramArrayOflong[type.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()]));
        }
      }
    }
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode, long[] paramArrayOflong, long paramLong, int paramInt1, int paramInt2) {
    if (paramInt2 > 0) {
      paramDefaultTreeTableNode.setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.uQqp.ordinal()]));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.XdKP.ordinal()]));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.AhDU.ordinal()] / paramInt2));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.eCYm.ordinal()]));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.uQqp.ordinal()]));
      if (paramLong != paramArrayOflong[TransactionSummary$Dimension.AhDU.ordinal()]) {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(paramDefaultTreeTableNode.getChildCount() - 1)).setValue(this.XdKP.eCYm(paramLong));
      } else {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(paramDefaultTreeTableNode.getChildCount() - 1)).setValue("-");
      }
    } else {
      XdKP(paramDefaultTreeTableNode);
      if (paramInt1 > 0)
        paramDefaultTreeTableNode.setValue(this.XdKP.eCYm(paramArrayOflong[TransactionSummary$Dimension.uQqp.ordinal()]));
    }
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode) {
    paramDefaultTreeTableNode.setValue("-");
    for (byte b = 0; b < paramDefaultTreeTableNode.getChildCount(); b++)
      XdKP((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(b));
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode, long paramLong1, long paramLong2, long paramLong3, int paramInt) {
    if (paramInt > 0) {
      paramDefaultTreeTableNode.setValue(this.XdKP.Idso(paramLong1));
      if (paramLong2 < Long.MAX_VALUE) {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue(this.XdKP.Idso(paramLong2));
      } else {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue("-");
      }
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue(this.XdKP.Idso(paramLong1 / paramInt));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.Idso(paramLong3));
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.Idso(paramLong1));
    } else {
      paramDefaultTreeTableNode.setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue("-");
    }
  }

  private void XdKP(DefaultTreeTableNode paramDefaultTreeTableNode, long paramLong1, float paramFloat1, float paramFloat2, long paramLong2, long paramLong3, long paramLong4) {
    if (paramFloat1 < Float.MAX_VALUE) {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue(this.XdKP.XdKP(paramFloat1));
    } else {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(0)).setValue("-");
    }
    if (paramLong2 > 0L) {
      String str = this.XdKP.XdKP(paramLong1, paramLong2);
      paramDefaultTreeTableNode.setValue(str);
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue(str);
    } else {
      paramDefaultTreeTableNode.setValue("-");
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(1)).setValue("-");
    }
    if (paramFloat2 > 0.0F) {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue(this.XdKP.XdKP(paramFloat2));
    } else {
      ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(2)).setValue("-");
    }
    if (paramDefaultTreeTableNode.getChildCount() > 3)
      if (paramLong3 > 0L) {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue(this.XdKP.XdKP(paramLong4, paramLong3));
      } else {
        ((DefaultTreeTableNode)paramDefaultTreeTableNode.getChildAt(3)).setValue("-");
      }
  }

  private void uQqp(DefaultTreeTableNode paramDefaultTreeTableNode, TransactionSummary paramTransactionSummary) {
    long l1 = paramTransactionSummary.yBqx();
    long l2 = paramTransactionSummary.ossy();
    long l3 = paramTransactionSummary.AhDU()[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.uQqp.ordinal()];
    long l4 = paramTransactionSummary.PRdh()[TransactionSummary$Type.AhDU.ordinal()][TransactionSummary$Dimension.AhDU.ordinal()];
    if (l1 != l3) {
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append(XdKP(l3, l1));
      if (l2 != l4) {
        stringBuffer.append(" / ");
        stringBuffer.append(XdKP(l4, l2));
      }
      paramDefaultTreeTableNode.setValue(stringBuffer.toString());
    } else if (l2 != l4) {
      paramDefaultTreeTableNode.setValue(XdKP(l4, l2));
    } else {
      paramDefaultTreeTableNode.setValue("-");
    }
  }
}
