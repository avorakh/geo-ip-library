package dev.avorakh.geoip.pub.jackson;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;


@FieldDefaults(level = AccessLevel.PRIVATE)
@FieldNameConstants(level = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LocationDataConstants {

    String countyIsoCode;
    String timeZone;
}
