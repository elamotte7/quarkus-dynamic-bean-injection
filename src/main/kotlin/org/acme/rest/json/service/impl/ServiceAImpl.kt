package org.acme.rest.json.service.impl

import org.acme.rest.json.service.IService
import javax.enterprise.inject.Vetoed

@Vetoed
class ServiceAImpl : IService {

    override fun greetings() : String = "Hello World from Service A !"
}