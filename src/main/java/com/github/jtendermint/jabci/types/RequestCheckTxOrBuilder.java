// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface RequestCheckTxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.RequestCheckTx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes tx = 1;</code>
   */
  com.google.protobuf.ByteString getTx();

  /**
   * <code>.com.github.jtendermint.jabci.types.CheckTxType type = 2;</code>
   */
  int getTypeValue();
  /**
   * <code>.com.github.jtendermint.jabci.types.CheckTxType type = 2;</code>
   */
  com.github.jtendermint.jabci.types.CheckTxType getType();
}
