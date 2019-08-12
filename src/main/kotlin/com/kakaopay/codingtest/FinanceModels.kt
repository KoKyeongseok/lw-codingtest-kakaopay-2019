package com.kakaopay.codingtest

import com.fasterxml.jackson.annotation.JsonProperty

data class AllFinanceInfoByYear (
        val name: String,
        val data: List<FinanceInfoByYear>
)

data class FinanceInfoByYear (
        val year: Int,
        @JsonProperty("total_amount")
        val totalAmount: Int,
        @JsonProperty("detail_amount")
        val detailAmount: Map<String, Int>
)
