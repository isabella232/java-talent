// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface LocationFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.LocationFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * </pre>
   *
   * <code>string address = 1;</code>
   */
  java.lang.String getAddress();
  /**
   *
   *
   * <pre>
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * </pre>
   *
   * <code>string address = 1;</code>
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional. CLDR region code of the country/region of the address. This is
   * used to address ambiguity of the user-input location, for example,
   * "Liverpool" against "Liverpool, NY, US" or "Liverpool, UK".
   * Set this field if all the jobs to search against are from a same region,
   * or jobs are world-wide, but the job seeker is from a specific region.
   * See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * Note that this filter is not applicable for Profile Search related queries.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * Optional. CLDR region code of the country/region of the address. This is
   * used to address ambiguity of the user-input location, for example,
   * "Liverpool" against "Liverpool, NY, US" or "Liverpool, UK".
   * Set this field if all the jobs to search against are from a same region,
   * or jobs are world-wide, but the job seeker is from a specific region.
   * See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * Note that this filter is not applicable for Profile Search related queries.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The latitude and longitude of the geographic center from which to
   * search. This field's ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   */
  boolean hasLatLng();
  /**
   *
   *
   * <pre>
   * Optional. The latitude and longitude of the geographic center from which to
   * search. This field's ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   */
  com.google.type.LatLng getLatLng();
  /**
   *
   *
   * <pre>
   * Optional. The latitude and longitude of the geographic center from which to
   * search. This field's ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The distance_in_miles is applied when the location being searched
   * for is identified as a city or smaller. When the location being searched
   * for is a state or larger, this field is ignored.
   * </pre>
   *
   * <code>double distance_in_miles = 4;</code>
   */
  double getDistanceInMiles();

  /**
   *
   *
   * <pre>
   * Optional. Allows the client to return jobs without a
   * set location, specifically, telecommuting jobs (telecommuting is considered
   * by the service as a special location.
   * [Job.posting_region][google.cloud.talent.v4beta1.Job.posting_region]
   * indicates if a job permits telecommuting. If this field is set to
   * [TelecommutePreference.TELECOMMUTE_ALLOWED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_ALLOWED],
   * telecommuting jobs are searched, and
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] and
   * [lat_lng][google.cloud.talent.v4beta1.LocationFilter.lat_lng] are ignored.
   * If not set or set to
   * [TelecommutePreference.TELECOMMUTE_EXCLUDED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_EXCLUDED],
   * telecommute job are not searched.
   * This filter can be used by itself to search exclusively for telecommuting
   * jobs, or it can be combined with another location
   * filter to search for a combination of job locations,
   * such as "Mountain View" or "telecommuting" jobs. However, when used in
   * combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference telecommute_preference = 5;
   * </code>
   */
  int getTelecommutePreferenceValue();
  /**
   *
   *
   * <pre>
   * Optional. Allows the client to return jobs without a
   * set location, specifically, telecommuting jobs (telecommuting is considered
   * by the service as a special location.
   * [Job.posting_region][google.cloud.talent.v4beta1.Job.posting_region]
   * indicates if a job permits telecommuting. If this field is set to
   * [TelecommutePreference.TELECOMMUTE_ALLOWED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_ALLOWED],
   * telecommuting jobs are searched, and
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] and
   * [lat_lng][google.cloud.talent.v4beta1.LocationFilter.lat_lng] are ignored.
   * If not set or set to
   * [TelecommutePreference.TELECOMMUTE_EXCLUDED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_EXCLUDED],
   * telecommute job are not searched.
   * This filter can be used by itself to search exclusively for telecommuting
   * jobs, or it can be combined with another location
   * filter to search for a combination of job locations,
   * such as "Mountain View" or "telecommuting" jobs. However, when used in
   * combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference telecommute_preference = 5;
   * </code>
   */
  com.google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference getTelecommutePreference();

  /**
   *
   *
   * <pre>
   * Optional. Whether to apply negation to the filter so profiles matching the
   * filter are excluded.
   * Currently only supported in profile search.
   * </pre>
   *
   * <code>bool negated = 6;</code>
   */
  boolean getNegated();
}
