// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface SigningValidatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.SigningValidator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.github.jtendermint.jabci.types.Validator validator = 1;</code>
   */
  boolean hasValidator();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.Validator validator = 1;</code>
   */
  Validator getValidator();
  /**
   * <code>optional .com.github.jtendermint.jabci.types.Validator validator = 1;</code>
   */
  ValidatorOrBuilder getValidatorOrBuilder();

  /**
   * <code>optional bool signed_last_block = 2;</code>
   */
  boolean getSignedLastBlock();
}
