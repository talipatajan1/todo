package com.example.to_docompose.util

import kotlinx.serialization.Serializable

@Serializable
enum class Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}