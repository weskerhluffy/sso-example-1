// Place your Spring DSL code here
//import org.codehaus.groovy.grails.plugins.springsecurity.cas.CasUserDetailsService

beans = {
	userDetailsFromDomainClassFactory(mx.mierda.ass.CacaUserDetailsFromDomainClassFactory)
	//	authenticationUserDetailsService(org.codehaus.groovy.grails.plugins.springsecurity.cas.CasAuthenticationUserDetailsService)
	//	domainUserMapperService(org.codehaus.groovy.grails.plugins.springsecurity.cas.DomainUserMapperService)
	//	userMapper(org.codehaus.groovy.grails.plugins.springsecurity.cas.DomainUserMapperService)
	registrar(codeisdesign.example.sso.mierda.CustomPropertyEditorRegistrar)
	configurer(org.springframework.beans.factory.config.CustomEditorConfigurer) {
		propertyEditorRegistrars = [ref("registrar")]
	}
}
