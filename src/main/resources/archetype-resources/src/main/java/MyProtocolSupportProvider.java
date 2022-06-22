#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.jetlinks.core.ProtocolSupport;
import org.jetlinks.core.defaults.CompositeProtocolSupport;
import org.jetlinks.core.message.codec.DefaultTransport;
import org.jetlinks.core.spi.ProtocolSupportProvider;
import org.jetlinks.core.spi.ServiceContext;
import reactor.core.publisher.Mono;

public class MyProtocolSupportProvider implements ProtocolSupportProvider {


    @Override
    public Mono<? extends ProtocolSupport> create(ServiceContext context) {
        CompositeProtocolSupport support = new CompositeProtocolSupport();
        support.setId("${artifactId}");
        support.setName("${artifactId}");

        //设置接入的文档说明
        support.setDocument(DefaultTransport.MQTT,
                            "document.md",
                            MyProtocolSupportProvider.class.getClassLoader());



        return Mono.just(support);
    }
}
