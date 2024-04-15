package com.ozon.OzonTestApp.dto

import com.fasterxml.jackson.annotation.*

class ItemDTO {
    @JsonProperty("attributes")
    var attributes: List<AttributeDTO>? = null

    @JsonProperty("barcode")
    var barcode: String? = null

    @JsonProperty("description_category_id")
    var descriptionCategoryId: Int? = null

    @JsonProperty("color_image")
    var colorImage: String? = null

    @JsonProperty("complex_attributes")
    var complexAttributes: List<Any>? = null

    @JsonProperty("currency_code")
    var currencyCode: String? = null

    @JsonProperty("depth")
    var depth: Int? = null

    @JsonProperty("dimension_unit")
    var dimensionUnit: String? = null

    @JsonProperty("height")
    var height: Int? = null

    @JsonProperty("images")
    lateinit var images: List<Any>

    @JsonProperty("images360")
    var images360: List<Any>? = null

    @JsonProperty("name")
    lateinit var name: String

    @JsonProperty("offer_id")
    lateinit var offerId: String

    @JsonProperty("old_price")
    var oldPrice: String? = null

    @JsonProperty("pdf_list")
    var pdfList: List<Any>? = null

    @JsonProperty("premium_price")
    var premiumPrice: String? = null

    @JsonProperty("price")
    lateinit var price: String

    @JsonProperty("primary_image")
    var primaryImage: String? = null

    @JsonProperty("vat")
    lateinit var vat: String

    @JsonProperty("weight")
    var weight: Int? = null

    @JsonProperty("weight_unit")
    var weightUnit: String? = null

    @JsonProperty("width")
    var width: Int? = null

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