/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class StreamStat {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StreamStat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StreamStat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_StreamStat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRtcp(RtcpStat value) {
    pjsua2JNI.StreamStat_rtcp_set(swigCPtr, this, RtcpStat.getCPtr(value), value);
  }

  public RtcpStat getRtcp() {
    long cPtr = pjsua2JNI.StreamStat_rtcp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RtcpStat(cPtr, false);
  }

  public void setJbuf(JbufState value) {
    pjsua2JNI.StreamStat_jbuf_set(swigCPtr, this, JbufState.getCPtr(value), value);
  }

  public JbufState getJbuf() {
    long cPtr = pjsua2JNI.StreamStat_jbuf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new JbufState(cPtr, false);
  }

  public StreamStat() {
    this(pjsua2JNI.new_StreamStat(), true);
  }

}
