package com.ozon.OzonTestApp.dto

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "complex_id", "id", "values"
)
class AttributeDTO {
    @JsonProperty("complex_id")
    var complexId: Int? = null

    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("values")
    var valueDTOS: List<ValueDTO>? = null

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