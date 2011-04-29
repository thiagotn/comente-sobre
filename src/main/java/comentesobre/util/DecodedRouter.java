package comentesobre.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import br.com.caelum.vraptor.http.MutableRequest;
import br.com.caelum.vraptor.http.TypeCreator;
import br.com.caelum.vraptor.http.route.DefaultRouter;
import br.com.caelum.vraptor.http.route.MethodNotAllowedException;
import br.com.caelum.vraptor.http.route.RoutesConfiguration;
import br.com.caelum.vraptor.http.route.RoutesParser;
import br.com.caelum.vraptor.http.route.TypeFinder;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.proxy.Proxifier;
import br.com.caelum.vraptor.resource.HttpMethod;
import br.com.caelum.vraptor.resource.ResourceMethod;


public class DecodedRouter {
	
}
//@ApplicationScoped
//@Component 
//public class DecodedRouter extends DefaultRouter {
//
//	public DecodedRouter(RoutesConfiguration config,
//			RoutesParser resourceRoutesCreator, Proxifier proxifier,
//			TypeCreator creator, TypeFinder finder) {
//		super(config, resourceRoutesCreator, proxifier, creator, finder);
//	}
//
//	@Override
//	public ResourceMethod parse(String uri, HttpMethod method,
//			MutableRequest request) throws MethodNotAllowedException {
//		String decoded = null;
//		try {
//			decoded = URLDecoder.decode(uri,"UTF-8");
//			decoded = Util.converteStringParaUri(decoded);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}	
//		return super.parse(decoded, method, request);
//	}
//}
