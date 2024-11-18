package com.daniilpuris.lesson22.homework

fun <K> Map<K, List<K>>?.nullMap(index: Int): Map<String, K?>? {

    return this?.mapKeys { entry ->
        entry.key.toString()
    }?.mapValues { entry ->
        entry.value.getOrNull(index)
    }
}