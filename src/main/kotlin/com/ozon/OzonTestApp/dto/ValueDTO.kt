package com.ozon.OzonTestApp.dto

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "dictionary_value_id", "value"
)
class ValueDTO {
    @JsonProperty("dictionary_value_id")
    var dictionaryValueId: Int? = null

    @JsonProperty("value")
    var value: String? = null

    @JsonIgnore
    private val additionalProperties: MutableMap<String, Any> = LinkedHashMap()

    @JsonAnyGetter
    fun getAdditionalProperties(): Map<String, Any> {
        return this.additionalProperties
    }

    @JsonAnySetter
    fun setAdditionalProperty(name: String, value: Any) {
        additionalProperties[name] = value
    }
}