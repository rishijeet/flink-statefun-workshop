// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

package com.ververica.statefun.workshop.generated;

public interface MerchantMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MerchantMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MerchantMetadata.Address address = 1;</code>
   */
  boolean hasAddress();
  /**
   * <code>.MerchantMetadata.Address address = 1;</code>
   */
  com.ververica.statefun.workshop.generated.MerchantMetadata.Address getAddress();
  /**
   * <code>.MerchantMetadata.Address address = 1;</code>
   */
  com.ververica.statefun.workshop.generated.MerchantMetadata.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>int32 remaining_attempts = 2;</code>
   */
  int getRemainingAttempts();
}