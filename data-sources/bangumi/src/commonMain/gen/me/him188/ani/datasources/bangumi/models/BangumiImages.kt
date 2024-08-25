/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package me.him188.ani.datasources.bangumi.models


import kotlinx.serialization.Required
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param large
 * @param common
 * @param medium
 * @param small
 * @param grid 
 */
@Serializable

data class BangumiImages(

    @SerialName(value = "large") @Required val large: kotlin.String,

    @SerialName(value = "common") @Required val common: kotlin.String,

    @SerialName(value = "medium") @Required val medium: kotlin.String,

    @SerialName(value = "small") @Required val small: kotlin.String,

    @SerialName(value = "grid") @Required val grid: kotlin.String

)

