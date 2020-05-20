package org.acme.rest.json.enum

enum class ServiceType {
    SERVICEA, SERVICEB;

    companion object {
        fun getByName(name: String): ServiceType? {
            return try {
                valueOf(name.toUpperCase())
            } catch (e: Exception) {
                null
            }
        }
    }
}
