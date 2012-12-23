//
// Generated by JTB 1.2.2
//

package org.postgresql.stado.parser.core.syntaxtree;

/**
 * Grammar production:
 * f0 -> <POSITION_>
 *       | <DATE_>
 *       | <DAY_>
 *       | <QUARTER_>
 *       | <TIME_>
 *       | <TIMESTAMP_>
 *       | <WITH_TIMEZONE_>
 *       | <WITHOUT_TIMEZONE_>
 *       | <DATETIME_>
 *       | <SAMLLDATETIME_>
 *       | <PASSWORD_>
 *       | <AVERAGE_>
 *       | <SQRT_>
 *       | <COUNT_>
 *       | <EXTRACT_>
 *       | <MAX_>
 *       | <CURRENTDATE_>
 *       | <CURRENT_TIME_>
 *       | <CURRENT_TIMESTAMP_>
 *       | <TRUNC_>
 *       | <TRUNCATE_>
 *       | <USER_>
 *       | <YEAR_>
 *       | <LENGTH_>
 *       | <LOWER_>
 *       | <MONTH_>
 *       | <HOUR_>
 *       | <MINUTE_>
 *       | <SECOND_>
 *       | <SUBSTRING_>
 *       | <NOW_>
 *       | <ADDDATE_>
 *       | <ADDTIME_>
 *       | <DAYNAME_>
 *       | <SUBDATE_>
 *       | <SUBTIME_>
 *       | <DATEDIFF_>
 *       | <MONTHNAME_>
 *       | <DAYOFWEEK_>
 *       | <DAYOFYEAR_>
 *       | <DAYOFMONTH_>
 *       | <WEEKOFYEAR_>
 *       | <WEEK_>
 *       | <ABS_>
 *       | <CEIL_>
 *       | <CEILING_>
 *       | <EXP_>
 *       | <FLOOR_>
 *       | <LN_>
 *       | <LOG_>
 *       | <LOG10_>
 *       | <PI_>
 *       | <POWER_>
 *       | <ROUND_>
 *       | <SIGN_>
 *       | <ASIN_>
 *       | <ATAN_>
 *       | <ATAN2_>
 *       | <ATN2_>
 *       | <COS_>
 *       | <ACOS_>
 *       | <COSH_>
 *       | <COT_>
 *       | <DEGREE_>
 *       | <RADIANS_>
 *       | <SIN_>
 *       | <TAN_>
 *       | <DATABASE_>
 *       | <VALUE_>
 *       | <VERSION_>
 *       | <MIN_>
 *       | <STDDEV_>
 *       | <STDDEV_POP_>
 *       | <STDDEV_SAMP_>
 *       | <SUM_>
 *       | <VARIANCE_>
 *       | <VARIANCE_POP_>
 *       | <VARIANCE_SAMP_>
 *       | <VAR_POP_>
 *       | <VAR_SAMP_>
 *       | <ASCII_>
 *       | <LPAD_>
 *       | <RPAD_>
 *       | <LTRIM_>
 *       | <REPLACE_>
 *       | <RTRIM_>
 *       | <SUBSTR_>
 *       | <TRIM_>
 *       | <UPPER_>
 *       | <FIXED_>
 *       | <GREATEST_>
 *       | <LEAST_>
 *       | <INSTR_>
 *       | <SOUNDEX_>
 *       | <INITCAP_>
 *       | <LFILL_>
 *       | <MAPCHAR_>
 *       | <NUM_>
 *       | <CONCAT_WORD>
 *       | <CURTIME_>
 *       | <CURDATE_>
 *       | <TIMEOFDAY_>
 *       | <ISFINITE_>
 *       | <DATETRUNC_>
 *       | <DATEPART_>
 *       | <AGE_>
 *       | <LOCALTIME_>
 *       | <LOCALTIMESTAMP_>
 *       | <BIT_LENGTH_>
 *       | <CHAR_LENGTH_>
 *       | <CHARACTER_LENGTH_>
 *       | <CONVERT_>
 *       | <OCTET_LENGTH_>
 *       | <OVERLAY_>
 *       | <PLACING_>
 *       | <STORAGE_>
 *       | <TYPE_>
 *       | <BTRIM_>
 *       | <CHR_>
 *       | <DECODE_>
 *       | <ENCODE_>
 *       | <MD5_>
 *       | <PG_CLIENT_ENCODING_>
 *       | <QUOTE_IDENT_>
 *       | <QUOTE_LITERAL_>
 *       | <REPEAT_>
 *       | <SPLIT_PART_>
 *       | <STRPOS_>
 *       | <TO_ASCII_>
 *       | <TO_HEX_>
 *       | <TRANSLATE_>
 *       | <WIDTH_BUCKET_>
 *       | <SETSEED_>
 *       | <RANDOM_>
 *       | <CBRT_>
 *       | <GET_BIT_>
 *       | <GET_BYTE_>
 *       | <TO_DATE_>
 *       | <CLOCK_TIMESTAMP_>
 *       | <STATEMENT_TIMESTAMP_>
 *       | <TRANSACTION_TIMESTAMP_>
 *       | <SMALLINT_>
 *       | <TINYINT_>
 *       | <INT2_>
 *       | <BYTEA_>
 *       | <BIGINT_>
 *       | <INT8_>
 *       | <BIGINTEGER_>
 *       | <INT_>
 *       | <INTEGER_>
 *       | <INT4_>
 *       | <REAL_>
 *       | <SMALLFLOAT_>
 *       | <FLOAT_>
 *       | <FLOAT4_>
 *       | <FLOAT8_>
 *       | <DECIMAL_>
 *       | <NUMERIC_>
 *       | <SMALLMONEY_>
 *       | <MONEY_>
 *       | <NUMBER_>
 *       | <CHAR_>
 *       | <CHARACHTER_>
 *       | <VARCHAR_>
 *       | <TINYTEXT_>
 *       | <VARCHAR2_>
 *       | <DATE_>
 *       | <TIME_>
 *       | <TIMESTAMP_>
 *       | <DEC_>
 *       | <DOUBLE_PRECISION_>
 *       | <NCHAR_>
 *       | <NATIONAL_>
 *       | <VARYING_>
 *       | <BOOLEAN_>
 *       | <INTERVAL_>
 *       | <TEXT_>
 *       | <MEDIUMTEXT_>
 *       | <LVARCHAR_>
 *       | <LONGTEXT_>
 *       | <LONG_VARCHAR_>
 *       | <LONG_>
 *       | <CLOB_>
 *       | <BLOB_>
 *       | <BINARY_>
 *       | <VARBINARY_>
 *       | <RAW_>
 *       | <LONG_RAW_>
 *       | <IMAGE_>
 *       | <BYTE_>
 *       | <CLUSTER_>
 *       | <CURRENT_USER_>
 *       | <NULLIF_>
 *       | <SET_BIT_>
 *       | <SET_BYTE_>
 *       | <TO_CHAR_>
 *       | <TO_NUMBER_>
 *       | <TO_TIMESTAMP_>
 *       | <ADD_MONTHS_>
 *       | <JUSTIFY_DAYS_>
 *       | <JUSTIFY_HOURS_>
 *       | <JUSTIFY_INTERVAL_>
 *       | <LAST_DAY_>
 *       | <MONTHS_BETWEEN_>
 *       | <NEXT_DAY_>
 *       | <CURRENT_DATABASE_>
 *       | <CURRENT_SCHEMA_>
 *       | <BIT_AND_>
 *       | <BIT_OR_>
 *       | <BOOL_AND_>
 *       | <BOOL_OR_>
 *       | <EVERY_>
 *       | <CORR_>
 *       | <COVAR_POP_>
 *       | <COVAR_SAMP_>
 *       | <REGR_AVGX_>
 *       | <REGR_AVGY_>
 *       | <REGR_COUNT_>
 *       | <REGR_INTERCEPT_>
 *       | <REGR_R2_>
 *       | <REGR_SLOPE_>
 *       | <REGR_SXX_>
 *       | <REGR_SXY_>
 *       | <REGR_SYY_>
 *       | <REGEXP_REPLACE_>
 *       | <ABBREV_>
 *       | <BROADCAST_>
 *       | <FAMILY_>
 *       | <HOST_>
 *       | <HOSTMASK_>
 *       | <MASKLEN_>
 *       | <NETMASK_>
 *       | <NETWORK_>
 *       | <SET_MASKLEN_>
 *       | <GEOMETRY_>
 *       | <BOX2D_>
 *       | <BOX3D_>
 *       | <BOX3DEXTENT_>
 *       | <REGCLASS_>
 *       | <ST_ASTEXT_>
 *       | <ST_TRANSFORM_>
 *       | <ST_DISTANCE_>
 *       | <ST_DWITHIN_>
 *       | <ST_LENGTH_>
 *       | <ST_AREA_>
 *       | <ST_ASBINARY_>
 *       | <ST_BOUNDARY_>
 *       | <ST_BUFFER_>
 *       | <ST_CENTROID_>
 *       | <ST_ADDMEASURE_>
 *       | <ST_ADDPOINT_>
 *       | <ST_AFFINE_>
 *       | <ST_AREA2D_>
 *       | <ST_ASEWKB_>
 *       | <ST_ASEWKT_>
 *       | <ST_ASGEOJSON_>
 *       | <ST_ASGML_>
 *       | <ST_ASHEXEWKB_>
 *       | <ST_ASKML_>
 *       | <ST_ASSVG_>
 *       | <ST_AZIMUTH_>
 *       | <ST_BDMPOLYFROMTEXT_>
 *       | <ST_BDPOLYFROMTEXT_>
 *       | <ST_BUILDAREA_>
 *       | <ST_BYTEA_>
 *       | <ST_CHIP_IN_>
 *       | <ST_CHIP_OUT_>
 *       | <ST_CLOSESTPOINT_>
 *       | <ST_COLLECT_>
 *       | <ST_COLLECTIONEXTRACT_>
 *       | <ST_COMBINE_BBOX_>
 *       | <ST_COMPRESSION_>
 *       | <ST_CONTAINS_>
 *       | <ST_CONTAINSPROPERLY_>
 *       | <ST_CONVEXHULL_>
 *       | <ST_COORDDIM_>
 *       | <ST_COVEREDBY_>
 *       | <ST_COVERS_>
 *       | <ST_CROSSES_>
 *       | <ST_CURVETOLINE_>
 *       | <ST_DATATYPE_>
 *       | <ST_DFULLYWITHIN_>
 *       | <ST_DIFFERENCE_>
 *       | <ST_DIMENSION_>
 *       | <ST_DISJOINT_>
 *       | <ST_DISTANCE_SPHERE_>
 *       | <ST_DISTANCE_SPHEROID_>
 *       | <ST_ENDPOINT_>
 *       | <ST_ENVELOPE_>
 *       | <ST_EQUALS_>
 *       | <ST_EXTERIORRING_>
 *       | <ST_EXTENT_>
 *       | <ST_EXTENT3D_>
 *       | <ST_FACTOR_>
 *       | <ST_FIND_EXTENT_>
 *       | <ST_FORCERHR_>
 *       | <ST_FORCE_2D_>
 *       | <ST_FORCE_3D_>
 *       | <ST_FORCE_3DM_>
 *       | <ST_FORCE_3DZ_>
 *       | <ST_FORCE_4D_>
 *       | <ST_FORCE_COLLECTION_>
 *       | <ST_GEOGFROMTEXT_>
 *       | <ST_GEOGFROMWKB_>
 *       | <ST_GEOGRAPHYFROMTEXT_>
 *       | <ST_GEOHASH_>
 *       | <ST_GEOMCOLLFROMTEXT_>
 *       | <ST_GEOMCOLLFROMWKB_>
 *       | <ST_GEOMETRYTYPE_>
 *       | <ST_GEOMFROMEWKB_>
 *       | <ST_GEOMFROMEWKT_>
 *       | <ST_GEOMFROMGML_>
 *       | <ST_GEOMFROMKML_>
 *       | <ST_GEOMFROMTEXT_>
 *       | <ST_GEOMFROMWKB_>
 *       | <ST_GMLTOSQL_>
 *       | <ST_HASARC_>
 *       | <ST_HAUSDORFFDISTANCE_>
 *       | <ST_HEIGHT_>
 *       | <ST_INTERIORRINGN_>
 *       | <ST_INTERSECTION_>
 *       | <ST_INTERSECTS_>
 *       | <ST_ISCLOSED_>
 *       | <ST_ISEMPTY_>
 *       | <ST_ISRING_>
 *       | <ST_ISSIMPLE_>
 *       | <ST_ISVALID_>
 *       | <ST_ISVALIDREASON_>
 *       | <ST_LENGTH2D_>
 *       | <ST_LENGTH2D_SPHEROID_>
 *       | <ST_LENGTH3D_>
 *       | <ST_LENGTH3D_SPHEROID_>
 *       | <ST_LENGTH_SPHEROID_>
 *       | <ST_LINECROSSINGDIRECTION_>
 *       | <ST_LINEFROMMULTIPOINT_>
 *       | <ST_LINEFROMTEXT_>
 *       | <ST_LINEFROMWKB_>
 *       | <ST_LINEMERGE_>
 *       | <ST_LINESTRINGFROMWKB_>
 *       | <ST_LINETOCURVE_>
 *       | <ST_LINE_INTERPOLATE_POINT_>
 *       | <ST_LINE_LOCATE_POINT_>
 *       | <ST_LINE_SUBSTRING_>
 *       | <ST_LOCATEBETWEENELEVATIONS_>
 *       | <ST_LOCATE_ALONG_MEASURE_>
 *       | <ST_LOCATE_BETWEEN_MEASURES_>
 *       | <ST_LONGESTLINE_>
 *       | <ST_M_>
 *       | <ST_MAKEENVELOPE_>
 *       | <ST_MAKEPOINT_>
 *       | <ST_MAKEPOINTM_>
 *       | <ST_MAKEPOLYGON_>
 *       | <ST_MAXDISTANCE_>
 *       | <ST_MEMCOLLECT_>
 *       | <ST_MEM_SIZE_>
 *       | <ST_MINIMUMBOUNDINGCIRCLE_>
 *       | <ST_MLINEFROMTEXT_>
 *       | <ST_MLINEFROMWKB_>
 *       | <ST_MPOINTFROMTEXT_>
 *       | <ST_MPOINTFROMWKB_>
 *       | <ST_MPOLYFROMTEXT_>
 *       | <ST_MPOLYFROMWKB_>
 *       | <ST_MULTI_>
 *       | <ST_MULTILINEFROMWKB_>
 *       | <ST_MULTILINESTRINGFROMTEXT_>
 *       | <ST_MULTIPOINTFROMTEXT_>
 *       | <ST_MULTIPOINTFROMWKB_>
 *       | <ST_MULTIPOLYFROMWKB_>
 *       | <ST_MULTIPOLYGONFROMTEXT_>
 *       | <ST_NDIMS_>
 *       | <ST_NPOINTS_>
 *       | <ST_NRINGS_>
 *       | <ST_NUMGEOMETRIES_>
 *       | <ST_NUMINTERIORRING_>
 *       | <ST_NUMINTERIORRINGS_>
 *       | <ST_NUMPOINTS_>
 *       | <ST_ORDERINGEQUALS_>
 *       | <ST_OVERLAPS_>
 *       | <ST_PERIMETER_>
 *       | <ST_PERIMETER2D_>
 *       | <ST_PERIMETER3D_>
 *       | <ST_POINT_>
 *       | <ST_POINTFROMTEXT_>
 *       | <ST_POINTFROMWKB_>
 *       | <ST_POINTN_>
 *       | <ST_POINTONSURFACE_>
 *       | <ST_POINT_INSIDE_CIRCLE_>
 *       | <ST_POLYFROMTEXT_>
 *       | <ST_POLYFROMWKB_>
 *       | <ST_POLYGON_>
 *       | <ST_POLYGONFROMTEXT_>
 *       | <ST_POLYGONFROMWKB_>
 *       | <ST_POSTGIS_GIST_JOINSEL_>
 *       | <ST_POSTGIS_GIST_SEL_>
 *       | <ST_RELATE_>
 *       | <ST_REMOVEPOINT_>
 *       | <ST_REVERSE_>
 *       | <ST_ROTATE_>
 *       | <ST_ROTATEX_>
 *       | <ST_ROTATEY_>
 *       | <ST_ROTATEZ_>
 *       | <ST_SCALE_>
 *       | <ST_SEGMENTIZE_>
 *       | <ST_SETFACTOR_>
 *       | <ST_SETPOINT_>
 *       | <ST_SETSRID_>
 *       | <ST_SHIFT_LONGITUDE_>
 *       | <ST_SHORTESTLINE_>
 *       | <ST_SIMPLIFY_>
 *       | <ST_SIMPLIFYPRESERVETOPOLOGY_>
 *       | <ST_SNAPTOGRID_>
 *       | <ST_SRID_>
 *       | <ST_STARTPOINT_>
 *       | <ST_SUMMARY_>
 *       | <ST_SYMDIFFERENCE_>
 *       | <ST_SYMMETRICDIFFERENCE_>
 *       | <ST_TEXT_>
 *       | <ST_TOUCHES_>
 *       | <ST_TRANSLATE_>
 *       | <ST_TRANSSCALE_>
 *       | <ST_WIDTH_>
 *       | <ST_WITHIN_>
 *       | <ST_WKBTOSQL_>
 *       | <ST_WKTTOSQL_>
 *       | <ST_X_>
 *       | <ST_Y_>
 *       | <ST_Z_>
 *       | <ST_ZMFLAG_>
 *       | <ST_BOX2D_>
 *       | <ST_BOX3D_>
 *       | <ST_GEOMETRY_>
 *       | <ST_GEOMETRYN_>
 *       | <SETPOINT_>
 *       | <ASEWKT_>
 *       | <SIMPLIFY_>
 *       | <ASTEXT_>
 *       | <REMOVEPOINT_>
 *       | <NPOINTS_>
 *       | <NRINGS_>
 *       | <MEM_SIZE_>
 *       | <NUMGEOMETRIES_>
 *       | <POSTGIS_DROPBBOX_>
 *       | <DROPBBOX_>
 *       | <SETSRID_>
 *       | <MULTI_>
 *       | <FORCE_2D_>
 *       | <FORCE_3D_>
 *       | <FORCE_3DM_>
 *       | <FORCE_3DZ_>
 *       | <FORCE_4D_>
 *       | <SEGMENTIZE_>
 *       | <FORCE_COLLECTION_>
 *       | <ASBINARY_>
 *       | <EXTENT_>
 *       | <EXTENT3D_>
 *       | <COLLECT_>
 *       | <LOCATE_ALONG_MEASURE_>
 *       | <LOCATE_BETWEEN_MEASURES_>
 *       | <LINE_LOCATE_POINT_>
 *       | <LINE_SUBSTRING_>
 *       | <LINE_INTERPOLATE_POINT_>
 *       | <GEOMFROMTEXT_>
 *       | <GEOMFROMEWKT_>
 *       | <ADDGEOMETRYCOLUMN_>
 *       | <GEOMETRYTYPE_>
 *       | <ZMFLAG_>
 *       | <ASEWKB_>
 *       | <SNAPTOGRID_>
 *       | <SCALE_>
 *       | <ROTATEZ_>
 *       | <ROTATE_>
 *       | <ROTATEX_>
 *       | <ROTATEY_>
 *       | <TRANSSCALE_>
 *       | <AREA2D_>
 *       | <PERIMETER2D_>
 *       | <PERIMETER3D_>
 *       | <LENGTH2D_>
 *       | <LENGTH3D_>
 *       | <DISTANCE_>
 *       | <SRID_>
 *       | <WITHIN_>
 *       | <DISJOINT_>
 *       | <INTERSECTS_>
 *       | <CONTAINS_>
 *       | <ASKML_>
 *       | <NDIMS_>
 *       | <ISVALID_>
 *       | <DIMENSION_>
 *       | <GEOMETRYN_>
 *       | <ASHEXEWKB_>
 *       | <ISCLOSED_>
 *       | <ISSIMPLE_>
 *       | <ISRING_>
 *       | <DIFFERENCE_>
 *       | <LINEMERGE_>
 *       | <INTERSECTION_>
 *       | <SYMDIFFERENCE_>
 *       | <WORD_EQUALS_>
 *       | <ENVELOPE_>
 *       | <ISEMPTY_>
 *       | <STARTPOINT_>
 *       | <ENDPOINT_>
 *       | <EXTERIORRING_>
 *       | <NUMINTERIORRINGS_>
 *       | <INTERIORRINGN_>
 *       | <TRANSFORM_>
 *       | <X_>
 *       | <Y_>
 *       | <Z_>
 *       | <SPATIAL_>
 *       | <PORT_>
 */
public class UnreservedWords implements Node {
   public NodeChoice f0;

   public UnreservedWords(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(org.postgresql.stado.parser.core.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(org.postgresql.stado.parser.core.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

