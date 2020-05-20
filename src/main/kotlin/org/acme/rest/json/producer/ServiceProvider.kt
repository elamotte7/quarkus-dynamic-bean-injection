package org.acme.rest.json.producer

import org.acme.rest.json.enum.ServiceType
import org.acme.rest.json.service.IService
import org.acme.rest.json.service.impl.ServiceAImpl
import org.acme.rest.json.service.impl.ServiceBImpl
import org.eclipse.microprofile.config.inject.ConfigProperty
import javax.enterprise.context.Dependent
import javax.enterprise.inject.Produces
import javax.inject.Inject
import javax.inject.Singleton

@Dependent
class ServiceProvider @Inject constructor(
        @ConfigProperty(name = "inject.service.impl")
        private val serviceProvider: String
) {
    @Produces
    @Singleton
    fun getServiceImpl(): IService {
        return when (serviceProvider.toUpperCase()) {
            ServiceType.SERVICEA.toString() -> ServiceAImpl()
            else -> ServiceBImpl()
        }
    }

}