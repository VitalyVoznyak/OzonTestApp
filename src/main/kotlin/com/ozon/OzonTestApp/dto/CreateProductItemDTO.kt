package com.ozon.OzonTestApp.dto

import com.fasterxml.jackson.annotation.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "items"
)
class CreateProductItemDTO {
    @JsonProperty("items")
    var itemDTOS: List<ItemDTO>? = null
    @JsonIgnore
    val additionalProperties: MutableMap<String, Any> = LinkedHashMap()
}