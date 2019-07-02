// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface UpdateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.UpdateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1;</code>
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1;</code>
   */
  com.google.cloud.talent.v4beta1.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The Job to be updated.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Job job = 1;</code>
   */
  com.google.cloud.talent.v4beta1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional but strongly recommended to be provided for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask]
   * is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated.
   * Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended to be provided for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask]
   * is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated.
   * Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional but strongly recommended to be provided for the best service
   * experience.
   * If [update_mask][google.cloud.talent.v4beta1.UpdateJobRequest.update_mask]
   * is provided, only the specified fields in
   * [job][google.cloud.talent.v4beta1.UpdateJobRequest.job] are updated.
   * Otherwise all the fields are updated.
   * A field mask to restrict the fields that are updated. Only
   * top level fields of [Job][google.cloud.talent.v4beta1.Job] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
