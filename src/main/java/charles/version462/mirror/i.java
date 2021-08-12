//package charles.version462.mirror;
//
//import com.xk72.charles.gui.lib.treetable.DefaultTreeTableNode;
//import com.xk72.charles.gui.lib.treetable.j;
//import com.xk72.charles.model.ModelNode;
//import com.xk72.charles.model.Transaction;
//import com.xk72.proxy.Fields;
//import com.xk72.proxy.ProxyException;
//import com.xk72.proxy.http.HttpFields;
//import com.xk72.proxy.ssl.SSLExtension;
//import com.xk72.proxy.ssl.l;
//
//import java.net.InetAddress;
//import java.security.cert.Certificate;
//import java.util.Arrays;
//import java.util.ConcurrentModificationException;
//import java.util.List;
//import java.util.Map;
//
//import javax.swing.tree.MutableTreeNode;
//
//public class i extends com.xk72.charles.gui.transaction.general.c {
//  private static final String c = "-";
//
//  protected DefaultTreeTableNode b = new DefaultTreeTableNode();
//
//  private final com.xk72.charles.gui.lib.treetable.c d = new com.xk72.charles.gui.lib.treetable.c(this.b);
//
//  private DefaultTreeTableNode e;
//
//  private DefaultTreeTableNode f;
//
//  private DefaultTreeTableNode g;
//
//  private DefaultTreeTableNode h;
//
//  private DefaultTreeTableNode i;
//
//  private DefaultTreeTableNode j;
//
//  private DefaultTreeTableNode k;
//
//  private DefaultTreeTableNode l;
//
//  private DefaultTreeTableNode m;
//
//  private DefaultTreeTableNode n;
//
//  private DefaultTreeTableNode o;
//
//  private DefaultTreeTableNode p;
//
//  private DefaultTreeTableNode q;
//
//  private DefaultTreeTableNode r;
//
//  private DefaultTreeTableNode s;
//
//  private DefaultTreeTableNode t;
//
//  private DefaultTreeTableNode u;
//
//  private DefaultTreeTableNode v;
//
//  private DefaultTreeTableNode w;
//
//  private DefaultTreeTableNode x;
//
//  private DefaultTreeTableNode y;
//
//  private DefaultTreeTableNode z;
//
//  private DefaultTreeTableNode A;
//
//  private DefaultTreeTableNode B;
//
//  private DefaultTreeTableNode C;
//
//  private DefaultTreeTableNode D;
//
//  private DefaultTreeTableNode E;
//
//  private DefaultTreeTableNode F;
//
//  private DefaultTreeTableNode G;
//
//  private DefaultTreeTableNode H;
//
//  private DefaultTreeTableNode I;
//
//  private DefaultTreeTableNode J;
//
//  private DefaultTreeTableNode K;
//
//  private DefaultTreeTableNode L;
//
//  private DefaultTreeTableNode M;
//
//  private DefaultTreeTableNode N;
//
//  private DefaultTreeTableNode O;
//
//  private DefaultTreeTableNode P;
//
//  private DefaultTreeTableNode Q;
//
//  private DefaultTreeTableNode R;
//
//  private DefaultTreeTableNode S;
//
//  private DefaultTreeTableNode T;
//
//  private DefaultTreeTableNode U;
//
//  private DefaultTreeTableNode V;
//
//  private DefaultTreeTableNode W;
//
//  private DefaultTreeTableNode X;
//
//  private DefaultTreeTableNode Y;
//
//  private DefaultTreeTableNode Z;
//
//  private DefaultTreeTableNode aa;
//
//  private DefaultTreeTableNode ab;
//
//  private DefaultTreeTableNode ac;
//
//  private DefaultTreeTableNode ad;
//
//  private DefaultTreeTableNode ae;
//
//  private DefaultTreeTableNode af;
//
//  private DefaultTreeTableNode ag;
//
//  private DefaultTreeTableNode ah;
//
//  private DefaultTreeTableNode ai;
//
//  private DefaultTreeTableNode aj;
//
//  private DefaultTreeTableNode ak;
//
//  private DefaultTreeTableNode al;
//
//  private DefaultTreeTableNode am;
//
//  private DefaultTreeTableNode an;
//
//  private DefaultTreeTableNode ao;
//
//  private DefaultTreeTableNode ap;
//
//  private DefaultTreeTableNode aq;
//
//  private DefaultTreeTableNode ar;
//
//  private DefaultTreeTableNode as;
//
//  private DefaultTreeTableNode at;
//
//  private DefaultTreeTableNode au;
//
//  private DefaultTreeTableNode av;
//
//  private DefaultTreeTableNode aw;
//
//  private DefaultTreeTableNode ax;
//
//  private DefaultTreeTableNode ay;
//
//  private DefaultTreeTableNode az;
//
//  private DefaultTreeTableNode aA;
//
//  private DefaultTreeTableNode aB;
//
//  private DefaultTreeTableNode aC;
//
//  private DefaultTreeTableNode aD;
//
//  public i() {
//    this.d.a("Name");
//    this.d.a("Value", String.class);
//    c();
//  }
//
//  public j b() {
//    return (j)this.d;
//  }
//
//  protected void c() {
//    this.b.add((MutableTreeNode)(this.e = new DefaultTreeTableNode("URL")));
//    this.b.add((MutableTreeNode)(this.g = new DefaultTreeTableNode("Status")));
//    this.b.add((MutableTreeNode)(this.h = new DefaultTreeTableNode("Failure")));
//    this.b.add((MutableTreeNode)(this.f = new DefaultTreeTableNode("Notes")));
//    this.b.add((MutableTreeNode)(this.i = new DefaultTreeTableNode("Response Code")));
//    this.b.add((MutableTreeNode)(this.j = new DefaultTreeTableNode("Protocol")));
//    this.b.add((MutableTreeNode)(this.k = new DefaultTreeTableNode("TLS")));
//    this.k.add((MutableTreeNode)(this.q = new DefaultTreeTableNode("Protocol")));
//    this.q.add((MutableTreeNode)(this.s = new DefaultTreeTableNode("Client Supported")));
//    this.q.add((MutableTreeNode)(this.t = new DefaultTreeTableNode("Charles to Client")));
//    this.q.add((MutableTreeNode)(this.r = new DefaultTreeTableNode("Server Chosen")));
//    this.k.add((MutableTreeNode)(this.J = new DefaultTreeTableNode("Alert Code")));
//    this.k.add((MutableTreeNode)(this.l = new DefaultTreeTableNode("Session Resumed")));
//    this.l.add((MutableTreeNode)(this.m = new DefaultTreeTableNode("Client Requested")));
//    this.l.add((MutableTreeNode)(this.o = new DefaultTreeTableNode("Client Session ID")));
//    this.l.add((MutableTreeNode)(this.p = new DefaultTreeTableNode("Charles Requested")));
//    this.l.add((MutableTreeNode)(this.n = new DefaultTreeTableNode("Server Session ID")));
//    this.k.add((MutableTreeNode)(this.u = new DefaultTreeTableNode("Cipher Suite")));
//    this.u.add((MutableTreeNode)(this.v = new DefaultTreeTableNode("Client Supported")));
//    this.u.add((MutableTreeNode)(this.x = new DefaultTreeTableNode("Charles to Client")));
//    this.u.add((MutableTreeNode)(this.w = new DefaultTreeTableNode("Server Chosen")));
//    this.k.add((MutableTreeNode)(this.y = new DefaultTreeTableNode("ALPN")));
//    this.y.add((MutableTreeNode)(this.z = new DefaultTreeTableNode("Client Supported")));
//    this.y.add((MutableTreeNode)(this.A = new DefaultTreeTableNode("Charles Supported")));
//    this.y.add((MutableTreeNode)(this.B = new DefaultTreeTableNode("Server Chosen")));
//    this.k.add((MutableTreeNode)(this.C = new DefaultTreeTableNode("Client Certificates")));
//    this.k.add((MutableTreeNode)(this.D = new DefaultTreeTableNode("Server Certificates")));
//    this.k.add((MutableTreeNode)(this.E = new DefaultTreeTableNode("Extensions")));
//    this.E.add((MutableTreeNode)(this.F = new DefaultTreeTableNode("Client")));
//    this.E.add((MutableTreeNode)(this.G = new DefaultTreeTableNode("Charles to Client")));
//    this.E.add((MutableTreeNode)(this.H = new DefaultTreeTableNode("Charles to Server")));
//    this.E.add((MutableTreeNode)(this.I = new DefaultTreeTableNode("Server")));
//    this.b.add((MutableTreeNode)(this.K = new DefaultTreeTableNode("Method")));
//    this.b.add((MutableTreeNode)(this.as = new DefaultTreeTableNode("Kept Alive")));
//    this.b.add((MutableTreeNode)(this.L = new DefaultTreeTableNode("Content-Type")));
//    this.b.add((MutableTreeNode)(this.M = new DefaultTreeTableNode("Client Address")));
//    this.b.add((MutableTreeNode)(this.N = new DefaultTreeTableNode("Remote Address")));
//    this.b.add((MutableTreeNode)(this.au = new DefaultTreeTableNode("Tags")));
//    this.b.add((MutableTreeNode)(this.at = new DefaultTreeTableNode("Connection")));
//    this.av = new DefaultTreeTableNode("WebSockets");
//    this.av.add((MutableTreeNode)(this.aw = new DefaultTreeTableNode("Origin")));
//    this.av.add((MutableTreeNode)(this.ax = new DefaultTreeTableNode("Version")));
//    this.av.add((MutableTreeNode)(this.ay = new DefaultTreeTableNode("Protocol")));
//    this.av.add((MutableTreeNode)(this.az = new DefaultTreeTableNode("Extensions")));
//    this.av.add((MutableTreeNode)(this.aA = new DefaultTreeTableNode("Messages Sent")));
//    this.av.add((MutableTreeNode)(this.aB = new DefaultTreeTableNode("Messages Received")));
//    this.av.add((MutableTreeNode)(this.aC = new DefaultTreeTableNode("Control Frames Sent")));
//    this.av.add((MutableTreeNode)(this.aD = new DefaultTreeTableNode("Control Frames Received")));
//    this.b.add((MutableTreeNode)this.av);
//    DefaultTreeTableNode defaultTreeTableNode1 = new DefaultTreeTableNode("Timing");
//    defaultTreeTableNode1.add((MutableTreeNode)(this.O = new DefaultTreeTableNode("Request Start Time")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.P = new DefaultTreeTableNode("Request End Time")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.Q = new DefaultTreeTableNode("Response Start Time")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.R = new DefaultTreeTableNode("Response End Time")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.ae = new DefaultTreeTableNode("Duration")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.ag = new DefaultTreeTableNode("DNS")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.ah = new DefaultTreeTableNode("Connect")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.ai = new DefaultTreeTableNode("TLS Handshake")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.aj = new DefaultTreeTableNode("Request")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.ak = new DefaultTreeTableNode("Response")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.af = new DefaultTreeTableNode("Latency")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.al = new DefaultTreeTableNode("Speed")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.am = new DefaultTreeTableNode("Request Speed")));
//    defaultTreeTableNode1.add((MutableTreeNode)(this.an = new DefaultTreeTableNode("Response Speed")));
//    this.b.add((MutableTreeNode)defaultTreeTableNode1);
//    DefaultTreeTableNode defaultTreeTableNode2 = new DefaultTreeTableNode("Size");
//    defaultTreeTableNode2.add((MutableTreeNode)(this.S = new DefaultTreeTableNode("Request")));
//    this.S.add((MutableTreeNode)(this.W = new DefaultTreeTableNode("TLS Handshake")));
//    this.S.add((MutableTreeNode)(this.U = new DefaultTreeTableNode("Header")));
//    this.S.add((MutableTreeNode)(this.Y = new DefaultTreeTableNode("Query String")));
//    this.S.add((MutableTreeNode)(this.Z = new DefaultTreeTableNode("Cookies")));
//    this.S.add((MutableTreeNode)(this.aa = new DefaultTreeTableNode("Body")));
//    this.S.add((MutableTreeNode)(this.aq = new DefaultTreeTableNode("Uncompressed Body")));
//    this.S.add((MutableTreeNode)(this.ao = new DefaultTreeTableNode("Compression")));
//    defaultTreeTableNode2.add((MutableTreeNode)(this.T = new DefaultTreeTableNode("Response")));
//    this.T.add((MutableTreeNode)(this.X = new DefaultTreeTableNode("TLS Handshake")));
//    this.T.add((MutableTreeNode)(this.V = new DefaultTreeTableNode("Header")));
//    this.T.add((MutableTreeNode)(this.ab = new DefaultTreeTableNode("Cookies")));
//    this.T.add((MutableTreeNode)(this.ac = new DefaultTreeTableNode("Body")));
//    this.T.add((MutableTreeNode)(this.ar = new DefaultTreeTableNode("Uncompressed Body")));
//    this.T.add((MutableTreeNode)(this.ap = new DefaultTreeTableNode("Compression")));
//    defaultTreeTableNode2.add((MutableTreeNode)(this.ad = new DefaultTreeTableNode("Total")));
//    this.b.add((MutableTreeNode)defaultTreeTableNode2);
//  }
//
//  public void a(ModelNode[] paramArrayOfModelNode) {
//    a((Transaction)paramArrayOfModelNode[0]);
//  }
//
//  private void a(Transaction paramTransaction) {
//    this.e.setValue(paramTransaction.toString());
//    this.j.setValue(paramTransaction.getProtocolVersion());
//    if (paramTransaction.getSslProtocol() != null) {
//      this.k.setValue(paramTransaction.getSslProtocol() + " (" + paramTransaction.getSslProtocol() + ")");
//      this.l.setValue(b(paramTransaction));
//      this.m.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getClientProposedSslSessionID()));
//      this.n.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getSslSessionID()));
//      if (paramTransaction.getClientSslSessionID() == null && paramTransaction.getProposedSslSessionID() == null) {
//        this.m.setName("Requested");
//        this.d.a(this.m);
//        this.n.setName("Session ID");
//        this.d.a(this.n);
//        a(this.o);
//        a(this.p);
//      } else {
//        this.m.setName("Client Requested");
//        this.d.a(this.m);
//        this.n.setName("Server Session ID");
//        this.d.a(this.n);
//        a(this.l, this.o, this.m);
//        this.o.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getClientSslSessionID()));
//        a(this.l, this.p, this.o);
//        this.p.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getProposedSslSessionID()));
//      }
//      this.q.setValue(paramTransaction.getSslProtocol());
//      this.s.setValue(a(paramTransaction.getClientProposedSslProtocol()));
//      this.r.setValue(paramTransaction.getSslProtocol());
//      a(this.q, this.t, this.r, paramTransaction.getClientSslProtocol());
//      a(this.k, this.J, this.q, a(paramTransaction.getSslAlert()));
//      this.u.setValue(paramTransaction.getCipherSuite());
//      this.v.setValue(paramTransaction.getClientProposedCipherSuites());
//      this.w.setValue(paramTransaction.getCipherSuite());
//      a(this.u, this.x, this.w, paramTransaction.getClientCipherSuite());
//      this.y.setValue(a(paramTransaction.getAlpnProtocol()));
//      this.z.setValue(a(paramTransaction.getClientProposedAlpnProtocols()));
//      this.B.setValue(a(paramTransaction.getAlpnProtocol()));
//      a(this.y, this.A, this.B, paramTransaction.getProposedAlpnProtocols());
//    } else if (paramTransaction.getClientProposedSslProtocol() != null) {
//      String str = a(paramTransaction.getSslAlert());
//      this.k.setValue(paramTransaction.getClientProposedSslProtocol() + paramTransaction.getClientProposedSslProtocol());
//      this.l.setValue("-");
//      this.m.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getClientProposedSslSessionID()));
//      a(this.o);
//      a(this.p);
//      this.n.setValue(com.xk72.charles.gui.transaction.general.d.a(paramTransaction.getSslSessionID()));
//      this.q.setValue(paramTransaction.getClientProposedSslProtocol());
//      this.s.setValue(paramTransaction.getClientProposedSslProtocol());
//      this.r.setValue(a(paramTransaction.getSslProtocol()));
//      a(this.t);
//      a(this.k, this.J, this.q, str);
//      this.u.setValue(a(paramTransaction.getCipherSuite()));
//      this.v.setValue(paramTransaction.getClientProposedCipherSuites());
//      this.w.setValue(a(paramTransaction.getCipherSuite()));
//      a(this.x);
//      this.y.setValue(a(paramTransaction.getAlpnProtocol()));
//      this.z.setValue(a(paramTransaction.getClientProposedAlpnProtocols()));
//      this.B.setValue(a(paramTransaction.getAlpnProtocol()));
//      a(this.A);
//    } else {
//      this.k.setValue("-");
//      this.l.setValue("-");
//      this.m.setValue("-");
//      a(this.o);
//      a(this.p);
//      this.n.setValue("-");
//      this.q.setValue("-");
//      this.s.setValue("-");
//      this.r.setValue("-");
//      a(this.t);
//      a(this.J);
//      this.u.setValue("-");
//      this.v.setValue("-");
//      this.w.setValue("-");
//      a(this.x);
//      this.y.setValue("-");
//      this.z.setValue("-");
//      this.B.setValue("-");
//      a(this.A);
//    }
//    this.K.setValue(paramTransaction.getMethod());
//    if (paramTransaction.getKeptAlive() != null) {
//      if (paramTransaction.getKeptAlive().booleanValue()) {
//        this.as.setValue("Yes");
//      } else if (Boolean.TRUE.equals(paramTransaction.getClientKeptAlive())) {
//        this.as.setValue("No (Client connection kept alive)");
//      } else {
//        this.as.setValue("No");
//      }
//    } else {
//      this.as.setValue("-");
//    }
//    if (paramTransaction.getStartTime() != null) {
//      this.O.setValue(a(paramTransaction.getStartTime()));
//    } else {
//      this.O.setValue("-");
//    }
//    if (paramTransaction.getResponseHeader() != null) {
//      if (paramTransaction.getResponseHeader() instanceof HttpFields) {
//        String str = String.valueOf(((HttpFields)paramTransaction.getResponseHeader()).getResponseStatus());
//        String str1 = ((HttpFields)paramTransaction.getResponseHeader()).getResponseStatusDescription();
//        if (str1 != null)
//          str = str + " " + str;
//        this.i.setValue(str);
//      } else {
//        this.i.setValue("-");
//      }
//      this.L.setValue(com.xk72.charles.lib.g.a(paramTransaction.getResponseHeader(), "-"));
//    } else {
//      this.i.setValue("-");
//      this.L.setValue("-");
//    }
//    if (paramTransaction.getRequestCompleteTime() != null) {
//      this.P.setValue(a(paramTransaction.getRequestCompleteTime()));
//    } else {
//      this.P.setValue("-");
//    }
//    if (paramTransaction.getResponseBeginTime() != null) {
//      this.Q.setValue(a(paramTransaction.getResponseBeginTime()));
//    } else {
//      this.Q.setValue("-");
//    }
//    if (paramTransaction.getEndTime() != null) {
//      this.R.setValue(a(paramTransaction.getEndTime()));
//    } else {
//      this.R.setValue("-");
//    }
//    if (paramTransaction.getRemoteAddress() == null) {
//      this.N.setValue("-");
//    } else if (paramTransaction.getActualPort() < 0) {
//      this.N.setValue(a(paramTransaction.getRemoteAddress()));
//    } else {
//      this.N.setValue(a(paramTransaction.getRemoteAddress()) + ":" + a(paramTransaction.getRemoteAddress()));
//    }
//    if (paramTransaction.getClientAddress() == null) {
//      this.M.setValue("-");
//    } else if (paramTransaction.getClientPort() < 0) {
//      this.M.setValue(a(paramTransaction.getClientAddress()));
//    } else {
//      this.M.setValue(a(paramTransaction.getClientAddress()) + ":" + a(paramTransaction.getClientAddress()));
//    }
//    if (paramTransaction.hasRequestBody() || paramTransaction.getRequestHeader() != null) {
//      this.S.setValue(this.a.d(paramTransaction.getTotalRequestSize()));
//    } else {
//      this.S.setValue("-");
//    }
//    if (paramTransaction.hasResponseBody() || paramTransaction.getResponseHeader() != null) {
//      this.T.setValue(this.a.d(paramTransaction.getTotalResponseSize()));
//    } else {
//      this.T.setValue("-");
//    }
//    if (paramTransaction.getQuery() != null) {
//      this.Y.setValue(this.a.d(Fields.byteLength(paramTransaction.getQuery())));
//    } else {
//      this.Y.setValue("-");
//    }
//    if (paramTransaction.hasRequestBody()) {
//      this.aa.setValue(this.a.d(paramTransaction.getRequestSize()));
//    } else {
//      this.aa.setValue("-");
//    }
//    if (paramTransaction.hasResponseBody()) {
//      this.ac.setValue(this.a.d(paramTransaction.getResponseSize()));
//    } else {
//      this.ac.setValue("-");
//    }
//    if (paramTransaction.getRequestHeader() != null) {
//      if (paramTransaction.getRequestHeaderSize() == 0 && "CONNECT".equals(paramTransaction.getMethod())) {
//        this.U.setValue("-");
//      } else {
//        this.U.setValue(this.a.d(paramTransaction.getRequestHeaderSize()));
//      }
//      String[] arrayOfString = paramTransaction.getRequestHeader().getFieldValues("Cookie");
//      if (arrayOfString != null) {
//        int j = 0;
//        for (String str : arrayOfString)
//          j += Fields.byteLength(str);
//        this.Z.setValue(this.a.d(j));
//      } else {
//        this.Z.setValue("-");
//      }
//    } else {
//      this.U.setValue("-");
//    }
//    if (paramTransaction.getRequestHandshakeSize() == 0) {
//      this.W.setValue("-");
//    } else {
//      this.W.setValue(this.a.d(paramTransaction.getRequestHandshakeSize()));
//    }
//    if (paramTransaction.getResponseHandshakeSize() == 0) {
//      this.X.setValue("-");
//    } else {
//      this.X.setValue(this.a.d(paramTransaction.getResponseHandshakeSize()));
//    }
//    if (paramTransaction.getResponseHeader() != null) {
//      if (paramTransaction.getResponseHeaderSize() == 0 && "CONNECT".equals(paramTransaction.getMethod())) {
//        this.V.setValue("-");
//      } else {
//        this.V.setValue(this.a.d(paramTransaction.getResponseHeaderSize()));
//      }
//      String[] arrayOfString = paramTransaction.getResponseHeader().getFieldValues("Set-Cookie");
//      if (arrayOfString != null) {
//        int j = 0;
//        for (String str : arrayOfString)
//          j += Fields.byteLength(str);
//        this.ab.setValue(this.a.d(j));
//      } else {
//        this.ab.setValue("-");
//      }
//    } else {
//      this.V.setValue("-");
//    }
//    long l = paramTransaction.getTotalSize();
//    if (l > 0L) {
//      this.ad.setValue(this.a.d(l));
//    } else {
//      this.ad.setValue("-");
//    }
//    Long long_1 = com.xk72.charles.model.I.a(paramTransaction, null);
//    if (long_1 != null) {
//      this.ae.setValue(this.a.f(long_1.longValue()));
//    } else {
//      this.ae.setValue("-");
//    }
//    Long long_2 = com.xk72.charles.model.I.e(paramTransaction, null);
//    if (long_2 != null) {
//      this.al.setValue(this.a.a((float)long_2.longValue()));
//    } else {
//      this.al.setValue("-");
//    }
//    Long long_3 = com.xk72.charles.model.I.g(paramTransaction, null);
//    if (long_3 != null) {
//      this.am.setValue(this.a.a((float)long_3.longValue()));
//    } else {
//      this.am.setValue("-");
//    }
//    Long long_4 = com.xk72.charles.model.I.f(paramTransaction, null);
//    if (long_4 != null) {
//      this.an.setValue(this.a.a((float)long_4.longValue()));
//    } else {
//      this.an.setValue("-");
//    }
//    Long long_5 = com.xk72.charles.model.I.b(paramTransaction, null);
//    if (long_5 != null) {
//      this.af.setValue(this.a.f(long_5.longValue()));
//    } else {
//      this.af.setValue("-");
//    }
//    if (paramTransaction.getDnsDuration() != null) {
//      this.ag.setValue(this.a.f(paramTransaction.getDnsDuration().longValue()));
//    } else {
//      this.ag.setValue("-");
//    }
//    if (paramTransaction.getConnectDuration() != null) {
//      this.ah.setValue(this.a.f(paramTransaction.getConnectDuration().longValue()));
//    } else {
//      this.ah.setValue("-");
//    }
//    if (paramTransaction.getSslDuration() != null) {
//      this.ai.setValue(this.a.f(paramTransaction.getSslDuration().longValue()));
//    } else {
//      this.ai.setValue("-");
//    }
//    Long long_6 = com.xk72.charles.model.I.c(paramTransaction, null);
//    if (long_6 != null) {
//      this.aj.setValue(this.a.f(long_6.longValue()));
//    } else {
//      this.aj.setValue("-");
//    }
//    Long long_7 = com.xk72.charles.model.I.d(paramTransaction, null);
//    if (long_7 != null) {
//      this.ak.setValue(this.a.f(long_7.longValue()));
//    } else {
//      this.ak.setValue("-");
//    }
//    if (paramTransaction.getRequestContentEncoding() != null) {
//      long l1 = paramTransaction.getDecodedRequestSize();
//      this.ao.setValue(a(paramTransaction.getRequestSize(), l1) + " (" + a(paramTransaction.getRequestSize(), l1) + ")");
//      this.aq.setValue(this.a.d(l1));
//    } else {
//      this.ao.setValue("-");
//      this.aq.setValue("-");
//    }
//    if (paramTransaction.getResponseContentEncoding() != null) {
//      long l1 = paramTransaction.getDecodedResponseSize();
//      this.ap.setValue(a(paramTransaction.getResponseSize(), l1) + " (" + a(paramTransaction.getResponseSize(), l1) + ")");
//      this.ar.setValue(this.a.d(l1));
//    } else {
//      this.ap.setValue("-");
//      this.ar.setValue("-");
//    }
//    this.g.setValue(Transaction.b(paramTransaction.getStatus()));
//    a(this.b, this.h, this.g, a(paramTransaction.getException()));
//    a(this.b, this.f, this.b.contains((MutableTreeNode)this.h) ? this.h : this.g, paramTransaction.getNotes());
//    if (Boolean.TRUE.equals(paramTransaction.getWebSocket())) {
//      this.av.setValue(String.format("%d messages (%d sent, %d received)", new Object[] { Integer.valueOf(paramTransaction.getMessagesSent() + paramTransaction.getMessagesReceived()), Integer.valueOf(paramTransaction.getMessagesSent()), Integer.valueOf(paramTransaction.getMessagesReceived()) }));
//      Fields fields = paramTransaction.getRequestHeader();
//      this.aw.setValue(a(fields.getField("Origin")));
//      this.ax.setValue(a(fields.getField("Sec-WebSocket-Version")));
//      this.ay.setValue(a(fields.getField("Sec-WebSocket-Protocol")));
//      this.az.setValue(a(fields.getField("Sec-WebSocket-Extensions")));
//      this.aA.setValue(Integer.valueOf(paramTransaction.getMessagesSent()));
//      this.aB.setValue(Integer.valueOf(paramTransaction.getMessagesReceived()));
//      this.aC.setValue(Integer.valueOf(paramTransaction.getControlFramesSent()));
//      this.aD.setValue(Integer.valueOf(paramTransaction.getControlFramesReceived()));
//    } else {
//      this.av.setValue("-");
//      this.aw.setValue("-");
//      this.ax.setValue("-");
//      this.ay.setValue("-");
//      this.az.setValue("-");
//      this.aA.setValue("-");
//      this.aB.setValue("-");
//      this.aC.setValue("-");
//      this.aD.setValue("-");
//    }
//    List<Certificate> list1 = paramTransaction.getClientCertificates();
//    if (list1 == null || list1.isEmpty()) {
//      this.C.removeAllChildren();
//      this.C.setValue("-");
//      this.d.b(this.C);
//    } else {
//      this.C.removeAllChildren();
//      this.C.setValue(Integer.valueOf(list1.size()));
//      for (Certificate certificate : list1)
//        this.C.add(com.xk72.charles.gui.transaction.general.d.a(certificate, this.a));
//      this.d.b(this.C);
//    }
//    List<Certificate> list2 = paramTransaction.getServerCertificates();
//    if (list2 == null || list2.isEmpty()) {
//      this.D.removeAllChildren();
//      this.D.setValue("-");
//      this.d.b(this.D);
//    } else {
//      this.D.removeAllChildren();
//      this.D.setValue(Integer.valueOf(list2.size()));
//      for (Certificate certificate : list2)
//        this.D.add(com.xk72.charles.gui.transaction.general.d.a(certificate, this.a));
//      this.d.b(this.D);
//    }
//    a(this.F, true, false, paramTransaction.getClientProposedExtensions());
//    a(this.G, false, true, paramTransaction.getClientExtensions());
//    a(this.H, true, true, paramTransaction.getProposedExtensions());
//    a(this.I, false, false, paramTransaction.getServerExtensions());
//    this.au.setValue((paramTransaction.getTags() == null) ? "-" : paramTransaction.getTags());
//    this.d.b();
//    while (true) {
//      try {
//        this.at.removeAllChildren();
//        Map<String, String> map = paramTransaction.getConnectionAttributes();
//        if (map != null)
//          for (Map.Entry<String, String> entry : map.entrySet())
//            this.at.add((MutableTreeNode)new DefaultTreeTableNode((String)entry.getKey(), entry.getValue()));
//        break;
//      } catch (ConcurrentModificationException concurrentModificationException) {}
//    }
//    this.d.b(this.at);
//  }
//
//  private String b(Transaction paramTransaction) {
//    if (paramTransaction.getClientSslSessionID() == null)
//      return Boolean.TRUE.equals(paramTransaction.getKeptAlive()) ? "N/A (Connection kept alive)" : ((paramTransaction.getSslSessionID() != null && (paramTransaction.getSslSessionID()).length > 0 && Arrays.equals(paramTransaction.getSslSessionID(), paramTransaction.getClientProposedSslSessionID())) ? "Yes" : ((paramTransaction.getSslSessionID() != null && (paramTransaction.getSslSessionID()).length > 0 && Arrays.equals(paramTransaction.getSslSessionID(), paramTransaction.getProposedSslSessionID())) ? "Yes" : "No"));
//    boolean bool1 = (paramTransaction.getClientSslSessionID() != null && (paramTransaction.getClientSslSessionID()).length > 0 && Arrays.equals(paramTransaction.getClientSslSessionID(), paramTransaction.getClientProposedSslSessionID())) ? true : false;
//    boolean bool2 = (paramTransaction.getSslSessionID() != null && (paramTransaction.getSslSessionID()).length > 0 && Arrays.equals(paramTransaction.getSslSessionID(), paramTransaction.getProposedSslSessionID())) ? true : false;
//    return Boolean.TRUE.equals(paramTransaction.getKeptAlive()) ? "N/A (Connection kept alive)" : (Boolean.TRUE.equals(paramTransaction.getClientKeptAlive()) ? (bool2 ? "Yes (Server session resumed, client connection kept alive)" : "No (Server session restarted, client connection kept alive)") : (bool2 ? (bool1 ? "Yes" : "Yes (Server session resumed, client session restarted)") : (bool1 ? "No (Client session resumed, server session restarted)" : "No")));
//  }
//
//  private String a(InetAddress paramInetAddress) {
//    String str = paramInetAddress.toString();
//    return str.startsWith("/") ? str.substring(1) : str;
//  }
//
//  private String a(byte paramByte) {
//    if (paramByte == 0)
//      return null;
//    l l = com.xk72.proxy.ssl.k.a(paramByte);
//    return (l == null) ? ("Unknown alert code (" + paramByte + ")") : (l.b + " (" + l.b + ") - " + paramByte);
//  }
//
//  private void a(DefaultTreeTableNode paramDefaultTreeTableNode, boolean paramBoolean1, boolean paramBoolean2, List<SSLExtension> paramList) {
//    if (paramList == null || paramList.isEmpty()) {
//      if (paramBoolean2) {
//        a(paramDefaultTreeTableNode);
//      } else {
//        paramDefaultTreeTableNode.setValue("-");
//        paramDefaultTreeTableNode.removeAllChildren();
//        this.d.b(paramDefaultTreeTableNode);
//      }
//    } else {
//      if (paramBoolean2) {
//        int j = this.E.getChildCount() - 1;
//        a(this.E, paramDefaultTreeTableNode, j);
//      }
//      paramDefaultTreeTableNode.removeAllChildren();
//      paramDefaultTreeTableNode.setValue(Integer.valueOf(paramList.size()));
//      for (SSLExtension sSLExtension : paramList)
//        paramDefaultTreeTableNode.add(a(sSLExtension, paramBoolean1));
//      this.d.b(paramDefaultTreeTableNode);
//    }
//  }
//
//  private MutableTreeNode a(SSLExtension paramSSLExtension, boolean paramBoolean) {
//    String str = com.xk72.charles.gui.transaction.general.h.a(paramSSLExtension.getType(), paramBoolean) + " (" + com.xk72.charles.gui.transaction.general.h.a(paramSSLExtension.getType(), paramBoolean) + ")";
//    Object object = com.xk72.charles.gui.transaction.general.h.a(paramSSLExtension.getType(), paramSSLExtension.getData(), paramBoolean);
//    return (MutableTreeNode)new DefaultTreeTableNode(str, object);
//  }
//
//  private String a(Exception paramException) {
//    return (paramException == null) ? null : ((paramException instanceof ProxyException || paramException instanceof com.xk72.proxy.http.RemoteServerClosedConnectionException) ? paramException.getMessage() : com.xk72.charles.lib.n.a(paramException));
//  }
//
//  private void a(DefaultTreeTableNode paramDefaultTreeTableNode1, DefaultTreeTableNode paramDefaultTreeTableNode2, DefaultTreeTableNode paramDefaultTreeTableNode3) {
//    if (!paramDefaultTreeTableNode1.contains((MutableTreeNode)paramDefaultTreeTableNode2)) {
//      paramDefaultTreeTableNode1.insertChildAfter((MutableTreeNode)paramDefaultTreeTableNode2, (MutableTreeNode)paramDefaultTreeTableNode3);
//      this.d.a((Object[])paramDefaultTreeTableNode1.getPath(), new Object[] { paramDefaultTreeTableNode2 });
//    }
//  }
//
//  private void a(DefaultTreeTableNode paramDefaultTreeTableNode1, DefaultTreeTableNode paramDefaultTreeTableNode2, int paramInt) {
//    if (!paramDefaultTreeTableNode1.contains((MutableTreeNode)paramDefaultTreeTableNode2)) {
//      paramDefaultTreeTableNode1.insert((MutableTreeNode)paramDefaultTreeTableNode2, paramInt);
//      this.d.a((Object[])paramDefaultTreeTableNode1.getPath(), new Object[] { paramDefaultTreeTableNode2 });
//    }
//  }
//
//  private void a(DefaultTreeTableNode paramDefaultTreeTableNode) {
//    DefaultTreeTableNode defaultTreeTableNode = (DefaultTreeTableNode)paramDefaultTreeTableNode.getParent();
//    if (defaultTreeTableNode != null) {
//      int j = defaultTreeTableNode.indexOf((MutableTreeNode)paramDefaultTreeTableNode);
//      if (j != -1) {
//        defaultTreeTableNode.remove(j);
//        this.d.a((Object[])defaultTreeTableNode.getPath(), new int[] { j }, new Object[] { paramDefaultTreeTableNode });
//      }
//    }
//  }
//
//  private void a(DefaultTreeTableNode paramDefaultTreeTableNode1, DefaultTreeTableNode paramDefaultTreeTableNode2, DefaultTreeTableNode paramDefaultTreeTableNode3, Object paramObject) {
//    if (paramObject == null) {
//      a(paramDefaultTreeTableNode2);
//    } else {
//      paramDefaultTreeTableNode2.setValue(paramObject);
//      a(paramDefaultTreeTableNode1, paramDefaultTreeTableNode2, paramDefaultTreeTableNode3);
//    }
//  }
//
//  private Object a(Object paramObject) {
//    return (paramObject == null) ? "-" : ((paramObject instanceof List) ? paramObject : paramObject.toString());
//  }
//
//  public void a() {}
//}
