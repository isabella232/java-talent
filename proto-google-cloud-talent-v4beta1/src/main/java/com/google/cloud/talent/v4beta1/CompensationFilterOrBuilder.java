// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface CompensationFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompensationFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Type of filter.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationFilter.FilterType type = 1;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of filter.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationFilter.FilterType type = 1;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationFilter.FilterType getType();

  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit> getUnitsList();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2;</code>
   */
  int getUnitsCount();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit getUnits(int index);
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2;</code>
   */
  java.util.List<java.lang.Integer> getUnitsValueList();
  /**
   *
   *
   * <pre>
   * Required. Specify desired `base compensation entry's`
   * [CompensationInfo.CompensationUnit][google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit].
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.CompensationInfo.CompensationUnit units = 2;</code>
   */
  int getUnitsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   */
  boolean hasRange();
  /**
   *
   *
   * <pre>
   * Optional. Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange getRange();
  /**
   *
   *
   * <pre>
   * Optional. Compensation range.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompensationInfo.CompensationRange range = 3;</code>
   */
  com.google.cloud.talent.v4beta1.CompensationInfo.CompensationRangeOrBuilder getRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, jobs with unspecified compensation range fields
   * are included.
   * </pre>
   *
   * <code>bool include_jobs_with_unspecified_compensation_range = 4;</code>
   */
  boolean getIncludeJobsWithUnspecifiedCompensationRange();
}
