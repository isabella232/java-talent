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
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public final class ProfileServiceProto {
  private ProfileServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/profile_se"
          + "rvice.proto\022\033google.cloud.talent.v4beta1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032(goo"
          + "gle/cloud/talent/v4beta1/common.proto\032)g"
          + "oogle/cloud/talent/v4beta1/filters.proto"
          + "\032+google/cloud/talent/v4beta1/histogram."
          + "proto\032)google/cloud/talent/v4beta1/profi"
          + "le.proto\032#google/longrunning/operations."
          + "proto\032\031google/protobuf/any.proto\032\033google"
          + "/protobuf/empty.proto\032 google/protobuf/f"
          + "ield_mask.proto\032\027google/rpc/status.proto"
          + "\"\220\001\n\023ListProfilesRequest\022\023\n\006parent\030\001 \001(\t"
          + "B\003\340A\002\022\016\n\006filter\030\005 \001(\t\022\022\n\npage_token\030\002 \001("
          + "\t\022\021\n\tpage_size\030\003 \001(\005\022-\n\tread_mask\030\004 \001(\0132"
          + "\032.google.protobuf.FieldMask\"g\n\024ListProfi"
          + "lesResponse\0226\n\010profiles\030\001 \003(\0132$.google.c"
          + "loud.talent.v4beta1.Profile\022\027\n\017next_page"
          + "_token\030\002 \001(\t\"\206\001\n\024CreateProfileRequest\0222\n"
          + "\006parent\030\001 \001(\tB\"\340A\002\372A\034\n\032jobs.googleapis.c"
          + "om/Tenant\022:\n\007profile\030\002 \001(\0132$.google.clou"
          + "d.talent.v4beta1.ProfileB\003\340A\002\"F\n\021GetProf"
          + "ileRequest\0221\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033jobs.g"
          + "oogleapis.com/Profile\"\203\001\n\024UpdateProfileR"
          + "equest\022:\n\007profile\030\001 \001(\0132$.google.cloud.t"
          + "alent.v4beta1.ProfileB\003\340A\002\022/\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMask\"I\n\024D"
          + "eleteProfileRequest\0221\n\004name\030\001 \001(\tB#\340A\002\372A"
          + "\035\n\033jobs.googleapis.com/Profile\"\334\003\n\025Searc"
          + "hProfilesRequest\0222\n\006parent\030\001 \001(\tB\"\340A\002\372A\034"
          + "\n\032jobs.googleapis.com/Tenant\022K\n\020request_"
          + "metadata\030\002 \001(\0132,.google.cloud.talent.v4b"
          + "eta1.RequestMetadataB\003\340A\002\022@\n\rprofile_que"
          + "ry\030\003 \001(\0132).google.cloud.talent.v4beta1.P"
          + "rofileQuery\022\021\n\tpage_size\030\004 \001(\005\022\022\n\npage_t"
          + "oken\030\005 \001(\t\022\016\n\006offset\030\006 \001(\005\022\033\n\023disable_sp"
          + "ell_check\030\007 \001(\010\022\020\n\010order_by\030\010 \001(\t\022\033\n\023cas"
          + "e_sensitive_sort\030\t \001(\010\022F\n\021histogram_quer"
          + "ies\030\n \003(\0132+.google.cloud.talent.v4beta1."
          + "HistogramQuery\022\025\n\rresult_set_id\030\014 \001(\t\022\036\n"
          + "\026strict_keywords_search\030\r \001(\010\"\223\003\n\026Search"
          + "ProfilesResponse\022\034\n\024estimated_total_size"
          + "\030\001 \001(\003\022I\n\020spell_correction\030\002 \001(\0132/.googl"
          + "e.cloud.talent.v4beta1.SpellingCorrectio"
          + "n\022?\n\010metadata\030\003 \001(\0132-.google.cloud.talen"
          + "t.v4beta1.ResponseMetadata\022\027\n\017next_page_"
          + "token\030\004 \001(\t\022R\n\027histogram_query_results\030\005"
          + " \003(\01321.google.cloud.talent.v4beta1.Histo"
          + "gramQueryResult\022K\n\023summarized_profiles\030\006"
          + " \003(\0132..google.cloud.talent.v4beta1.Summa"
          + "rizedProfile\022\025\n\rresult_set_id\030\007 \001(\t\"\202\001\n\021"
          + "SummarizedProfile\0226\n\010profiles\030\001 \003(\0132$.go"
          + "ogle.cloud.talent.v4beta1.Profile\0225\n\007sum"
          + "mary\030\002 \001(\0132$.google.cloud.talent.v4beta1"
          + ".Profile2\237\t\n\016ProfileService\022\265\001\n\014ListProf"
          + "iles\0220.google.cloud.talent.v4beta1.ListP"
          + "rofilesRequest\0321.google.cloud.talent.v4b"
          + "eta1.ListProfilesResponse\"@\202\323\344\223\0021\022//v4be"
          + "ta1/{parent=projects/*/tenants/*}/profil"
          + "es\332A\006parent\022\265\001\n\rCreateProfile\0221.google.c"
          + "loud.talent.v4beta1.CreateProfileRequest"
          + "\032$.google.cloud.talent.v4beta1.Profile\"K"
          + "\202\323\344\223\0024\"//v4beta1/{parent=projects/*/tena"
          + "nts/*}/profiles:\001*\332A\016parent,profile\022\242\001\n\n"
          + "GetProfile\022..google.cloud.talent.v4beta1"
          + ".GetProfileRequest\032$.google.cloud.talent"
          + ".v4beta1.Profile\">\202\323\344\223\0021\022//v4beta1/{name"
          + "=projects/*/tenants/*/profiles/*}\332A\004name"
          + "\022\266\001\n\rUpdateProfile\0221.google.cloud.talent"
          + ".v4beta1.UpdateProfileRequest\032$.google.c"
          + "loud.talent.v4beta1.Profile\"L\202\323\344\223\002<27/v4"
          + "beta1/{profile.name=projects/*/tenants/*"
          + "/profiles/*}:\001*\332A\007profile\022\232\001\n\rDeleteProf"
          + "ile\0221.google.cloud.talent.v4beta1.Delete"
          + "ProfileRequest\032\026.google.protobuf.Empty\">"
          + "\202\323\344\223\0021*//v4beta1/{name=projects/*/tenant"
          + "s/*/profiles/*}\332A\004name\022\263\001\n\016SearchProfile"
          + "s\0222.google.cloud.talent.v4beta1.SearchPr"
          + "ofilesRequest\0323.google.cloud.talent.v4be"
          + "ta1.SearchProfilesResponse\"8\202\323\344\223\0022\"-/v4b"
          + "eta1/{parent=projects/*/tenants/*}:searc"
          + "h:\001*\032l\312A\023jobs.googleapis.com\322AShttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/jobsB\201\001\n\037c"
          + "om.google.cloud.talent.v4beta1B\023ProfileS"
          + "erviceProtoP\001ZAgoogle.golang.org/genprot"
          + "o/googleapis/cloud/talent/v4beta1;talent"
          + "\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageToken", "PageSize", "ReadMask",
            });
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor,
            new java.lang.String[] {
              "Profiles", "NextPageToken",
            });
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Profile",
            });
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor,
            new java.lang.String[] {
              "Profile", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "RequestMetadata",
              "ProfileQuery",
              "PageSize",
              "PageToken",
              "Offset",
              "DisableSpellCheck",
              "OrderBy",
              "CaseSensitiveSort",
              "HistogramQueries",
              "ResultSetId",
              "StrictKeywordsSearch",
            });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor,
            new java.lang.String[] {
              "EstimatedTotalSize",
              "SpellCorrection",
              "Metadata",
              "NextPageToken",
              "HistogramQueryResults",
              "SummarizedProfiles",
              "ResultSetId",
            });
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor,
            new java.lang.String[] {
              "Profiles", "Summary",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
