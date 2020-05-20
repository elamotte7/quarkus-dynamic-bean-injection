package org.acme.rest.json.service.impl

import org.acme.rest.json.service.IService
import javax.enterprise.inject.Vetoed

@Vetoed
class ServiceBImpl : IService {

    override fun greetings() : String = "Hello World from Service B !"
}