/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface CertificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Certification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of license or certification.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name of license or certification.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   *
   * @return Whether the acquireDate field is set.
   */
  boolean hasAcquireDate();
  /**
   *
   *
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   *
   * @return The acquireDate.
   */
  com.google.type.Date getAcquireDate();
  /**
   *
   *
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   */
  com.google.type.DateOrBuilder getAcquireDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   *
   * @return Whether the expireDate field is set.
   */
  boolean hasExpireDate();
  /**
   *
   *
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   *
   * @return The expireDate.
   */
  com.google.type.Date getExpireDate();
  /**
   *
   *
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   */
  com.google.type.DateOrBuilder getExpireDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Authority of license, such as government.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string authority = 4;</code>
   *
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   *
   *
   * <pre>
   * Authority of license, such as government.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string authority = 4;</code>
   *
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString getAuthorityBytes();

  /**
   *
   *
   * <pre>
   * Description of license or certification.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of license or certification.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
